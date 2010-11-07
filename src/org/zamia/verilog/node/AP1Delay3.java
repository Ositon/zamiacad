/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import org.zamia.verilog.analysis.*;

@SuppressWarnings("nls")
public final class AP1Delay3 extends PDelay3
{
    private TTHash _tHash_;
    private TTLparen _tLparen_;
    private PMintypmaxExpression _e1_;
    private TTComma _c1_;
    private PMintypmaxExpression _e2_;
    private TTComma _c2_;
    private PMintypmaxExpression _e3_;
    private TTRparen _tRparen_;

    public AP1Delay3()
    {
        // Constructor
    }

    public AP1Delay3(
        @SuppressWarnings("hiding") TTHash _tHash_,
        @SuppressWarnings("hiding") TTLparen _tLparen_,
        @SuppressWarnings("hiding") PMintypmaxExpression _e1_,
        @SuppressWarnings("hiding") TTComma _c1_,
        @SuppressWarnings("hiding") PMintypmaxExpression _e2_,
        @SuppressWarnings("hiding") TTComma _c2_,
        @SuppressWarnings("hiding") PMintypmaxExpression _e3_,
        @SuppressWarnings("hiding") TTRparen _tRparen_)
    {
        // Constructor
        setTHash(_tHash_);

        setTLparen(_tLparen_);

        setE1(_e1_);

        setC1(_c1_);

        setE2(_e2_);

        setC2(_c2_);

        setE3(_e3_);

        setTRparen(_tRparen_);

    }

    @Override
    public Object clone()
    {
        return new AP1Delay3(
            cloneNode(this._tHash_),
            cloneNode(this._tLparen_),
            cloneNode(this._e1_),
            cloneNode(this._c1_),
            cloneNode(this._e2_),
            cloneNode(this._c2_),
            cloneNode(this._e3_),
            cloneNode(this._tRparen_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAP1Delay3(this);
    }

    public TTHash getTHash()
    {
        return this._tHash_;
    }

    public void setTHash(TTHash node)
    {
        if(this._tHash_ != null)
        {
            this._tHash_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tHash_ = node;
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

    public PMintypmaxExpression getE1()
    {
        return this._e1_;
    }

    public void setE1(PMintypmaxExpression node)
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

    public TTComma getC1()
    {
        return this._c1_;
    }

    public void setC1(TTComma node)
    {
        if(this._c1_ != null)
        {
            this._c1_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._c1_ = node;
    }

    public PMintypmaxExpression getE2()
    {
        return this._e2_;
    }

    public void setE2(PMintypmaxExpression node)
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

    public TTComma getC2()
    {
        return this._c2_;
    }

    public void setC2(TTComma node)
    {
        if(this._c2_ != null)
        {
            this._c2_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._c2_ = node;
    }

    public PMintypmaxExpression getE3()
    {
        return this._e3_;
    }

    public void setE3(PMintypmaxExpression node)
    {
        if(this._e3_ != null)
        {
            this._e3_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._e3_ = node;
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
            + toString(this._tHash_)
            + toString(this._tLparen_)
            + toString(this._e1_)
            + toString(this._c1_)
            + toString(this._e2_)
            + toString(this._c2_)
            + toString(this._e3_)
            + toString(this._tRparen_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tHash_ == child)
        {
            this._tHash_ = null;
            return;
        }

        if(this._tLparen_ == child)
        {
            this._tLparen_ = null;
            return;
        }

        if(this._e1_ == child)
        {
            this._e1_ = null;
            return;
        }

        if(this._c1_ == child)
        {
            this._c1_ = null;
            return;
        }

        if(this._e2_ == child)
        {
            this._e2_ = null;
            return;
        }

        if(this._c2_ == child)
        {
            this._c2_ = null;
            return;
        }

        if(this._e3_ == child)
        {
            this._e3_ = null;
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
        if(this._tHash_ == oldChild)
        {
            setTHash((TTHash) newChild);
            return;
        }

        if(this._tLparen_ == oldChild)
        {
            setTLparen((TTLparen) newChild);
            return;
        }

        if(this._e1_ == oldChild)
        {
            setE1((PMintypmaxExpression) newChild);
            return;
        }

        if(this._c1_ == oldChild)
        {
            setC1((TTComma) newChild);
            return;
        }

        if(this._e2_ == oldChild)
        {
            setE2((PMintypmaxExpression) newChild);
            return;
        }

        if(this._c2_ == oldChild)
        {
            setC2((TTComma) newChild);
            return;
        }

        if(this._e3_ == oldChild)
        {
            setE3((PMintypmaxExpression) newChild);
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