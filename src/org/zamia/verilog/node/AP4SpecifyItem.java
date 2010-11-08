/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import org.zamia.verilog.analysis.*;

@SuppressWarnings("nls")
public final class AP4SpecifyItem extends PSpecifyItem
{
    private PSystemTimingCheck _systemTimingCheck_;

    public AP4SpecifyItem()
    {
        // Constructor
    }

    public AP4SpecifyItem(
        @SuppressWarnings("hiding") PSystemTimingCheck _systemTimingCheck_)
    {
        // Constructor
        setSystemTimingCheck(_systemTimingCheck_);

    }

    @Override
    public Object clone()
    {
        return new AP4SpecifyItem(
            cloneNode(this._systemTimingCheck_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAP4SpecifyItem(this);
    }

    public PSystemTimingCheck getSystemTimingCheck()
    {
        return this._systemTimingCheck_;
    }

    public void setSystemTimingCheck(PSystemTimingCheck node)
    {
        if(this._systemTimingCheck_ != null)
        {
            this._systemTimingCheck_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._systemTimingCheck_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._systemTimingCheck_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._systemTimingCheck_ == child)
        {
            this._systemTimingCheck_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._systemTimingCheck_ == oldChild)
        {
            setSystemTimingCheck((PSystemTimingCheck) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
