/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import org.zamia.verilog.analysis.*;

@SuppressWarnings("nls")
public final class AP4ModuleOrGenerateItemDeclaration extends PModuleOrGenerateItemDeclaration
{
    private PTimeDeclaration _timeDeclaration_;

    public AP4ModuleOrGenerateItemDeclaration()
    {
        // Constructor
    }

    public AP4ModuleOrGenerateItemDeclaration(
        @SuppressWarnings("hiding") PTimeDeclaration _timeDeclaration_)
    {
        // Constructor
        setTimeDeclaration(_timeDeclaration_);

    }

    @Override
    public Object clone()
    {
        return new AP4ModuleOrGenerateItemDeclaration(
            cloneNode(this._timeDeclaration_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAP4ModuleOrGenerateItemDeclaration(this);
    }

    public PTimeDeclaration getTimeDeclaration()
    {
        return this._timeDeclaration_;
    }

    public void setTimeDeclaration(PTimeDeclaration node)
    {
        if(this._timeDeclaration_ != null)
        {
            this._timeDeclaration_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._timeDeclaration_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._timeDeclaration_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._timeDeclaration_ == child)
        {
            this._timeDeclaration_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._timeDeclaration_ == oldChild)
        {
            setTimeDeclaration((PTimeDeclaration) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
