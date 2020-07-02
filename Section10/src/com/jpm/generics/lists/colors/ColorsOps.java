package com.jpm.generics.lists.colors;

import com.jpm.generics.lists.colors.impl.ColorItem;
import com.jpm.generics.lists.colors.impl.ColorList;
import com.jpm.generics.lists.shapes.impl.ShapeItem;

public class ColorsOps
{

	public static void main(String[] args)
	{
		String[] colors = new String[] {"red", "white", "blue"};
		ColorList cl = new ColorList(null);
		
		for(String s : colors)
		{
			cl.addItem(new ColorItem(s));
		}
		
		ShapeItem sh = new ShapeItem("Circle");
		
//		cl.addItem(sh);
		
		cl.traverse(cl.getRoot());
	}
}