/* 
 * Copyright 2010,2011 by the authors indicated in the @author tags. 
 * All rights reserved. 
 * 
 * See the LICENSE file for details.
 * 
 * Created by Guenter Bartsch on Nov 23, 2010
 */
package org.zamia.instgraph.synth.adapters;

import org.zamia.SourceLocation;
import org.zamia.ZamiaException;
import org.zamia.instgraph.IGOperation;
import org.zamia.instgraph.IGStaticValue;
import org.zamia.instgraph.IGType;
import org.zamia.instgraph.synth.IGObjectRemapping;
import org.zamia.instgraph.synth.IGOperationSynthAdapter;
import org.zamia.instgraph.synth.IGSynth;
import org.zamia.instgraph.synth.model.IGSMExprNode;
import org.zamia.instgraph.synth.model.IGSMExprNodeValue;
import org.zamia.instgraph.synth.model.IGSMSequenceOfStatements;
import org.zamia.rtl.RTLManager;
import org.zamia.rtl.RTLType;
import org.zamia.rtl.RTLValue;
import org.zamia.rtl.RTLValueBuilder;
import org.zamia.rtl.RTLValue.BitValue;

/**
 * 
 * @author Guenter Bartsch
 *
 */

public class IGSAStaticValue extends IGOperationSynthAdapter {

	@Override
	public IGSMExprNode preprocess(IGOperation aOperation, IGObjectRemapping aOR, IGSMSequenceOfStatements aPreprocessedSOS, IGSynth aSynth) throws ZamiaException {
		IGStaticValue sv = (IGStaticValue) aOperation;

		SourceLocation location = sv.computeSourceLocation();

		IGType igt = sv.getType();

		RTLType rtlt = aSynth.synthesizeType(igt);

		RTLValueBuilder b = new RTLValueBuilder(rtlt, location, aSynth.getZDB());

		switch (rtlt.getCat()) {
		case BIT:

			switch (sv.computeBit()) {
			case '0':
				b.setBit(BitValue.BV_0);
				break;
			case '1':
				b.setBit(BitValue.BV_1);
				break;
			case 'U':
				b.setBit(BitValue.BV_U);
				break;
			case 'X':
				b.setBit(BitValue.BV_X);
				break;
			case 'Z':
				b.setBit(BitValue.BV_Z);
				break;
			default:
				// FIXME: implement
				throw new ZamiaException("Sorry, not implemented yet.");
			}

			break;

		case ARRAY:

			switch (igt.getCat()) {
			case INTEGER:
				long l = sv.getOrd();

				int low = rtlt.getArrayLow();
				int high = rtlt.getArrayHigh();
				int c = high - low + 1;

				RTLManager rtlm = aSynth.getRTLM();

				RTLType bitType = rtlm.getBitType();

				RTLValueBuilder b2 = new RTLValueBuilder(bitType, location, aSynth.getZDB());
				b2.setBit(BitValue.BV_0);
				RTLValue bit0 = b2.buildValue();
				b2 = new RTLValueBuilder(bitType, location, aSynth.getZDB());
				b2.setBit(BitValue.BV_1);
				RTLValue bit1 = b2.buildValue();

				int mask = 1;
				for (int i = 0; i < c; i++) {

					b.set(i + low, (l & mask) != 0 ? bit1 : bit0, location);

					mask = mask << 1;

				}

				break;
			default:
				// FIXME: implement
				throw new ZamiaException("Sorry, not implemented yet.");
			}

			break;

		default:
			// FIXME: implement
			throw new ZamiaException("Sorry, not implemented yet.");
		}

		RTLValue rtlv = b.buildValue();

		return new IGSMExprNodeValue(rtlv, location, aSynth);
	}

}
