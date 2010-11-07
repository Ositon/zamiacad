/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import org.zamia.verilog.analysis.*;

@SuppressWarnings("nls")
public final class AP21BinaryOperator extends PBinaryOperator
{
    private TTRs _tRs_;

    public AP21BinaryOperator()
    {
        // Constructor
    }

    public AP21BinaryOperator(
        @SuppressWarnings("hiding") TTRs _tRs_)
    {
        // Constructor
        setTRs(_tRs_);

    }

    @Override
    public Object clone()
    {
        return new AP21BinaryOperator(
            cloneNode(this._tRs_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAP21BinaryOperator(this);
    }

    public TTRs getTRs()
    {
        return this._tRs_;
    }

    public void setTRs(TTRs node)
    {
        if(this._tRs_ != null)
        {
            this._tRs_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tRs_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tRs_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tRs_ == child)
        {
            this._tRs_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tRs_ == oldChild)
        {
            setTRs((TTRs) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}