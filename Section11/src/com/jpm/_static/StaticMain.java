package com.jpm._static;

public class StaticMain
{
	public static  int multiplier = 7;

	public static void main(String[] args)
	{
		StaticTest st1 = new StaticTest("1");
		System.out.println(st1.getName() + ", instance number: " + StaticTest.getNumInstances());
		
		StaticTest st2 = new StaticTest("2");
		System.out.println(st2.getName() + ", instance number: " + StaticTest.getNumInstances());
		
		StaticTest st3 = new StaticTest("3");
		System.out.println(st3.getName() + ", instance number: " + StaticTest.getNumInstances());
		
		System.out.println(multiply(6));
		
	}
	
	public static int multiply(int number)
	{
		return number * multiplier;
	}
}
