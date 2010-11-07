/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import org.zamia.verilog.analysis.*;
import org.zamia.SourceFile;

@SuppressWarnings("nls")
public final class TKSskew extends Token
{
    public TKSskew(int line, int pos, SourceFile sf)
    {
        super ("$skew", line, pos, sf);
    }

    @Override
    public Object clone()
    {
      return new TKSskew(getLine(), getPos(), getSource());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTKSskew(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TKSskew text.");
    }
}