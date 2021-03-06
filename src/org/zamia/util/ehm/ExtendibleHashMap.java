/* 
 * Copyright 2010 by the authors indicated in the @author tags. 
 * All rights reserved. 
 * 
 * See the LICENSE file for details.
 * 
 * Created by Guenter Bartsch on Jan 27, 2010
 */

package org.zamia.util.ehm;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.zamia.ExceptionLogger;
import org.zamia.ZamiaLogger;
import org.zamia.util.LLFSHashMap;
import org.zamia.zdb.ZDB;


/**
 * 
 * @author Guenter Bartsch
 *
 */

public class ExtendibleHashMap {

	public final static ZamiaLogger logger = ZamiaLogger.getInstance();

	public final static ExceptionLogger el = ExceptionLogger.getInstance();

	private EHMNode fRoot;

	private final EHMPageManager fManager;

	private final File fFile;

	public ExtendibleHashMap(EHMPageManager aManager, File aFile) {

		fManager = aManager;
		fFile = aFile;

		if (fFile.exists() && fFile.canRead())
			try {
				ObjectInputStream in = new ObjectInputStream(ZDB.openInputStream(fFile));

				try {
					fRoot = loadNodes(in, null);
				} finally {
					ZDB.safeClose(in);
				}
			} catch (IOException e) {
				el.logException(e);
			}
		

		if (fRoot == null) {
			clear();
		}
	}

	private EHMNode loadNodes(DataInput aIn, EHMNode aParent) throws IOException {

		long id = aIn.readLong();

		EHMNode node = new EHMNode(id, aParent);

		if (id == -1) {

			node.setOneNode(loadNodes(aIn, node));
			node.setZeroNode(loadNodes(aIn, node));

		}

		return node;
	}

	public void clear() {
		long rootId = fManager.alloc();
		LLFSHashMap page = new LLFSHashMap(EHMPageManager.PAGE_ENTRIES);
		fManager.store(rootId, page);
		fRoot = new EHMNode(rootId, null);
	}

	private boolean getBit(long aKey, int aBitIdx) {
		return (aKey & (1 << aBitIdx)) != 0;
	}

	public synchronized void put(long aKey, long aValue) {

		LLFSHashMap page = null;

		int bitIdx = 0;

		EHMNode node = fRoot;

		while (page == null) {

			long id = node.getId();

			if (id >= 0) {

				page = fManager.load(id);

			} else {

				boolean bit = getBit(aKey, bitIdx);

				bitIdx++;
				node = bit ? node.getOneNode() : node.getZeroNode();
			}
		}

		page.put(aKey, aValue);

		int n = page.size();
		if (n > EHMPageManager.PAGE_ENTRIES) {

			LLFSHashMap zeroPage = new LLFSHashMap(EHMPageManager.PAGE_ENTRIES);
			LLFSHashMap onePage = new LLFSHashMap(EHMPageManager.PAGE_ENTRIES);

			int m = page.getAllocedSize();
			for (int j = 0; j<m; j++) {

				if (page.getFree(j)) {
					continue;
				}
				
				long k = page.getKey(j);

				if (getBit(k, bitIdx)) {
					onePage.put(k, page.getValue(j));
				} else {
					zeroPage.put(k, page.getValue(j));
				}
			}

			//logger.info("ExtendibleHashMap: Did split. %d : %d keys.", onePage.size(), zeroPage.size());

			long oneId = node.getId(); // we will recycle that page
			long zeroId = fManager.alloc();

			fManager.store(oneId, onePage);
			fManager.store(zeroId, zeroPage);

			EHMNode oneNode = new EHMNode(node.getId(), node);
			EHMNode zeroNode = new EHMNode(zeroId, node);

			node.setId(-1);
			node.setOneNode(oneNode);
			node.setZeroNode(zeroNode);

		} else {

			fManager.store(node.getId(), page);

		}
	}

	public synchronized long get(long aKey) {

		LLFSHashMap page = null;

		int bitIdx = 0;

		EHMNode node = fRoot;

		while (page == null) {

			long id = node.getId();

			if (id >= 0) {

				page = fManager.load(id);

			} else {

				boolean bit = getBit(aKey, bitIdx);

				bitIdx++;
				node = bit ? node.getOneNode() : node.getZeroNode();
			}
		}

		if (page != null) {
			Long l = page.get(aKey);
			if (l != null) {
				return l.longValue();
			}
		}

		return -1;
	}

	public void flush() {
		try {
			ObjectOutputStream out = ZDB.openObjectOutputStream(fFile);
			try {
				saveNodes(out, fRoot);
			} finally {
				ZDB.safeClose(out);
			}

		} catch (Throwable t) {
			el.logException(t);
		} 

	}

	private void saveNodes(DataOutput aOut, EHMNode aNode) throws IOException {

		long id = aNode.getId();

		aOut.writeLong(id);

		if (id == -1) {
			saveNodes(aOut, aNode.getOneNode());
			saveNodes(aOut, aNode.getZeroNode());
		}
	}

	public void delete(long aId) {
		// FIXME: implement.
	}
	
	public EHMIterator keyIterator() {

		EHMIterator it = new EHMIterator(this, true);
		
		return it;
	}

	public EHMIterator valueIterator() {

		EHMIterator it = new EHMIterator(this, false);
		
		return it;
	}

	/*
	 * iterator support:
	 */
	
	EHMNode getRootNode() {
		return fRoot;
	}

	EHMPageManager getManager() {
		return fManager;
	}

}
