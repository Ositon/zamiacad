/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import org.zamia.verilog.analysis.*;

@SuppressWarnings("nls")
public final class AParallelEdgeSensitivePathDeclaration extends PEdgeSensitivePathDeclaration
{
    private TTLparen _tLparen_;
    private PEdgeIdentifier _edgeIdentifier_;
    private PListOfPathDescriptors _l1_;
    private TTEg _tEg_;
    private TTLparen _p2_;
    private PListOfPathDescriptors _d2_;
    private PPolarityOperator _polarityOperator_;
    private TTColon _tColon_;
    private PExpression _expression_;
    private TTRparen _p3_;
    private TTRparen _p4_;
    private TTEquals _tEquals_;
    private PPathDelayValue _pathDelayValue_;

    public AParallelEdgeSensitivePathDeclaration()
    {
        // Constructor
    }

    public AParallelEdgeSensitivePathDeclaration(
        @SuppressWarnings("hiding") TTLparen _tLparen_,
        @SuppressWarnings("hiding") PEdgeIdentifier _edgeIdentifier_,
        @SuppressWarnings("hiding") PListOfPathDescriptors _l1_,
        @SuppressWarnings("hiding") TTEg _tEg_,
        @SuppressWarnings("hiding") TTLparen _p2_,
        @SuppressWarnings("hiding") PListOfPathDescriptors _d2_,
        @SuppressWarnings("hiding") PPolarityOperator _polarityOperator_,
        @SuppressWarnings("hiding") TTColon _tColon_,
        @SuppressWarnings("hiding") PExpression _expression_,
        @SuppressWarnings("hiding") TTRparen _p3_,
        @SuppressWarnings("hiding") TTRparen _p4_,
        @SuppressWarnings("hiding") TTEquals _tEquals_,
        @SuppressWarnings("hiding") PPathDelayValue _pathDelayValue_)
    {
        // Constructor
        setTLparen(_tLparen_);

        setEdgeIdentifier(_edgeIdentifier_);

        setL1(_l1_);

        setTEg(_tEg_);

        setP2(_p2_);

        setD2(_d2_);

        setPolarityOperator(_polarityOperator_);

        setTColon(_tColon_);

        setExpression(_expression_);

        setP3(_p3_);

        setP4(_p4_);

        setTEquals(_tEquals_);

        setPathDelayValue(_pathDelayValue_);

    }

