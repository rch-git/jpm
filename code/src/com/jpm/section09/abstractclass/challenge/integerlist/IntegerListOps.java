package com.jpm.section09.abstractclass.challenge.integerlist;

import com.jpm.section09.abstractclass.challenge.integerlist.impl.IntegerList;
import com.jpm.section09.abstractclass.challenge.integerlist.impl.Num;

public class IntegerListOps
{

	public static void main(String[] args)
	{
		IntegerList integerList = new IntegerList(null);
		
		Integer[] numbers = new Integer[] {12, 6, 1, 3, 2, 10, 22, 55};
		for(Integer num : numbers)
		{
			integerList.addItem(new Num(num));
		}
		
		integerList.traverse(integerList.getRoot());
	}

}