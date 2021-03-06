/* 
 * Copyright 2007-2010 by the authors indicated in the @author tags. 
 * All rights reserved. 
 * 
 * See the LICENSE file for details.
 */

package org.zamia.instgraph.sim.annotations;

import org.apache.log4j.Level;
import org.junit.Test;
import org.zamia.DMManager;
import org.zamia.ERManager;
import org.zamia.ExceptionLogger;
import org.zamia.SourceFile;
import org.zamia.Toplevel;
import org.zamia.ToplevelPath;
import org.zamia.ZamiaException;
import org.zamia.ZamiaLogger;
import org.zamia.ZamiaProject;
import org.zamia.ZamiaProjectBuilder;
import org.zamia.instgraph.sim.vcd.VCDImport;
import org.zamia.util.HashSetArray;
import org.zamia.util.PathName;
import org.zamia.vhdl.ast.DMUID;

import java.io.File;
import java.math.BigInteger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


/**
 * @author Guenter Bartsch
 */
public class AnnotationsTest {

	public final static ZamiaLogger logger = ZamiaLogger.getInstance();

	public final static ExceptionLogger el = ExceptionLogger.getInstance();

	private ZamiaProject fZPrj;

	private ERManager fERM;

	private DMManager fDUM;

	private VCDImport fImport;

	private void setupTest(String aTestDir, int aNumNodes, String aToplevel, String aVCDFile) throws Exception {
		ZamiaLogger.setup(Level.DEBUG);

		File f = new File(aTestDir + "/BuildPath.txt");

		assertTrue(f.exists());

		SourceFile sf = new SourceFile(f);

		fZPrj = new ZamiaProject("IG Test Tmp Project", aTestDir, sf, null);
		fZPrj.clean();
		fERM = fZPrj.getERM();
		fDUM = fZPrj.getDUM();

		ZamiaProjectBuilder builder = fZPrj.getBuilder();

		builder.build(true, true, null);

		DMUID duuid = DMUID.parse(aToplevel);

		duuid = fDUM.getArchDUUID(duuid);

		assertNotNull(duuid);

		int n = fERM.getNumErrors();
		logger.error("IGTest: Build finished. Found %d errors.", n);

		for (int i = 0; i < n; i++) {
			ZamiaException em = fERM.getError(i);
			logger.error("IGTest: error %6d/%6d: %s", i + 1, n, em.toString());
		}

		assertEquals(0, n);

		n = fZPrj.getIGM().countNodes(duuid);
		logger.info("IGTest: elaborated model for %s has %d unique modules.", duuid, n);
		assertEquals(aNumNodes, n);

		/*
		 * load sim data from VCD file
		 */

		Toplevel tl = new Toplevel(duuid, null);

		fImport = new VCDImport();

		ToplevelPath tlp = new ToplevelPath(tl, new PathName(""));

		fImport.open(tlp, new File(aVCDFile), null, fZPrj);
	}

	@Test
	public void testCounter() throws Exception {
		setupTest("examples/gcounter", 19, "COUNTER_TB", "examples/vcd/gcounter_tb.vcd");

		assertNotNull(fImport);

		SourceFile sf = new SourceFile(new File("examples/gcounter/addg.vhdl"));

		ToplevelPath tlp = new ToplevelPath("WORK.COUNTER_TB:COUNTER0.ADDG.");

		IGSimAnnotator ann = new IGSimAnnotator(fZPrj);

		ann.genAnnotationsEnv(sf, tlp, fImport, BigInteger.ZERO);

		HashSetArray<IGSimAnnotation> anns = ann.genAnnotations();

		int n = anns.size();
		for (int i = 0; i < n; i++) {
			logger.info("AnnotationsTest: Annotation #%3d/%3d: %s", i + 1, n, anns.get(i));
		}


		fZPrj.shutdown();
	}

//	public void testPlasma() throws Exception {
//		setupTest("examples/plasma", 11, "CPU_TB", "test/vcd/plasma_tb.vcd");
//
//		assertNotNull(fImport);
//
//		fZPrj.shutdown();
//	}

}
