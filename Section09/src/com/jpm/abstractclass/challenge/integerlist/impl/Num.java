package com.jpm.abstractclass.challenge.integerlist.impl;

import com.jpm.abstractclass.challenge.base.GenericListItem;

public class Num extends GenericListItem
{

	public Num(Object value)
	{
		super(value);
	}

	@Override
	public GenericListItem next()
	{
		return this.rightLink;
	}

	@Override
	protected GenericListItem previous()
	{
		return this.leftLink;
	}

	@Override
	public void setNext(GenericListItem rightLink)
	{
		this.rightLink = rightLink; 
	}

	@Override
	public void setPrevious(GenericListItem leftLink)
	{
		this.leftLink = leftLink;
	}

	@Override
	protected int compareTo(GenericListItem item)
	{
		if(item != null)
		{
			return ((Integer)this.getValue()).compareTo((Integer)item.getValue());
		}
		else
		{
			return -1;
		}
	}

}