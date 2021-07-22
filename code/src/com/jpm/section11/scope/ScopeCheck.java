package com.jpm.section11.scope;

public class ScopeCheck
{
	private int var1 = 9;
	public int publicVar = 3;
	
	public ScopeCheck()
	{
		System.out.println("ScopeCheck created.");
		System.out.println("publicVar = " + publicVar + "; var1 = " + var1);
	}
	
	public int getVar1()
	{
		return this.var1;
	}
	
	public void timesTwo()
	{
		int privateVar = 2;
		
		System.out.println("Value of privateVar = " + privateVar);
		System.out.println("ScopeCheck timesTwo()");
		System.out.println("***********");
		for(int i = 0; i < 10; i++)
		{
			System.out.println(i * privateVar);
		}
		System.out.println("Using privateVar instance variable.");
//		if we want to use the privateVar instance variable, use this keyword
		for(int i = 0; i < 10; i++)
		{
			System.out.println(i * this.var1);
		}
	}
	
	public void printPrivateVar()
	{
		int privateVar = 2;
		System.out.println("PrivateVar = " + privateVar);
		System.out.println("Instance variable for ScopeCheck, var1 = " + this.var1);
	}
	
	public void useInner()
	{
		InnerClass ic = new InnerClass();
		System.out.println("var3 from InnerClass = " + ic.var3);
	}
	
	public class InnerClass
	{
		private int var3 = 44;
		
		public InnerClass()
		{
			System.out.println("InnerClass created. var3 (InnerClass) = " + var3);
		}
		
		public void printPrivateVar()
		{
			int var4 = 2;
			System.out.println("var4 inner class = " + var4);
			System.out.println("Instance variable for InnerClass, var3 = " + this.var3);
			System.out.println("Instance variable for ScopeCheck, var1 = " + ScopeCheck.this.var1);
		}
		
		public void timesTwo()
		{
			int var5 = 4;
			
			System.out.println("Value of var5 = " + var5);//This is the variable defined in timesTwo() method in InnerClass
			System.out.println("ScopeCheck timesTwo()");
			System.out.println("***********");
			for(int i = 0; i < 10; i++)
			{
				System.out.println(i * var5);
			}
			System.out.println("Using var3 instance variable.");
//			if we want to use the privateVar instance variable, use "this" keyword
			for(int i = 0; i < 10; i++)
			{
				System.out.println(i * this.var3);
			}
			
			
			System.out.println("Using the value from the outer class, privateVar = " + ScopeCheck.this.var1);
//			using the value from the outer class
			for(int i = 0; i < 10; i++)
			{
				System.out.println(i * ScopeCheck.this.var1);
			}
		}
	}	
}