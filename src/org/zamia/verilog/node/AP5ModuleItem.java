/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import org.zamia.verilog.analysis.*;

@SuppressWarnings("nls")
public final class AP5ModuleItem extends PModuleItem
{
    private PGateInstantiation _gateInstantiation_;

    public AP5ModuleItem()
    {
        // Constructor
    }

    public AP5ModuleItem(
        @SuppressWarnings("hiding") PGateInstantiation _gateInstantiation_)
    {
        // Constructor
        setGateInstantiation(_gateInstantiation_);

    }

    @Override
    public Object clone()
    {
        return new AP5ModuleItem(
            cloneNode(this._gateInstantiation_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAP5ModuleItem(this);
    }

    public PGateInstantiation getGateInstantiation()
    {
        return this._gateInstantiation_;
    }

    public void setGateInstantiation(PGateInstantiation node)
    {
        if(this._gateInstantiation_ != null)
        {
            this._gateInstantiation_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._gateInstantiation_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._gateInstantiation_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._gateInstantiation_ == child)
        {
            this._gateInstantiation_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._gateInstantiation_ == oldChild)
        {
            setGateInstantiation((PGateInstantiation) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
