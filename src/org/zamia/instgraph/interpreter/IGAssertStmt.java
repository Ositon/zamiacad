/* 
 * Copyright 2009 by the authors indicated in the @author tags. 
 * All rights reserved. 
 * 
 * See the LICENSE file for details.
 * 
 * Created by Guenter Bartsch on Jun 7, 2009
 */
package org.zamia.instgraph.interpreter;

import org.zamia.ErrorReport;
import org.zamia.SourceLocation;
import org.zamia.ZamiaException;
import org.zamia.instgraph.IGStaticValue;
import org.zamia.vhdl.ast.VHDLNode.ASTErrorMode;
import org.zamia.zdb.ZDB;


/**
 * 
 * @author Guenter Bartsch
 * 
 */
@SuppressWarnings("serial")
public class IGAssertStmt extends IGStmt {

	private boolean fHaveReport;

	private boolean fHaveSeverity;

	public IGAssertStmt(boolean aHaveReport, boolean aHaveSeverity, SourceLocation aLocation, ZDB aZDB) {
		super(aLocation, aZDB);

		fHaveReport = aHaveReport;
		fHaveSeverity = aHaveSeverity;

	}

	@Override
	public ReturnStatus execute(IGInterpreterRuntimeEnv aRuntime, ASTErrorMode aErrorMode, ErrorReport aReport) throws ZamiaException {

		IGStaticValue severity = null;
		if (fHaveSeverity) {
			severity = aRuntime.pop().getValue();
		}

		IGStaticValue report = null;
		if (fHaveReport) {
			report = aRuntime.pop().getValue();
		}
		
		IGStaticValue op = aRuntime.pop().getValue();
		
		if (!op.isTrue()) {
			
			// by VHDL LRM, error level = ERROR (0-note, 1-warn, 2-error, 3-failure)
			String reportStr = ((severity != null) ? severity : "ERROR") + ": ";
			int severityLevel = (severity != null) ? severity.getEnumOrd() : 2;
			reportStr += report != null ? report.toString() : "Assertion failed.";
			logger.log(severityLevel, reportStr, computeSourceLocation());
		}
		
		return ReturnStatus.CONTINUE;
	}

	@Override
	public String toString() {
		return "ASSERT";
	}

}
