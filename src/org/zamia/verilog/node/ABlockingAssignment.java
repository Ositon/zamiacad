/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import org.zamia.verilog.analysis.*;

@SuppressWarnings("nls")
public final class ABlockingAssignment extends PBlockingAssignment
{
    private PLvalue _e1_;
    private TTEquals _tEquals_;
    private PDelayOrEventControl _delayOrEventControl_;
    private PExpression _e2_;

    public ABlockingAssignment()
    {
        // Constructor
    }

    public ABlockingAssignment(
        @SuppressWarnings("hiding") PLvalue _e1_,
        @SuppressWarnings("hiding") TTEquals _tEquals_,
        @SuppressWarnings("hiding") PDelayOrEventControl _delayOrEventControl_,
        @SuppressWarnings("hiding") PExpression _e2_)
    {
        // Constructor
        setE1(_e1_);

        setTEquals(_tEquals_);

        setDelayOrEventControl(_delayOrEventControl_);

        setE2(_e2_);

    }

    @Override
    public Object clone()
    {
        return new ABlockingAssignment(
            cloneNode(this._e1_),
            cloneNode(this._tEquals_),
            cloneNode(this._delayOrEventControl_),
            cloneNode(this._e2_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABlockingAssignment(this);
    }

    public PLvalue getE1()
    {
        return this._e1_;
    }

    public void setE1(PLvalue node)
    {
        if(this._e1_ != null)
        {
            this._e1_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._e1_ = node;
    }

    public TTEquals getTEquals()
    {
        return this._tEquals_;
    }

    public void setTEquals(TTEquals node)
    {
        if(this._tEquals_ != null)
        {
            this._tEquals_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tEquals_ = node;
    }

    public PDelayOrEventControl getDelayOrEventControl()
    {
        return this._delayOrEventControl_;
    }

    public void setDelayOrEventControl(PDelayOrEventControl node)
    {
        if(this._delayOrEventControl_ != null)
        {
            this._delayOrEventControl_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._delayOrEventControl_ = node;
    }

    public PExpression getE2()
    {
        return this._e2_;
    }

    public void setE2(PExpression node)
    {
        if(this._e2_ != null)
        {
            this._e2_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._e2_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._e1_)
            + toString(this._tEquals_)
            + toString(this._delayOrEventControl_)
            + toString(this._e2_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._e1_ == child)
        {
            this._e1_ = null;
            return;
        }

        if(this._tEquals_ == child)
        {
            this._tEquals_ = null;
            return;
        }

        if(this._delayOrEventControl_ == child)
        {
            this._delayOrEventControl_ = null;
            return;
        }

        if(this._e2_ == child)
        {
            this._e2_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._e1_ == oldChild)
        {
            setE1((PLvalue) newChild);
            return;
        }

        if(this._tEquals_ == oldChild)
        {
            setTEquals((TTEquals) newChild);
            return;
        }

        if(this._delayOrEventControl_ == oldChild)
        {
            setDelayOrEventControl((PDelayOrEventControl) newChild);
            return;
        }

        if(this._e2_ == oldChild)
        {
            setE2((PExpression) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
