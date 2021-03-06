/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import org.zamia.verilog.analysis.*;

@SuppressWarnings("nls")
public final class AP1NInputGatetype extends PNInputGatetype
{
    private TKNand _kNand_;

    public AP1NInputGatetype()
    {
        // Constructor
    }

    public AP1NInputGatetype(
        @SuppressWarnings("hiding") TKNand _kNand_)
    {
        // Constructor
        setKNand(_kNand_);

    }

    @Override
    public Object clone()
    {
        return new AP1NInputGatetype(
            cloneNode(this._kNand_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAP1NInputGatetype(this);
    }

    public TKNand getKNand()
    {
        return this._kNand_;
    }

    public void setKNand(TKNand node)
    {
        if(this._kNand_ != null)
        {
            this._kNand_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._kNand_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._kNand_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._kNand_ == child)
        {
            this._kNand_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._kNand_ == oldChild)
        {
            setKNand((TKNand) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
