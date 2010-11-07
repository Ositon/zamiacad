/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import org.zamia.verilog.analysis.*;

@SuppressWarnings("nls")
public final class AP1PathDelayValue extends PPathDelayValue
{
    private TTLparen _tLparen_;
    private PListOfPathDelayExpressions _listOfPathDelayExpressions_;
    private TTRparen _tRparen_;

    public AP1PathDelayValue()
    {
        // Constructor
    }

    public AP1PathDelayValue(
        @SuppressWarnings("hiding") TTLparen _tLparen_,
        @SuppressWarnings("hiding") PListOfPathDelayExpressions _listOfPathDelayExpressions_,
        @SuppressWarnings("hiding") TTRparen _tRparen_)
    {
        // Constructor
        setTLparen(_tLparen_);

        setListOfPathDelayExpressions(_listOfPathDelayExpressions_);

        setTRparen(_tRparen_);

    }

    @Override
    public Object clone()
    {
        return new AP1PathDelayValue(
            cloneNode(this._tLparen_),
            cloneNode(this._listOfPathDelayExpressions_),
            cloneNode(this._tRparen_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAP1PathDelayValue(this);
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

    public PListOfPathDelayExpressions getListOfPathDelayExpressions()
    {
        return this._listOfPathDelayExpressions_;
    }

    public void setListOfPathDelayExpressions(PListOfPathDelayExpressions node)
    {
        if(this._listOfPathDelayExpressions_ != null)
        {
            this._listOfPathDelayExpressions_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._listOfPathDelayExpressions_ = node;
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
            + toString(this._listOfPathDelayExpressions_)
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

        if(this._listOfPathDelayExpressions_ == child)
        {
            this._listOfPathDelayExpressions_ = null;
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

        if(this._listOfPathDelayExpressions_ == oldChild)
        {
            setListOfPathDelayExpressions((PListOfPathDelayExpressions) newChild);
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