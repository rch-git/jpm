package com.jpm.section06.staticvariables;

public class MainStaticEx
{

	public static void main(String[] args)
	{
		StaticEx se = new StaticEx("name1");
		StaticEx se2 = new StaticEx("name2");
		
		se.printName();
		se2.printName();
	}
}
