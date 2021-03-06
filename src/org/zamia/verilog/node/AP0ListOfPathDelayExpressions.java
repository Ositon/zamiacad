/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import org.zamia.verilog.analysis.*;

@SuppressWarnings("nls")
public final class AP0ListOfPathDelayExpressions extends PListOfPathDelayExpressions
{
    private PMintypmaxExpression _mintypmaxExpression_;
    private TTComma _tComma_;
    private PListOfPathDelayExpressions _listOfPathDelayExpressions_;

    public AP0ListOfPathDelayExpressions()
    {
        // Constructor
    }

    public AP0ListOfPathDelayExpressions(
        @SuppressWarnings("hiding") PMintypmaxExpression _mintypmaxExpression_,
        @SuppressWarnings("hiding") TTComma _tComma_,
        @SuppressWarnings("hiding") PListOfPathDelayExpressions _listOfPathDelayExpressions_)
    {
        // Constructor
        setMintypmaxExpression(_mintypmaxExpression_);

        setTComma(_tComma_);

        setListOfPathDelayExpressions(_listOfPathDelayExpressions_);

    }

    @Override
    public Object clone()
    {
        return new AP0ListOfPathDelayExpressions(
            cloneNode(this._mintypmaxExpression_),
            cloneNode(this._tComma_),
            cloneNode(this._listOfPathDelayExpressions_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAP0ListOfPathDelayExpressions(this);
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

    public TTComma getTComma()
    {
        return this._tComma_;
    }

    public void setTComma(TTComma node)
    {
        if(this._tComma_ != null)
        {
            this._tComma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tComma_ = node;
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._mintypmaxExpression_)
            + toString(this._tComma_)
            + toString(this._listOfPathDelayExpressions_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._mintypmaxExpression_ == child)
        {
            this._mintypmaxExpression_ = null;
            return;
        }

        if(this._tComma_ == child)
        {
            this._tComma_ = null;
            return;
        }

        if(this._listOfPathDelayExpressions_ == child)
        {
            this._listOfPathDelayExpressions_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._mintypmaxExpression_ == oldChild)
        {
            setMintypmaxExpression((PMintypmaxExpression) newChild);
            return;
        }

        if(this._tComma_ == oldChild)
        {
            setTComma((TTComma) newChild);
            return;
        }

        if(this._listOfPathDelayExpressions_ == oldChild)
        {
            setListOfPathDelayExpressions((PListOfPathDelayExpressions) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
