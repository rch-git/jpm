package com.jpm.abstractclass.challenge.mylinkedlist;

public class MyStringListOps
{

	public static void main(String[] args)
	{
		MyStringList myStringList = new MyStringList(null);
		myStringList.traverse(myStringList.getRoot());
		String str = "b a c d f e g i h j k xy xab";
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
		myStringList.traverse(myStringList.getRoot());
	}
}
