/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import org.zamia.verilog.analysis.*;

@SuppressWarnings("nls")
public final class AOctNumber extends PNumber
{
    private TOctalNumber _octalNumber_;

    public AOctNumber()
    {
        // Constructor
    }

    public AOctNumber(
        @SuppressWarnings("hiding") TOctalNumber _octalNumber_)
    {
        // Constructor
        setOctalNumber(_octalNumber_);

    }

    @Override
    public Object clone()
    {
        return new AOctNumber(
            cloneNode(this._octalNumber_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOctNumber(this);
    }

    public TOctalNumber getOctalNumber()
    {
        return this._octalNumber_;
    }

    public void setOctalNumber(TOctalNumber node)
    {
        if(this._octalNumber_ != null)
        {
            this._octalNumber_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._octalNumber_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._octalNumber_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._octalNumber_ == child)
        {
            this._octalNumber_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._octalNumber_ == oldChild)
        {
            setOctalNumber((TOctalNumber) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
