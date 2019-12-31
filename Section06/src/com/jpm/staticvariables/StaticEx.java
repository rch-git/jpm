package com.jpm.staticvariables;

public class StaticEx
{
	private static String name;
//	private String name;
	
	public StaticEx(String name)
	{
//		this.name = name;
		StaticEx.name = name;
	}
	
	public void printName()
	{
		System.out.println("Name: " + name);
	}
}
