/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import org.zamia.verilog.analysis.*;

@SuppressWarnings("nls")
public final class AP1ListOfPathDescriptors extends PListOfPathDescriptors
{
    private PSpecifyTerminalDescriptor _specifyTerminalDescriptor_;

    public AP1ListOfPathDescriptors()
    {
        // Constructor
    }

    public AP1ListOfPathDescriptors(
        @SuppressWarnings("hiding") PSpecifyTerminalDescriptor _specifyTerminalDescriptor_)
    {
        // Constructor
        setSpecifyTerminalDescriptor(_specifyTerminalDescriptor_);

    }

    @Override
    public Object clone()
    {
        return new AP1ListOfPathDescriptors(
            cloneNode(this._specifyTerminalDescriptor_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAP1ListOfPathDescriptors(this);
    }

    public PSpecifyTerminalDescriptor getSpecifyTerminalDescriptor()
    {
        return this._specifyTerminalDescriptor_;
    }

    public void setSpecifyTerminalDescriptor(PSpecifyTerminalDescriptor node)
    {
        if(this._specifyTerminalDescriptor_ != null)
        {
            this._specifyTerminalDescriptor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._specifyTerminalDescriptor_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._specifyTerminalDescriptor_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._specifyTerminalDescriptor_ == child)
        {
            this._specifyTerminalDescriptor_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._specifyTerminalDescriptor_ == oldChild)
        {
            setSpecifyTerminalDescriptor((PSpecifyTerminalDescriptor) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
