/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import org.zamia.verilog.analysis.*;

@SuppressWarnings("nls")
public final class AP2PathDeclaration extends PPathDeclaration
{
    private PStateDependentPathDeclaration _stateDependentPathDeclaration_;
    private TTSemicolon _tSemicolon_;

    public AP2PathDeclaration()
    {
        // Constructor
    }

    public AP2PathDeclaration(
        @SuppressWarnings("hiding") PStateDependentPathDeclaration _stateDependentPathDeclaration_,
        @SuppressWarnings("hiding") TTSemicolon _tSemicolon_)
    {
        // Constructor
        setStateDependentPathDeclaration(_stateDependentPathDeclaration_);

        setTSemicolon(_tSemicolon_);

    }

    @Override
    public Object clone()
    {
        return new AP2PathDeclaration(
            cloneNode(this._stateDependentPathDeclaration_),
            cloneNode(this._tSemicolon_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAP2PathDeclaration(this);
    }

    public PStateDependentPathDeclaration getStateDependentPathDeclaration()
    {
        return this._stateDependentPathDeclaration_;
    }

    public void setStateDependentPathDeclaration(PStateDependentPathDeclaration node)
    {
        if(this._stateDependentPathDeclaration_ != null)
        {
            this._stateDependentPathDeclaration_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._stateDependentPathDeclaration_ = node;
    }

    public TTSemicolon getTSemicolon()
    {
        return this._tSemicolon_;
    }

    public void setTSemicolon(TTSemicolon node)
    {
        if(this._tSemicolon_ != null)
        {
            this._tSemicolon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tSemicolon_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._stateDependentPathDeclaration_)
            + toString(this._tSemicolon_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._stateDependentPathDeclaration_ == child)
        {
            this._stateDependentPathDeclaration_ = null;
            return;
        }

        if(this._tSemicolon_ == child)
        {
            this._tSemicolon_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._stateDependentPathDeclaration_ == oldChild)
        {
            setStateDependentPathDeclaration((PStateDependentPathDeclaration) newChild);
            return;
        }

        if(this._tSemicolon_ == oldChild)
        {
            setTSemicolon((TTSemicolon) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
