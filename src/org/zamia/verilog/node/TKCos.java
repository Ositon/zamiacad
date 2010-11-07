/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import org.zamia.verilog.analysis.*;
import org.zamia.SourceFile;

@SuppressWarnings("nls")
public final class TKCos extends Token
{
    public TKCos(int line, int pos, SourceFile sf)
    {
        super ("cos", line, pos, sf);
    }

    @Override
    public Object clone()
    {
      return new TKCos(getLine(), getPos(), getSource());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTKCos(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TKCos text.");
    }
}