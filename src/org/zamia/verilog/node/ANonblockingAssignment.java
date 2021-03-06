/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import org.zamia.verilog.analysis.*;

@SuppressWarnings("nls")
public final class ANonblockingAssignment extends PNonblockingAssignment
{
    private PLvalue _e1_;
    private TTLe _tLe_;
    private PDelayOrEventControl _delayOrEventControl_;
    private PExpression _e2_;

    public ANonblockingAssignment()
    {
        // Constructor
    }

    public ANonblockingAssignment(
        @SuppressWarnings("hiding") PLvalue _e1_,
        @SuppressWarnings("hiding") TTLe _tLe_,
        @SuppressWarnings("hiding") PDelayOrEventControl _delayOrEventControl_,
        @SuppressWarnings("hiding") PExpression _e2_)
    {
        // Constructor
        setE1(_e1_);

        setTLe(_tLe_);

        setDelayOrEventControl(_delayOrEventControl_);

        setE2(_e2_);

    }

    @Override
    public Object clone()
    {
        return new ANonblockingAssignment(
            cloneNode(this._e1_),
            cloneNode(this._tLe_),
            cloneNode(this._delayOrEventControl_),
            cloneNode(this._e2_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANonblockingAssignment(this);
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

    public TTLe getTLe()
    {
        return this._tLe_;
    }

    public void setTLe(TTLe node)
    {
        if(this._tLe_ != null)
        {
            this._tLe_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tLe_ = node;
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
            + toString(this._tLe_)
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

        if(this._tLe_ == child)
        {
            this._tLe_ = null;
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

        if(this._tLe_ == oldChild)
        {
            setTLe((TTLe) newChild);
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
