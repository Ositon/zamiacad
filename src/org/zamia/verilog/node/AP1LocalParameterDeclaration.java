/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import org.zamia.verilog.analysis.*;

@SuppressWarnings("nls")
public final class AP1LocalParameterDeclaration extends PLocalParameterDeclaration
{
    private TKLocalparam _kLocalparam_;
    private PParameterType _parameterType_;
    private PListOfParamAssignments _listOfParamAssignments_;

    public AP1LocalParameterDeclaration()
    {
        // Constructor
    }

    public AP1LocalParameterDeclaration(
        @SuppressWarnings("hiding") TKLocalparam _kLocalparam_,
        @SuppressWarnings("hiding") PParameterType _parameterType_,
        @SuppressWarnings("hiding") PListOfParamAssignments _listOfParamAssignments_)
    {
        // Constructor
        setKLocalparam(_kLocalparam_);

        setParameterType(_parameterType_);

        setListOfParamAssignments(_listOfParamAssignments_);

    }

    @Override
    public Object clone()
    {
        return new AP1LocalParameterDeclaration(
            cloneNode(this._kLocalparam_),
            cloneNode(this._parameterType_),
            cloneNode(this._listOfParamAssignments_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAP1LocalParameterDeclaration(this);
    }

    public TKLocalparam getKLocalparam()
    {
        return this._kLocalparam_;
    }

    public void setKLocalparam(TKLocalparam node)
    {
        if(this._kLocalparam_ != null)
        {
            this._kLocalparam_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._kLocalparam_ = node;
    }

    public PParameterType getParameterType()
    {
        return this._parameterType_;
    }

    public void setParameterType(PParameterType node)
    {
        if(this._parameterType_ != null)
        {
            this._parameterType_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parameterType_ = node;
    }

    public PListOfParamAssignments getListOfParamAssignments()
    {
        return this._listOfParamAssignments_;
    }

    public void setListOfParamAssignments(PListOfParamAssignments node)
    {
        if(this._listOfParamAssignments_ != null)
        {
            this._listOfParamAssignments_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._listOfParamAssignments_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._kLocalparam_)
            + toString(this._parameterType_)
            + toString(this._listOfParamAssignments_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._kLocalparam_ == child)
        {
            this._kLocalparam_ = null;
            return;
        }

        if(this._parameterType_ == child)
        {
            this._parameterType_ = null;
            return;
        }

        if(this._listOfParamAssignments_ == child)
        {
            this._listOfParamAssignments_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._kLocalparam_ == oldChild)
        {
            setKLocalparam((TKLocalparam) newChild);
            return;
        }

        if(this._parameterType_ == oldChild)
        {
            setParameterType((PParameterType) newChild);
            return;
        }

        if(this._listOfParamAssignments_ == oldChild)
        {
            setListOfParamAssignments((PListOfParamAssignments) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
