/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import org.zamia.verilog.analysis.*;

@SuppressWarnings("nls")
public final class AP1SystemTimingCheck extends PSystemTimingCheck
{
    private PHoldTimingCheck _holdTimingCheck_;

    public AP1SystemTimingCheck()
    {
        // Constructor
    }

    public AP1SystemTimingCheck(
        @SuppressWarnings("hiding") PHoldTimingCheck _holdTimingCheck_)
    {
        // Constructor
        setHoldTimingCheck(_holdTimingCheck_);

    }

    @Override
    public Object clone()
    {
        return new AP1SystemTimingCheck(
            cloneNode(this._holdTimingCheck_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAP1SystemTimingCheck(this);
    }

    public PHoldTimingCheck getHoldTimingCheck()
    {
        return this._holdTimingCheck_;
    }

    public void setHoldTimingCheck(PHoldTimingCheck node)
    {
        if(this._holdTimingCheck_ != null)
        {
            this._holdTimingCheck_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._holdTimingCheck_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._holdTimingCheck_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._holdTimingCheck_ == child)
        {
            this._holdTimingCheck_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._holdTimingCheck_ == oldChild)
        {
            setHoldTimingCheck((PHoldTimingCheck) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
