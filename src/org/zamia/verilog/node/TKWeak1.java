/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import org.zamia.verilog.analysis.*;
import org.zamia.SourceFile;

@SuppressWarnings("nls")
public final class TKWeak1 extends Token
{
    public TKWeak1(int line, int pos, SourceFile sf)
    {
        super ("weak1", line, pos, sf);
    }

    @Override
    public Object clone()
    {
      return new TKWeak1(getLine(), getPos(), getSource());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTKWeak1(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TKWeak1 text.");
    }
}
