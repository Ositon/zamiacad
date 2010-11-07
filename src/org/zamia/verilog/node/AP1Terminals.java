/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import org.zamia.verilog.analysis.*;

@SuppressWarnings("nls")
public final class AP1Terminals extends PTerminals
{
    private PTerminal _terminal_;
    private TTComma _tComma_;
    private PTerminals _terminals_;

    public AP1Terminals()
    {
        // Constructor
    }

    public AP1Terminals(
        @SuppressWarnings("hiding") PTerminal _terminal_,
        @SuppressWarnings("hiding") TTComma _tComma_,
        @SuppressWarnings("hiding") PTerminals _terminals_)
    {
        // Constructor
        setTerminal(_terminal_);

        setTComma(_tComma_);

        setTerminals(_terminals_);

    }

    @Override
    public Object clone()
    {
        return new AP1Terminals(
            cloneNode(this._terminal_),
            cloneNode(this._tComma_),
            cloneNode(this._terminals_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAP1Terminals(this);
    }

    public PTerminal getTerminal()
    {
        return this._terminal_;
    }

    public void setTerminal(PTerminal node)
    {
        if(this._terminal_ != null)
        {
            this._terminal_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._terminal_ = node;
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

    public PTerminals getTerminals()
    {
        return this._terminals_;
    }

    public void setTerminals(PTerminals node)
    {
        if(this._terminals_ != null)
        {
            this._terminals_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._terminals_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._terminal_)
            + toString(this._tComma_)
            + toString(this._terminals_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._terminal_ == child)
        {
            this._terminal_ = null;
            return;
        }

        if(this._tComma_ == child)
        {
            this._tComma_ = null;
            return;
        }

        if(this._terminals_ == child)
        {
            this._terminals_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._terminal_ == oldChild)
        {
            setTerminal((PTerminal) newChild);
            return;
        }

        if(this._tComma_ == oldChild)
        {
            setTComma((TTComma) newChild);
            return;
        }

        if(this._terminals_ == oldChild)
        {
            setTerminals((PTerminals) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}