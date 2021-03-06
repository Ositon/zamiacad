/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import org.zamia.verilog.analysis.*;

@SuppressWarnings("nls")
public final class AP1HierarchicalIdentifier extends PHierarchicalIdentifier
{
    private PIdentifier _identifier_;
    private TTPeriod _tPeriod_;
    private PHierarchicalIdentifier _hierarchicalIdentifier_;

    public AP1HierarchicalIdentifier()
    {
        // Constructor
    }

    public AP1HierarchicalIdentifier(
        @SuppressWarnings("hiding") PIdentifier _identifier_,
        @SuppressWarnings("hiding") TTPeriod _tPeriod_,
        @SuppressWarnings("hiding") PHierarchicalIdentifier _hierarchicalIdentifier_)
    {
        // Constructor
        setIdentifier(_identifier_);

        setTPeriod(_tPeriod_);

        setHierarchicalIdentifier(_hierarchicalIdentifier_);

    }

    @Override
    public Object clone()
    {
        return new AP1HierarchicalIdentifier(
            cloneNode(this._identifier_),
            cloneNode(this._tPeriod_),
            cloneNode(this._hierarchicalIdentifier_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAP1HierarchicalIdentifier(this);
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

    public PHierarchicalIdentifier getHierarchicalIdentifier()
    {
        return this._hierarchicalIdentifier_;
    }

    public void setHierarchicalIdentifier(PHierarchicalIdentifier node)
    {
        if(this._hierarchicalIdentifier_ != null)
        {
            this._hierarchicalIdentifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._hierarchicalIdentifier_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._identifier_)
            + toString(this._tPeriod_)
            + toString(this._hierarchicalIdentifier_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._identifier_ == child)
        {
            this._identifier_ = null;
            return;
        }

        if(this._tPeriod_ == child)
        {
            this._tPeriod_ = null;
            return;
        }

        if(this._hierarchicalIdentifier_ == child)
        {
            this._hierarchicalIdentifier_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._identifier_ == oldChild)
        {
            setIdentifier((PIdentifier) newChild);
            return;
        }

        if(this._tPeriod_ == oldChild)
        {
            setTPeriod((TTPeriod) newChild);
            return;
        }

        if(this._hierarchicalIdentifier_ == oldChild)
        {
            setHierarchicalIdentifier((PHierarchicalIdentifier) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
