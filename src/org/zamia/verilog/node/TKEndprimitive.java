/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import org.zamia.verilog.analysis.*;
import org.zamia.SourceFile;

@SuppressWarnings("nls")
public final class TKEndprimitive extends Token
{
    public TKEndprimitive(int line, int pos, SourceFile sf)
    {
        super ("endprimitive", line, pos, sf);
    }

    @Override
    public Object clone()
    {
      return new TKEndprimitive(getLine(), getPos(), getSource());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTKEndprimitive(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TKEndprimitive text.");
    }
}