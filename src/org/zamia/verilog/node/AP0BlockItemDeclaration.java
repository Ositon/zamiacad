/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import org.zamia.verilog.analysis.*;

@SuppressWarnings("nls")
public final class AP0BlockItemDeclaration extends PBlockItemDeclaration
{
    private TKReg _kReg_;
    private TKSigned _kSigned_;
    private PRange _range_;
    private PListOfBlockVariableIdentifiers _listOfBlockVariableIdentifiers_;
    private TTSemicolon _tSemicolon_;

    public AP0BlockItemDeclaration()
    {
        // Constructor
    }

    public AP0BlockItemDeclaration(
        @SuppressWarnings("hiding") TKReg _kReg_,
        @SuppressWarnings("hiding") TKSigned _kSigned_,
        @SuppressWarnings("hiding") PRange _range_,
        @SuppressWarnings("hiding") PListOfBlockVariableIdentifiers _listOfBlockVariableIdentifiers_,
        @SuppressWarnings("hiding") TTSemicolon _tSemicolon_)
    {
        // Constructor
        setKReg(_kReg_);

        setKSigned(_kSigned_);

        setRange(_range_);

        setListOfBlockVariableIdentifiers(_listOfBlockVariableIdentifiers_);

        setTSemicolon(_tSemicolon_);

    }

    @Override
    public Object clone()
    {
        return new AP0BlockItemDeclaration(
            cloneNode(this._kReg_),
            cloneNode(this._kSigned_),
            cloneNode(this._range_),
            cloneNode(this._listOfBlockVariableIdentifiers_),
            cloneNode(this._tSemicolon_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAP0BlockItemDeclaration(this);
    }

    public TKReg getKReg()
    {
        return this._kReg_;
    }

    public void setKReg(TKReg node)
    {
        if(this._kReg_ != null)
        {
            this._kReg_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._kReg_ = node;
    }

    public TKSigned getKSigned()
    {
        return this._kSigned_;
    }

    public void setKSigned(TKSigned node)
    {
        if(this._kSigned_ != null)
        {
            this._kSigned_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._kSigned_ = node;
    }

    public PRange getRange()
    {
        return this._range_;
    }

    public void setRange(PRange node)
    {
        if(this._range_ != null)
        {
            this._range_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._range_ = node;
    }

    public PListOfBlockVariableIdentifiers getListOfBlockVariableIdentifiers()
    {
        return this._listOfBlockVariableIdentifiers_;
    }

    public void setListOfBlockVariableIdentifiers(PListOfBlockVariableIdentifiers node)
    {
        if(this._listOfBlockVariableIdentifiers_ != null)
        {
            this._listOfBlockVariableIdentifiers_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._listOfBlockVariableIdentifiers_ = node;
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
            + toString(this._kReg_)
            + toString(this._kSigned_)
            + toString(this._range_)
            + toString(this._listOfBlockVariableIdentifiers_)
            + toString(this._tSemicolon_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._kReg_ == child)
        {
            this._kReg_ = null;
            return;
        }

        if(this._kSigned_ == child)
        {
            this._kSigned_ = null;
            return;
        }

        if(this._range_ == child)
        {
            this._range_ = null;
            return;
        }

        if(this._listOfBlockVariableIdentifiers_ == child)
        {
            this._listOfBlockVariableIdentifiers_ = null;
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
        if(this._kReg_ == oldChild)
        {
            setKReg((TKReg) newChild);
            return;
        }

        if(this._kSigned_ == oldChild)
        {
            setKSigned((TKSigned) newChild);
            return;
        }

        if(this._range_ == oldChild)
        {
            setRange((PRange) newChild);
            return;
        }

        if(this._listOfBlockVariableIdentifiers_ == oldChild)
        {
            setListOfBlockVariableIdentifiers((PListOfBlockVariableIdentifiers) newChild);
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
