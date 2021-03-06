/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import org.zamia.verilog.analysis.*;

@SuppressWarnings("nls")
public final class ANamedParameterAssignment extends PNamedParameterAssignment
{
    private TTPeriod _tPeriod_;
    private PIdentifier _identifier_;
    private TTLparen _tLparen_;
    private PMintypmaxExpression _mintypmaxExpression_;
    private TTRparen _tRparen_;

    public ANamedParameterAssignment()
    {
        // Constructor
    }

    public ANamedParameterAssignment(
        @SuppressWarnings("hiding") TTPeriod _tPeriod_,
        @SuppressWarnings("hiding") PIdentifier _identifier_,
        @SuppressWarnings("hiding") TTLparen _tLparen_,
        @SuppressWarnings("hiding") PMintypmaxExpression _mintypmaxExpression_,
        @SuppressWarnings("hiding") TTRparen _tRparen_)
    {
        // Constructor
        setTPeriod(_tPeriod_);

        setIdentifier(_identifier_);

        setTLparen(_tLparen_);

        setMintypmaxExpression(_mintypmaxExpression_);

        setTRparen(_tRparen_);

    }

    @Override
    public Object clone()
    {
        return new ANamedParameterAssignment(
            cloneNode(this._tPeriod_),
            cloneNode(this._identifier_),
            cloneNode(this._tLparen_),
            cloneNode(this._mintypmaxExpression_),
            cloneNode(this._tRparen_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANamedParameterAssignment(this);
    }

    public TTPeriod getTPeriod()
    {
        return this._tPeriod_;
    }

    public void setTPeriod(TTPeriod node)
    {
        if(this._tPeriod_ != null)
        {
            this._tPeriod_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tPeriod_ = node;
    }

    public PIdentifier getIdentifier()
    {
        return this._identifier_;
    }

    public void setIdentifier(PIdentifier node)
    {
        if(this._identifier_ != null)
        {
            this._identifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._identifier_ = node;
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

    public PMintypmaxExpression getMintypmaxExpression()
    {
        return this._mintypmaxExpression_;
    }

    public void setMintypmaxExpression(PMintypmaxExpression node)
    {
        if(this._mintypmaxExpression_ != null)
        {
            this._mintypmaxExpression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._mintypmaxExpression_ = node;
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
            + toString(this._tPeriod_)
            + toString(this._identifier_)
            + toString(this._tLparen_)
            + toString(this._mintypmaxExpression_)
            + toString(this._tRparen_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tPeriod_ == child)
        {
            this._tPeriod_ = null;
            return;
        }

        if(this._identifier_ == child)
        {
            this._identifier_ = null;
            return;
        }

        if(this._tLparen_ == child)
        {
            this._tLparen_ = null;
            return;
        }

        if(this._mintypmaxExpression_ == child)
        {
            this._mintypmaxExpression_ = null;
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
        if(this._tPeriod_ == oldChild)
        {
            setTPeriod((TTPeriod) newChild);
            return;
        }

        if(this._identifier_ == oldChild)
        {
            setIdentifier((PIdentifier) newChild);
            return;
        }

        if(this._tLparen_ == oldChild)
        {
            setTLparen((TTLparen) newChild);
            return;
        }

        if(this._mintypmaxExpression_ == oldChild)
        {
            setMintypmaxExpression((PMintypmaxExpression) newChild);
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
