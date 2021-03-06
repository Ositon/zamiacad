/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import org.zamia.verilog.analysis.*;

@SuppressWarnings("nls")
public final class AP1PassSwitchtype extends PPassSwitchtype
{
    private TKRtran _kRtran_;

    public AP1PassSwitchtype()
    {
        // Constructor
    }

    public AP1PassSwitchtype(
        @SuppressWarnings("hiding") TKRtran _kRtran_)
    {
        // Constructor
        setKRtran(_kRtran_);

    }

    @Override
    public Object clone()
    {
        return new AP1PassSwitchtype(
            cloneNode(this._kRtran_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAP1PassSwitchtype(this);
    }

    public TKRtran getKRtran()
    {
        return this._kRtran_;
    }

    public void setKRtran(TKRtran node)
    {
        if(this._kRtran_ != null)
        {
            this._kRtran_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._kRtran_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._kRtran_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._kRtran_ == child)
        {
            this._kRtran_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._kRtran_ == oldChild)
        {
            setKRtran((TKRtran) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
