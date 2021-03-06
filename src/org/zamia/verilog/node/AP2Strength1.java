/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import org.zamia.verilog.analysis.*;

@SuppressWarnings("nls")
public final class AP2Strength1 extends PStrength1
{
    private TKPull1 _kPull1_;

    public AP2Strength1()
    {
        // Constructor
    }

    public AP2Strength1(
        @SuppressWarnings("hiding") TKPull1 _kPull1_)
    {
        // Constructor
        setKPull1(_kPull1_);

    }

    @Override
    public Object clone()
    {
        return new AP2Strength1(
            cloneNode(this._kPull1_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAP2Strength1(this);
    }

    public TKPull1 getKPull1()
    {
        return this._kPull1_;
    }

    public void setKPull1(TKPull1 node)
    {
        if(this._kPull1_ != null)
        {
            this._kPull1_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._kPull1_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._kPull1_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._kPull1_ == child)
        {
            this._kPull1_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._kPull1_ == oldChild)
        {
            setKPull1((TKPull1) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
