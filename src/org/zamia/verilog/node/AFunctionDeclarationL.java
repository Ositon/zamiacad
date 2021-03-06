/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import org.zamia.verilog.analysis.*;

@SuppressWarnings("nls")
public final class AFunctionDeclarationL extends PFunctionDeclarationL
{
    private TTLparen _tLparen_;
    private PFunctionPortList _functionPortList_;
    private TTRparen _tRparen_;

    public AFunctionDeclarationL()
    {
        // Constructor
    }

    public AFunctionDeclarationL(
        @SuppressWarnings("hiding") TTLparen _tLparen_,
        @SuppressWarnings("hiding") PFunctionPortList _functionPortList_,
        @SuppressWarnings("hiding") TTRparen _tRparen_)
    {
        // Constructor
        setTLparen(_tLparen_);

        setFunctionPortList(_functionPortList_);

        setTRparen(_tRparen_);

    }

    @Override
    public Object clone()
    {
        return new AFunctionDeclarationL(
            cloneNode(this._tLparen_),
            cloneNode(this._functionPortList_),
            cloneNode(this._tRparen_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFunctionDeclarationL(this);
    }

    public TTLparen getTLparen()
    {
        return this._tLparen_;
    }

    public void setTLparen(TTLparen node)
    {
        if(this._tLparen_ != null)
        {
            this._tLparen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tLparen_ = node;
    }

    public PFunctionPortList getFunctionPortList()
    {
        return this._functionPortList_;
    }

    public void setFunctionPortList(PFunctionPortList node)
    {
        if(this._functionPortList_ != null)
        {
            this._functionPortList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._functionPortList_ = node;
    }

    public TTRparen getTRparen()
    {
        return this._tRparen_;
    }

    public void setTRparen(TTRparen node)
    {
        if(this._tRparen_ != null)
        {
            this._tRparen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tRparen_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tLparen_)
            + toString(this._functionPortList_)
            + toString(this._tRparen_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tLparen_ == child)
        {
            this._tLparen_ = null;
            return;
        }

        if(this._functionPortList_ == child)
        {
            this._functionPortList_ = null;
            return;
        }

        if(this._tRparen_ == child)
        {
            this._tRparen_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tLparen_ == oldChild)
        {
            setTLparen((TTLparen) newChild);
            return;
        }

        if(this._functionPortList_ == oldChild)
        {
            setFunctionPortList((PFunctionPortList) newChild);
            return;
        }

        if(this._tRparen_ == oldChild)
        {
            setTRparen((TTRparen) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
