/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import org.zamia.verilog.analysis.*;
import org.zamia.SourceFile;

@SuppressWarnings("nls")
public final class TKSupply0 extends Token
{
    public TKSupply0(int line, int pos, SourceFile sf)
    {
        super ("supply0", line, pos, sf);
    }

    @Override
    public Object clone()
    {
      return new TKSupply0(getLine(), getPos(), getSource());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTKSupply0(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TKSupply0 text.");
    }
}
