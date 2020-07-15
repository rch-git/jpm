package com.jpm.scope;

public class ScopeMain
{

	public static void main(String[] args)
	{
		String var4 = "privateVar from main()";
		
		ScopeCheck sc = new ScopeCheck();
		System.out.println("ScopeCheck privateVar = " + sc.getVar1());
		System.out.println("privateVar = " + var4);
		sc.getVar1();
		sc.useInner();
//		sc.timesTwo();
		
		ScopeCheck.InnerClass ic = sc.new InnerClass();
//		ic.timesTwo();
		ic.printPrivateVar();
	}
}
