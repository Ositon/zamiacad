/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import org.zamia.verilog.analysis.*;
import org.zamia.SourceFile;

@SuppressWarnings("nls")
public final class TKEdge01 extends Token
{
    public TKEdge01(int line, int pos, SourceFile sf)
    {
        super ("01", line, pos, sf);
    }

    @Override
    public Object clone()
    {
      return new TKEdge01(getLine(), getPos(), getSource());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTKEdge01(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TKEdge01 text.");
    }
}
