package com.jpm.generics.lists.colors.impl;

import com.jpm.generics.lists.base.GenericListItem;

public class ColorItem extends GenericListItem<ColorItem>
{

	public ColorItem(String value)
	{
		super(value);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected int compareTo(GenericListItem<ColorItem> item)
	{
		if(item != null)
		{
			return ((String)this.getValue()).compareTo((String)item.getValue());
		}
		else
		{
			return -1;
		}
	}
}