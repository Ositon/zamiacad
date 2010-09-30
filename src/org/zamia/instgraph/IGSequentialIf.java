/* 
 * Copyright 2009 by the authors indicated in the @author tags. 
 * All rights reserved. 
 * 
 * See the LICENSE file for details.
 * 
 * Created by Guenter Bartsch on May 23, 2009
 */
package org.zamia.instgraph;

import org.zamia.SourceLocation;
import org.zamia.ZamiaException;
import org.zamia.instgraph.IGItemAccess.AccessType;
import org.zamia.instgraph.interpreter.IGInterpreterCode;
import org.zamia.instgraph.interpreter.IGJumpNCStmt;
import org.zamia.instgraph.interpreter.IGJumpStmt;
import org.zamia.instgraph.interpreter.IGLabel;
import org.zamia.util.HashSetArray;
import org.zamia.zdb.ZDB;


/**
 * 
 * @author Guenter Bartsch
 * 
 */

@SuppressWarnings("serial")
public class IGSequentialIf extends IGSequentialStatement {

	private IGSequenceOfStatements fThenSOS;

	private IGSequenceOfStatements fElseSOS;

	private IGOperation fCond;

	public IGSequentialIf(IGOperation aCondition, IGSequenceOfStatements aThenSOS, String aId, SourceLocation aSrc, ZDB aZDB) {
		super(aId, aSrc, aZDB);

		fThenSOS = aThenSOS;
		fCond = aCondition;
	}

	public void setElse(IGSequenceOfStatements aElseSOS) {
		fElseSOS = aElseSOS;
	}

	@Override
	public void computeAccessedItems(IGItem aFilterItem, AccessType aFilterType, int aDepth, HashSetArray<IGItemAccess> aAccessedItems) {

		fCond.computeAccessedItems(false, aFilterItem, aFilterType, aDepth, aAccessedItems);
		fThenSOS.computeAccessedItems(aFilterItem, aFilterType, aDepth, aAccessedItems);
		if (fElseSOS != null) {
			fElseSOS.computeAccessedItems(aFilterItem, aFilterType, aDepth, aAccessedItems);
		}

	}

	@Override
	public void generateCode(IGInterpreterCode aCode) throws ZamiaException {
		IGLabel elseLabel = new IGLabel();
		IGLabel endLabel = new IGLabel();

		fCond.generateCode(true, aCode);

		if (fElseSOS != null)
			aCode.add(new IGJumpNCStmt(elseLabel, computeSourceLocation(), getZDB()));
		else
			aCode.add(new IGJumpNCStmt(endLabel, computeSourceLocation(), getZDB()));

		fThenSOS.generateCode(aCode);

		if (fElseSOS != null) {
			aCode.add(new IGJumpStmt(endLabel, computeSourceLocation(), getZDB()));
			aCode.defineLabel(elseLabel);
			fElseSOS.generateCode(aCode);
		}

		aCode.defineLabel(endLabel);
	}

	@Override
	public IGItem getChild(int aIdx) {
		switch (aIdx) {
		case 0:
			return fThenSOS;
		case 1:
			return fElseSOS;
		}
		return fCond;
	}

	@Override
	public int getNumChildren() {
		return 3;
	}

	@Override
	public String toString() {
		return "IF " + fCond + " THEN " + fThenSOS + " ELSE " + fElseSOS;
	}

}