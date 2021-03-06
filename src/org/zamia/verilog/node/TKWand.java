/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import org.zamia.verilog.analysis.*;
import org.zamia.SourceFile;

@SuppressWarnings("nls")
public final class TKWand extends Token
{
    public TKWand(int line, int pos, SourceFile sf)
    {
        super ("wand", line, pos, sf);
    }

    @Override
    public Object clone()
    {
      return new TKWand(getLine(), getPos(), getSource());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTKWand(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TKWand text.");
    }
}
