/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import org.zamia.verilog.analysis.*;

@SuppressWarnings("nls")
public final class AP0WidthTimingCheck extends PWidthTimingCheck
{
    private TKSwidth _kSwidth_;
    private TTLparen _tLparen_;
    private PTimingCheckEvent _timingCheckEvent_;
    private TTComma _c0_;
    private PExpression _expression_;
    private TTRparen _tRparen_;
    private TTSemicolon _tSemicolon_;

    public AP0WidthTimingCheck()
    {
        // Constructor
    }

    public AP0WidthTimingCheck(
        @SuppressWarnings("hiding") TKSwidth _kSwidth_,
        @SuppressWarnings("hiding") TTLparen _tLparen_,
        @SuppressWarnings("hiding") PTimingCheckEvent _timingCheckEvent_,
        @SuppressWarnings("hiding") TTComma _c0_,
        @SuppressWarnings("hiding") PExpression _expression_,
        @SuppressWarnings("hiding") TTRparen _tRparen_,
        @SuppressWarnings("hiding") TTSemicolon _tSemicolon_)
    {
        // Constructor
        setKSwidth(_kSwidth_);

        setTLparen(_tLparen_);

        setTimingCheckEvent(_timingCheckEvent_);

        setC0(_c0_);

        setExpression(_expression_);

        setTRparen(_tRparen_);

        setTSemicolon(_tSemicolon_);

    }

    @Override
    public Object clone()
    {
        return new AP0WidthTimingCheck(
            cloneNode(this._kSwidth_),
            cloneNode(this._tLparen_),
            cloneNode(this._timingCheckEvent_),
            cloneNode(this._c0_),
            cloneNode(this._expression_),
            cloneNode(this._tRparen_),
            cloneNode(this._tSemicolon_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAP0WidthTimingCheck(this);
    }

    public TKSwidth getKSwidth()
    {
        return this._kSwidth_;
    }

    public void setKSwidth(TKSwidth node)
    {
        if(this._kSwidth_ != null)
        {
            this._kSwidth_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._kSwidth_ = node;
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

    public PTimingCheckEvent getTimingCheckEvent()
    {
        return this._timingCheckEvent_;
    }

    public void setTimingCheckEvent(PTimingCheckEvent node)
    {
        if(this._timingCheckEvent_ != null)
        {
            this._timingCheckEvent_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._timingCheckEvent_ = node;
    }

    public TTComma getC0()
    {
        return this._c0_;
    }

    public void setC0(TTComma node)
    {
        if(this._c0_ != null)
        {
            this._c0_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._c0_ = node;
    }

    public PExpression getExpression()
    {
        return this._expression_;
    }

    public void setExpression(PExpression node)
    {
        if(this._expression_ != null)
        {
            this._expression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expression_ = node;
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
            + toString(this._kSwidth_)
            + toString(this._tLparen_)
            + toString(this._timingCheckEvent_)
            + toString(this._c0_)
            + toString(this._expression_)
            + toString(this._tRparen_)
            + toString(this._tSemicolon_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._kSwidth_ == child)
        {
            this._kSwidth_ = null;
            return;
        }

        if(this._tLparen_ == child)
        {
            this._tLparen_ = null;
            return;
        }

        if(this._timingCheckEvent_ == child)
        {
            this._timingCheckEvent_ = null;
            return;
        }

        if(this._c0_ == child)
        {
            this._c0_ = null;
            return;
        }

        if(this._expression_ == child)
        {
            this._expression_ = null;
            return;
        }

        if(this._tRparen_ == child)
        {
            this._tRparen_ = null;
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
        if(this._kSwidth_ == oldChild)
        {
            setKSwidth((TKSwidth) newChild);
            return;
        }

        if(this._tLparen_ == oldChild)
        {
            setTLparen((TTLparen) newChild);
            return;
        }

        if(this._timingCheckEvent_ == oldChild)
        {
            setTimingCheckEvent((PTimingCheckEvent) newChild);
            return;
        }

        if(this._c0_ == oldChild)
        {
            setC0((TTComma) newChild);
            return;
        }

        if(this._expression_ == oldChild)
        {
            setExpression((PExpression) newChild);
            return;
        }

        if(this._tRparen_ == oldChild)
        {
            setTRparen((TTRparen) newChild);
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
