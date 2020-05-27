package com.jpm.abstractclass.challenge.mylinkedlist;

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
	protected GenericListItem next()
	{
		return this.rightLink;
	}

	@Override
	protected GenericListItem previous()
	{
		return this.leftLink;
	}

	@Override
	protected void setNext(GenericListItem rightLink)
	{
		this.rightLink = rightLink;
	}

	@Override
	protected void setPrevious(GenericListItem leftLink)
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
