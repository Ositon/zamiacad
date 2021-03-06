/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import org.zamia.verilog.analysis.*;

@SuppressWarnings("nls")
public final class AP2ProceduralContinuousAssignments extends PProceduralContinuousAssignments
{
    private TKForce _kForce_;
    private PAssignment _assignment_;

    public AP2ProceduralContinuousAssignments()
    {
        // Constructor
    }

    public AP2ProceduralContinuousAssignments(
        @SuppressWarnings("hiding") TKForce _kForce_,
        @SuppressWarnings("hiding") PAssignment _assignment_)
    {
        // Constructor
        setKForce(_kForce_);

        setAssignment(_assignment_);

    }

    @Override
    public Object clone()
    {
        return new AP2ProceduralContinuousAssignments(
            cloneNode(this._kForce_),
            cloneNode(this._assignment_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAP2ProceduralContinuousAssignments(this);
    }

    public TKForce getKForce()
    {
        return this._kForce_;
    }

    public void setKForce(TKForce node)
    {
        if(this._kForce_ != null)
        {
            this._kForce_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._kForce_ = node;
    }

    public PAssignment getAssignment()
    {
        return this._assignment_;
    }

    public void setAssignment(PAssignment node)
    {
        if(this._assignment_ != null)
        {
            this._assignment_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._assignment_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._kForce_)
            + toString(this._assignment_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._kForce_ == child)
        {
            this._kForce_ = null;
            return;
        }

        if(this._assignment_ == child)
        {
            this._assignment_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._kForce_ == oldChild)
        {
            setKForce((TKForce) newChild);
            return;
        }

        if(this._assignment_ == oldChild)
        {
            setAssignment((PAssignment) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
