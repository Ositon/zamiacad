/* 
 * Copyright 2009 by the authors indicated in the @author tags. 
 * All rights reserved. 
 * 
 * See the LICENSE file for details.
 * 
 * Created by Guenter Bartsch on Jun 18, 2009
 */
package org.zamia.instgraph.interpreter;

import org.zamia.ErrorReport;
import org.zamia.SourceLocation;
import org.zamia.ZamiaException;
import org.zamia.instgraph.IGType;
import org.zamia.vhdl.ast.VHDLNode.ASTErrorMode;
import org.zamia.zdb.ZDB;


/**
 * 
 * @author Guenter Bartsch
 * 
 */

@SuppressWarnings("serial")
public class IGAllocateOpStmt extends IGOpStmt {

	public IGAllocateOpStmt(boolean aHaveInitialValue, IGType aResultType, SourceLocation aLocation, ZDB aZDB) {
		super(aResultType, aLocation, aZDB);
	}

	@Override
	public ReturnStatus execute(IGInterpreterRuntimeEnv aRuntime, ASTErrorMode aErrorMode, ErrorReport aReport) throws ZamiaException {
		// FIXME
		throw new ZamiaException("Sorry, not implemented yet.");
	}

	@Override
	public String toString() {
		return "ALLOCATE " + getType();
	}
}
