package com.jpm.abstractclass.challenge.mylinkedlist;

public abstract class GenericListItem
{
	protected GenericListItem rightLink = null;
	protected GenericListItem leftLink = null;
	protected Object value;
	
	public GenericListItem(Object value)
	{
		super();
		this.value = value;
	}

	protected abstract GenericListItem next();
	protected abstract GenericListItem previous();
	protected abstract void setNext(GenericListItem rightLink);
	protected abstract void setPrevious(GenericListItem leftLink);
	protected abstract int compareTo(GenericListItem item);
	
	public Object getValue()
	{
		return value;
	}
	
	public void setValue(Object value)
	{
		this.value = value;
	}
}