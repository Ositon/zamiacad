/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import java.util.*;
import org.zamia.verilog.analysis.*;

@SuppressWarnings("nls")
public final class ASeqBlock extends PSeqBlock
{
    private TKBegin _kBegin_;
    private PBlockId _blockId_;
    private final LinkedList<PStatement> _statement_ = new LinkedList<PStatement>();
    private TKEnd _kEnd_;

    public ASeqBlock()
    {
        // Constructor
    }

    public ASeqBlock(
        @SuppressWarnings("hiding") TKBegin _kBegin_,
        @SuppressWarnings("hiding") PBlockId _blockId_,
        @SuppressWarnings("hiding") List<PStatement> _statement_,
        @SuppressWarnings("hiding") TKEnd _kEnd_)
    {
        // Constructor
        setKBegin(_kBegin_);

        setBlockId(_blockId_);

        setStatement(_statement_);

        setKEnd(_kEnd_);

    }

    @Override
    public Object clone()
    {
        return new ASeqBlock(
            cloneNode(this._kBegin_),
            cloneNode(this._blockId_),
            cloneList(this._statement_),
            cloneNode(this._kEnd_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASeqBlock(this);
    }

    public TKBegin getKBegin()
    {
        return this._kBegin_;
    }

    public void setKBegin(TKBegin node)
    {
        if(this._kBegin_ != null)
        {
            this._kBegin_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._kBegin_ = node;
    }

    public PBlockId getBlockId()
    {
        return this._blockId_;
    }

    public void setBlockId(PBlockId node)
    {
        if(this._blockId_ != null)
        {
            this._blockId_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._blockId_ = node;
    }

    public LinkedList<PStatement> getStatement()
    {
        return this._statement_;
    }

    public void setStatement(List<PStatement> list)
    {
        this._statement_.clear();
        this._statement_.addAll(list);
        for(PStatement e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    public TKEnd getKEnd()
    {
        return this._kEnd_;
    }

    public void setKEnd(TKEnd node)
    {
        if(this._kEnd_ != null)
        {
            this._kEnd_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._kEnd_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._kBegin_)
            + toString(this._blockId_)
            + toString(this._statement_)
            + toString(this._kEnd_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._kBegin_ == child)
        {
            this._kBegin_ = null;
            return;
        }

        if(this._blockId_ == child)
        {
            this._blockId_ = null;
            return;
        }

        if(this._statement_.remove(child))
        {
            return;
        }

        if(this._kEnd_ == child)
        {
            this._kEnd_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._kBegin_ == oldChild)
        {
            setKBegin((TKBegin) newChild);
            return;
        }

        if(this._blockId_ == oldChild)
        {
            setBlockId((PBlockId) newChild);
            return;
        }

        for(ListIterator<PStatement> i = this._statement_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PStatement) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._kEnd_ == oldChild)
        {
            setKEnd((TKEnd) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}