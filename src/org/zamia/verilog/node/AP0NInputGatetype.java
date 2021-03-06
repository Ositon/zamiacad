/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import org.zamia.verilog.analysis.*;

@SuppressWarnings("nls")
public final class AP0NInputGatetype extends PNInputGatetype
{
    private TKAnd _kAnd_;

    public AP0NInputGatetype()
    {
        // Constructor
    }

    public AP0NInputGatetype(
        @SuppressWarnings("hiding") TKAnd _kAnd_)
    {
        // Constructor
        setKAnd(_kAnd_);

    }

    @Override
    public Object clone()
    {
        return new AP0NInputGatetype(
            cloneNode(this._kAnd_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAP0NInputGatetype(this);
    }

    public TKAnd getKAnd()
    {
        return this._kAnd_;
    }

    public void setKAnd(TKAnd node)
    {
        if(this._kAnd_ != null)
        {
            this._kAnd_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._kAnd_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._kAnd_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._kAnd_ == child)
        {
            this._kAnd_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._kAnd_ == oldChild)
        {
            setKAnd((TKAnd) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