    @Override
    public Object clone()
    {
        return new AParallelEdgeSensitivePathDeclaration(
            cloneNode(this._tLparen_),
            cloneNode(this._edgeIdentifier_),
            cloneNode(this._l1_),
            cloneNode(this._tEg_),
            cloneNode(this._p2_),
            cloneNode(this._d2_),
            cloneNode(this._polarityOperator_),
            cloneNode(this._tColon_),
            cloneNode(this._expression_),
            cloneNode(this._p3_),
            cloneNode(this._p4_),
            cloneNode(this._tEquals_),
            cloneNode(this._pathDelayValue_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParallelEdgeSensitivePathDeclaration(this);
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

    public PEdgeIdentifier getEdgeIdentifier()
    {
        return this._edgeIdentifier_;
    }

    public void setEdgeIdentifier(PEdgeIdentifier node)
    {
        if(this._edgeIdentifier_ != null)
        {
            this._edgeIdentifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._edgeIdentifier_ = node;
    }

    public PListOfPathDescriptors getL1()
    {
        return this._l1_;
    }

    public void setL1(PListOfPathDescriptors node)
    {
        if(this._l1_ != null)
        {
            this._l1_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._l1_ = node;
    }

    public TTEg getTEg()
    {
        return this._tEg_;
    }

    public void setTEg(TTEg node)
    {
        if(this._tEg_ != null)
        {
            this._tEg_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tEg_ = node;
    }

    public TTLparen getP2()
    {
        return this._p2_;
    }

    public void setP2(TTLparen node)
    {
        if(this._p2_ != null)
        {
            this._p2_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._p2_ = node;
    }

    public PListOfPathDescriptors getD2()
    {
        return this._d2_;
    }

    public void setD2(PListOfPathDescriptors node)
    {
        if(this._d2_ != null)
        {
            this._d2_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._d2_ = node;
    }

    public PPolarityOperator getPolarityOperator()
    {
        return this._polarityOperator_;
    }

    public void setPolarityOperator(PPolarityOperator node)
    {
        if(this._polarityOperator_ != null)
        {
            this._polarityOperator_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._polarityOperator_ = node;
    }

    public TTColon getTColon()
    {
        return this._tColon_;
    }

    public void setTColon(TTColon node)
    {
        if(this._tColon_ != null)
        {
            this._tColon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tColon_ = node;
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

    public TTRparen getP3()
    {
        return this._p3_;
    }

    public void setP3(TTRparen node)
    {
        if(this._p3_ != null)
        {
            this._p3_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._p3_ = node;
    }

    public TTRparen getP4()
    {
        return this._p4_;
    }

    public void setP4(TTRparen node)
    {
        if(this._p4_ != null)
        {
            this._p4_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._p4_ = node;
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

    public PPathDelayValue getPathDelayValue()
    {
        return this._pathDelayValue_;
    }

    public void setPathDelayValue(PPathDelayValue node)
    {
        if(this._pathDelayValue_ != null)
        {
            this._pathDelayValue_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pathDelayValue_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tLparen_)
            + toString(this._edgeIdentifier_)
            + toString(this._l1_)
            + toString(this._tEg_)
            + toString(this._p2_)
            + toString(this._d2_)
            + toString(this._polarityOperator_)
            + toString(this._tColon_)
            + toString(this._expression_)
            + toString(this._p3_)
            + toString(this._p4_)
            + toString(this._tEquals_)
            + toString(this._pathDelayValue_);
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

        if(this._edgeIdentifier_ == child)
        {
            this._edgeIdentifier_ = null;
            return;
        }

        if(this._l1_ == child)
        {
            this._l1_ = null;
            return;
        }

        if(this._tEg_ == child)
        {
            this._tEg_ = null;
            return;
        }

        if(this._p2_ == child)
        {
            this._p2_ = null;
            return;
        }

        if(this._d2_ == child)
        {
            this._d2_ = null;
            return;
        }

        if(this._polarityOperator_ == child)
        {
            this._polarityOperator_ = null;
            return;
        }

        if(this._tColon_ == child)
        {
            this._tColon_ = null;
            return;
        }

        if(this._expression_ == child)
        {
            this._expression_ = null;
            return;
        }

        if(this._p3_ == child)
        {
            this._p3_ = null;
            return;
        }

        if(this._p4_ == child)
        {
            this._p4_ = null;
            return;
        }

        if(this._tEquals_ == child)
        {
            this._tEquals_ = null;
            return;
        }

        if(this._pathDelayValue_ == child)
        {
            this._pathDelayValue_ = null;
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

        if(this._edgeIdentifier_ == oldChild)
        {
            setEdgeIdentifier((PEdgeIdentifier) newChild);
            return;
        }

        if(this._l1_ == oldChild)
        {
            setL1((PListOfPathDescriptors) newChild);
            return;
        }

        if(this._tEg_ == oldChild)
        {
            setTEg((TTEg) newChild);
            return;
        }

        if(this._p2_ == oldChild)
        {
            setP2((TTLparen) newChild);
            return;
        }

        if(this._d2_ == oldChild)
        {
            setD2((PListOfPathDescriptors) newChild);
            return;
        }

        if(this._polarityOperator_ == oldChild)
        {
            setPolarityOperator((PPolarityOperator) newChild);
            return;
        }

        if(this._tColon_ == oldChild)
        {
            setTColon((TTColon) newChild);
            return;
        }

        if(this._expression_ == oldChild)
        {
            setExpression((PExpression) newChild);
            return;
        }

        if(this._p3_ == oldChild)
        {
            setP3((TTRparen) newChild);
            return;
        }

        if(this._p4_ == oldChild)
        {
            setP4((TTRparen) newChild);
            return;
        }

        if(this._tEquals_ == oldChild)
        {
            setTEquals((TTEquals) newChild);
            return;
        }

        if(this._pathDelayValue_ == oldChild)
        {
            setPathDelayValue((PPathDelayValue) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}