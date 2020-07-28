package com.jpm._final;

public class MainFinal
{

	public static void main(String[] args)
	{
		FinalDemo fd1 = new FinalDemo("class1");
		FinalDemo fd2 = new FinalDemo("class2");
		FinalDemo fd3 = new FinalDemo("class3");
		
		System.out.println(fd1.getInstanceNumber());
		System.out.println(fd2.getInstanceNumber());
		System.out.println(fd3.getInstanceNumber());
		
		int pw = 123;
//		Password password = new Password(pw);
		Password password = new ExtendedPassword(pw);
		password.storePAssword();
		
		password.letMeIn(1);
		password.letMeIn(2);
		password.letMeIn(3);
		password.letMeIn(123);
		
		System.out.println("Main methos called.");
		SIBTest sibTest = new SIBTest();
		sibTest.someMethod();
		System.out.println("Owner: " + SIBTest.owner);
	}
}
