package com.jpm.generics.lists.shapes.impl;

import com.jpm.generics.lists.base.GenericListItem;

public class ShapeItem extends GenericListItem<ShapeItem>
{

	public ShapeItem(String value)
	{
		super(value);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected int compareTo(GenericListItem<ShapeItem> item)
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