package com.jpm.generics.lists.base;

public abstract class GenericListItem<T>
{
	protected T rightLink = null;
	protected T leftLink = null;
	protected Object value;
	
	public GenericListItem(Object value)
	{
		super();
		this.value = value;
	}

	public void setNext(T rightLink)
	{
		this.rightLink = rightLink; 
	}
	
	protected abstract int compareTo(GenericListItem<T> item);
	
	public Object getValue()
	{
		return value;
	}
	
	public void setValue(Object value)
	{
		this.value = value;
	}
	
	public void setPrevious(T leftLink)
	{
		this.leftLink = leftLink;
	}
	
	public T next()
	{
		return this.rightLink;
	}
	
	public T previous()
	{
		return this.leftLink;
	}
}