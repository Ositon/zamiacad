/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import org.zamia.verilog.analysis.*;

@SuppressWarnings("nls")
public final class ARcmosCmosSwitchtype extends PCmosSwitchtype
{
    private TKRcmos _kRcmos_;

    public ARcmosCmosSwitchtype()
    {
        // Constructor
    }

    public ARcmosCmosSwitchtype(
        @SuppressWarnings("hiding") TKRcmos _kRcmos_)
    {
        // Constructor
        setKRcmos(_kRcmos_);

    }

    @Override
    public Object clone()
    {
        return new ARcmosCmosSwitchtype(
            cloneNode(this._kRcmos_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARcmosCmosSwitchtype(this);
    }

    public TKRcmos getKRcmos()
    {
        return this._kRcmos_;
    }

    public void setKRcmos(TKRcmos node)
    {
        if(this._kRcmos_ != null)
        {
            this._kRcmos_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._kRcmos_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._kRcmos_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._kRcmos_ == child)
        {
            this._kRcmos_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._kRcmos_ == oldChild)
        {
            setKRcmos((TKRcmos) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
