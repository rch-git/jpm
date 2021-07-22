package com.jpm.section09.jpm.abstractclass.challenge.stringlist;

import com.jpm.section09.jpm.abstractclass.challenge.stringlist.impl.Letter;
import com.jpm.section09.jpm.abstractclass.challenge.stringlist.impl.MyStringList;

public class MyStringListOps
{

	public static void main(String[] args)
	{
		MyStringList myStringList = new MyStringList(null);
		myStringList.traverse(myStringList.getRoot());
		String str = "y z b a c d f e g i h j k xy xab a";
		String[] data = str.split(" ");
		for (String s : data)
		{
			myStringList.addItem(new Letter(s));
			myStringList.traverse(myStringList.getRoot());
			System.out.println("-----");
		}
		
		myStringList.traverse(myStringList.getRoot());
		System.out.println("---");
		myStringList.removeItem(new Letter("j"));
		myStringList.removeItem(new Letter("sdg"));
		myStringList.traverse(myStringList.getRoot());
	}
}
