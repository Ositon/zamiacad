/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import org.zamia.verilog.analysis.*;

@SuppressWarnings("nls")
public final class ARealDeclaration extends PRealDeclaration
{
    private TKReal _kReal_;
    private PListOfRealIdentifiers _listOfRealIdentifiers_;
    private TTSemicolon _tSemicolon_;

    public ARealDeclaration()
    {
        // Constructor
    }

    public ARealDeclaration(
        @SuppressWarnings("hiding") TKReal _kReal_,
        @SuppressWarnings("hiding") PListOfRealIdentifiers _listOfRealIdentifiers_,
        @SuppressWarnings("hiding") TTSemicolon _tSemicolon_)
    {
        // Constructor
        setKReal(_kReal_);

        setListOfRealIdentifiers(_listOfRealIdentifiers_);

        setTSemicolon(_tSemicolon_);

    }

    @Override
    public Object clone()
    {
        return new ARealDeclaration(
            cloneNode(this._kReal_),
            cloneNode(this._listOfRealIdentifiers_),
            cloneNode(this._tSemicolon_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARealDeclaration(this);
    }

    public TKReal getKReal()
    {
        return this._kReal_;
    }

    public void setKReal(TKReal node)
    {
        if(this._kReal_ != null)
        {
            this._kReal_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._kReal_ = node;
    }

    public PListOfRealIdentifiers getListOfRealIdentifiers()
    {
        return this._listOfRealIdentifiers_;
    }

    public void setListOfRealIdentifiers(PListOfRealIdentifiers node)
    {
        if(this._listOfRealIdentifiers_ != null)
        {
            this._listOfRealIdentifiers_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._listOfRealIdentifiers_ = node;
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
            + toString(this._kReal_)
            + toString(this._listOfRealIdentifiers_)
            + toString(this._tSemicolon_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._kReal_ == child)
        {
            this._kReal_ = null;
            return;
        }

        if(this._listOfRealIdentifiers_ == child)
        {
            this._listOfRealIdentifiers_ = null;
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
        if(this._kReal_ == oldChild)
        {
            setKReal((TKReal) newChild);
            return;
        }

        if(this._listOfRealIdentifiers_ == oldChild)
        {
            setListOfRealIdentifiers((PListOfRealIdentifiers) newChild);
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
