/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import org.zamia.verilog.analysis.*;

@SuppressWarnings("nls")
public final class AP9SystemTimingCheck extends PSystemTimingCheck
{
    private PPeriodTimingCheck _periodTimingCheck_;

    public AP9SystemTimingCheck()
    {
        // Constructor
    }

    public AP9SystemTimingCheck(
        @SuppressWarnings("hiding") PPeriodTimingCheck _periodTimingCheck_)
    {
        // Constructor
        setPeriodTimingCheck(_periodTimingCheck_);

    }

    @Override
    public Object clone()
    {
        return new AP9SystemTimingCheck(
            cloneNode(this._periodTimingCheck_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAP9SystemTimingCheck(this);
    }

    public PPeriodTimingCheck getPeriodTimingCheck()
    {
        return this._periodTimingCheck_;
    }

    public void setPeriodTimingCheck(PPeriodTimingCheck node)
    {
        if(this._periodTimingCheck_ != null)
        {
            this._periodTimingCheck_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._periodTimingCheck_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._periodTimingCheck_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._periodTimingCheck_ == child)
        {
            this._periodTimingCheck_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._periodTimingCheck_ == oldChild)
        {
            setPeriodTimingCheck((PPeriodTimingCheck) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
