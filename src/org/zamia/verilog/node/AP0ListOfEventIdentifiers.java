/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import java.util.*;
import org.zamia.verilog.analysis.*;

@SuppressWarnings("nls")
public final class AP0ListOfEventIdentifiers extends PListOfEventIdentifiers
{
    private PIdentifier _identifier_;
    private final LinkedList<PDimension> _dimension_ = new LinkedList<PDimension>();
    private TTComma _tComma_;
    private PListOfEventIdentifiers _listOfEventIdentifiers_;

    public AP0ListOfEventIdentifiers()
    {
        // Constructor
    }

    public AP0ListOfEventIdentifiers(
        @SuppressWarnings("hiding") PIdentifier _identifier_,
        @SuppressWarnings("hiding") List<PDimension> _dimension_,
        @SuppressWarnings("hiding") TTComma _tComma_,
        @SuppressWarnings("hiding") PListOfEventIdentifiers _listOfEventIdentifiers_)
    {
        // Constructor
        setIdentifier(_identifier_);

        setDimension(_dimension_);

        setTComma(_tComma_);

        setListOfEventIdentifiers(_listOfEventIdentifiers_);

    }

    @Override
    public Object clone()
    {
        return new AP0ListOfEventIdentifiers(
            cloneNode(this._identifier_),
            cloneList(this._dimension_),
            cloneNode(this._tComma_),
            cloneNode(this._listOfEventIdentifiers_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAP0ListOfEventIdentifiers(this);
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

    public LinkedList<PDimension> getDimension()
    {
        return this._dimension_;
    }

    public void setDimension(List<PDimension> list)
    {
        this._dimension_.clear();
        this._dimension_.addAll(list);
        for(PDimension e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
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

    public PListOfEventIdentifiers getListOfEventIdentifiers()
    {
        return this._listOfEventIdentifiers_;
    }

    public void setListOfEventIdentifiers(PListOfEventIdentifiers node)
    {
        if(this._listOfEventIdentifiers_ != null)
        {
            this._listOfEventIdentifiers_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._listOfEventIdentifiers_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._identifier_)
            + toString(this._dimension_)
            + toString(this._tComma_)
            + toString(this._listOfEventIdentifiers_);
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

        if(this._dimension_.remove(child))
        {
            return;
        }

        if(this._tComma_ == child)
        {
            this._tComma_ = null;
            return;
        }

        if(this._listOfEventIdentifiers_ == child)
        {
            this._listOfEventIdentifiers_ = null;
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

        for(ListIterator<PDimension> i = this._dimension_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PDimension) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._tComma_ == oldChild)
        {
            setTComma((TTComma) newChild);
            return;
        }

        if(this._listOfEventIdentifiers_ == oldChild)
        {
            setListOfEventIdentifiers((PListOfEventIdentifiers) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
