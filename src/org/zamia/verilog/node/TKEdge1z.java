/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import org.zamia.verilog.analysis.*;
import org.zamia.SourceFile;

@SuppressWarnings("nls")
public final class TKEdge1z extends Token
{
    public TKEdge1z(int line, int pos, SourceFile sf)
    {
        super ("1z", line, pos, sf);
    }

    @Override
    public Object clone()
    {
      return new TKEdge1z(getLine(), getPos(), getSource());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTKEdge1z(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TKEdge1z text.");
    }
}
