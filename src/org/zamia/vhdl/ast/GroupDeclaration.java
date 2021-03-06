/*
 * Copyright 2007-2009 by the authors indicated in the @author tags.
 * All rights reserved.
 *
 * See the LICENSE file for details.
 *
*/

package org.zamia.vhdl.ast;

import java.io.PrintStream;
import java.util.ArrayList;

import org.zamia.ZamiaException;
import org.zamia.ZamiaProject;
import org.zamia.analysis.ReferenceSearchResult;
import org.zamia.analysis.ReferenceSite;
import org.zamia.analysis.ReferenceSite.RefType;
import org.zamia.analysis.ast.SearchJob;
import org.zamia.analysis.ast.ASTReferencesSearch.ObjectCat;
import org.zamia.instgraph.IGContainer;
import org.zamia.instgraph.IGContainerItem;
import org.zamia.instgraph.IGElaborationEnv;


/**
 * 
 * @author Guenter Bartsch
 * 
 */

@SuppressWarnings("serial")
public class GroupDeclaration extends BlockDeclarativeItem {

	private Name groupTemplateName;

	public GroupDeclaration(String id_, Name n_, VHDLNode parent_, long location_) {
		super(id_, parent_, location_);
		groupTemplateName = n_;
	}

	@Override
	public int getNumChildren() {
		return 0;
	}

	@Override
	public VHDLNode getChild(int idx_) {
		return null;
	}

	@Override
	public void dump(PrintStream out_) {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "GROUP " + id + " : " + groupTemplateName;
	}

	@Override
	public void findReferences(String id_, ObjectCat category_, RefType refType_, int depth_, ZamiaProject zprj_, IGContainer aContainer, IGElaborationEnv aCache,
			ReferenceSearchResult result_, ArrayList<SearchJob> aTODO) throws ZamiaException {
		if (id_.equals(getId())) {
			result_.add(new ReferenceSite(this, RefType.Declaration));
		}
	}

	@Override
	public IGContainerItem computeIG(ArrayList<IGContainerItem> aSpecItems, IGContainer aContainer, IGElaborationEnv aCache) throws ZamiaException {
		// FIXME: implement
		throw new ZamiaException("Sorry, not implemented yet.", this);
	}

}
