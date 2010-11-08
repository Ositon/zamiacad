/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import org.zamia.verilog.analysis.*;

@SuppressWarnings("nls")
public final class AP0SystemTimingCheck extends PSystemTimingCheck
{
    private PSetupTimingCheck _setupTimingCheck_;

    public AP0SystemTimingCheck()
    {
        // Constructor
    }

    public AP0SystemTimingCheck(
        @SuppressWarnings("hiding") PSetupTimingCheck _setupTimingCheck_)
    {
        // Constructor
        setSetupTimingCheck(_setupTimingCheck_);

    }

    @Override
    public Object clone()
    {
        return new AP0SystemTimingCheck(
            cloneNode(this._setupTimingCheck_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAP0SystemTimingCheck(this);
    }

    public PSetupTimingCheck getSetupTimingCheck()
    {
        return this._setupTimingCheck_;
    }

    public void setSetupTimingCheck(PSetupTimingCheck node)
    {
        if(this._setupTimingCheck_ != null)
        {
            this._setupTimingCheck_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._setupTimingCheck_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._setupTimingCheck_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._setupTimingCheck_ == child)
        {
            this._setupTimingCheck_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._setupTimingCheck_ == oldChild)
        {
            setSetupTimingCheck((PSetupTimingCheck) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
