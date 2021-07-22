package com.jpm.section11._final;

public class SIBTest
{
	public static final String owner;
	static
	{
		owner = "RC";
		System.out.println("SIB called.");
	}
	
	public SIBTest()
	{
		System.out.println("SIB Constructor called.");
	}
	
	static
	{
		System.out.println("2nd block.");
	}
	
	public void someMethod()
	{
		System.out.println("someMethod called.");
	}
}
