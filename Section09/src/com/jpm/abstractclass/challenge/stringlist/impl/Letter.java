package com.jpm.abstractclass.challenge.stringlist.impl;

import com.jpm.abstractclass.challenge.base.GenericListItem;

/**
 * This is a specific implementation of GenericListItem for MyStringList
 * @author Ravi
 *
 */

public class Letter extends GenericListItem
{

	public Letter(String value)
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
			return ((String) this.getValue()).compareTo((String) item.getValue());
		}
		else
		{
			return -1;
		}
	}
}
