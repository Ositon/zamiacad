/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import org.zamia.verilog.analysis.*;

@SuppressWarnings("nls")
public final class AP1ModuleInstances extends PModuleInstances
{
    private PModuleInstance _moduleInstance_;
    private TTComma _tComma_;
    private PModuleInstances _moduleInstances_;

    public AP1ModuleInstances()
    {
        // Constructor
    }

    public AP1ModuleInstances(
        @SuppressWarnings("hiding") PModuleInstance _moduleInstance_,
        @SuppressWarnings("hiding") TTComma _tComma_,
        @SuppressWarnings("hiding") PModuleInstances _moduleInstances_)
    {
        // Constructor
        setModuleInstance(_moduleInstance_);

        setTComma(_tComma_);

        setModuleInstances(_moduleInstances_);

    }

    @Override
    public Object clone()
    {
        return new AP1ModuleInstances(
            cloneNode(this._moduleInstance_),
            cloneNode(this._tComma_),
            cloneNode(this._moduleInstances_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAP1ModuleInstances(this);
    }

    public PModuleInstance getModuleInstance()
    {
        return this._moduleInstance_;
    }

    public void setModuleInstance(PModuleInstance node)
    {
        if(this._moduleInstance_ != null)
        {
            this._moduleInstance_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._moduleInstance_ = node;
    }

    public TTComma getTComma()
    {
        return this._tComma_;
    }

    public void setTComma(TTComma node)
    {
        if(this._tComma_ != null)
        {
            this._tComma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tComma_ = node;
    }

    public PModuleInstances getModuleInstances()
    {
        return this._moduleInstances_;
    }

    public void setModuleInstances(PModuleInstances node)
    {
        if(this._moduleInstances_ != null)
        {
            this._moduleInstances_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._moduleInstances_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._moduleInstance_)
            + toString(this._tComma_)
            + toString(this._moduleInstances_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._moduleInstance_ == child)
        {
            this._moduleInstance_ = null;
            return;
        }

        if(this._tComma_ == child)
        {
            this._tComma_ = null;
            return;
        }

        if(this._moduleInstances_ == child)
        {
            this._moduleInstances_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._moduleInstance_ == oldChild)
        {
            setModuleInstance((PModuleInstance) newChild);
            return;
        }

        if(this._tComma_ == oldChild)
        {
            setTComma((TTComma) newChild);
            return;
        }

        if(this._moduleInstances_ == oldChild)
        {
            setModuleInstances((PModuleInstances) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}