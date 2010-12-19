/* 
 * Copyright 2010 by the authors indicated in the @author tags. 
 * All rights reserved. 
 * 
 * See the LICENSE file for details.
 * 
 * Created by Guenter Bartsch on Dec 12, 2010
 */
package org.zamia.rtlng.symbols;

import org.zamia.rtlng.RTLNode;
import org.zamia.rtlng.RTLPort;
import org.zamia.rtlng.RTLSignal;
import org.zamia.rtlng.RTLValue;
import org.zamia.rtlng.nodes.RTLNLiteral;
import org.zamia.util.Position;
import org.zamia.vg.VGGC;
import org.zamia.vg.VGSymbol;
import org.zamia.vg.VGGC.VGColor;
import org.zamia.vg.VGGC.VGFont;

/**
 * 
 * @author Guenter Bartsch
 *
 */

public class RTLSymbolLiteral implements VGSymbol<RTLNode, RTLPort, RTLSignal> {

	private final String fLabel;
	private final VGGC fGC;

	public RTLSymbolLiteral (RTLNLiteral aLiteral, VGGC aGC) {
		RTLValue v = aLiteral.getValue();
		
		fLabel = v.toString();
		fGC = aGC;
	}
	
	@Override
	public int getWidth() {
		return fGC.textWidth(fLabel);
	}

	@Override
	public int getHeight() {
		fGC.setFont(VGFont.NORMAL);
		return fGC.getFontHeight();
	}

	@Override
	public Position getPortPosition(RTLPort aPort) {
		return new Position (getWidth(), getHeight()/2);
	}

	@Override
	public void tweakPortPosition(RTLPort aPort) {
	}

	@Override
	public void unTweakPortPosition(RTLPort aPort) {
	}

	@Override
	public void paint(RTLNode aModule, int aXPos, int aYPos, boolean aHilight) {
		fGC.setFont(VGFont.NORMAL);
		fGC.setForeground(VGColor.MODULE_LABEL);

		int th = fGC.getFontHeight();
		
		fGC.drawText(fLabel, aXPos, aYPos+th, true);
	}

}
