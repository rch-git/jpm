package com.jpm.section11._final;

public class FinalDemo
{
	private static int classCounter = 0;
	private final int instanceNumber;
	private final String name;
//	public static void main(String[] args)
//	{
//		// TODO Auto-generated method stub
//
//	}
	
	
	public FinalDemo(String name)
	{
		this.name = name;
		classCounter++;
		instanceNumber = classCounter;
		System.out.println(this.name + " created, instance is: " + instanceNumber);
	}
	
	public int getInstanceNumber()
	{
		return this.instanceNumber;
	}
}
