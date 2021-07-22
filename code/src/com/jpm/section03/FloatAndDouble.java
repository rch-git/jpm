package com.jpm.section03;

public class FloatAndDouble
{

	public static void main(String[] args)
	{
		float myMinFloatValue = Float.MIN_VALUE;
		float myMaxFloatValue = Float.MAX_VALUE;
		System.out.println("Float minimum: " + myMinFloatValue);
		System.out.println("Float maximum: " + myMaxFloatValue);
		
		double myMinDoubleValue = Double.MIN_VALUE;
		double myMaxDoubleValue = Double.MAX_VALUE;
		System.out.println("Double minimum: " + myMinDoubleValue);
		System.out.println("Double maximum: " + myMaxDoubleValue);
		
		int myIntValue = 5 / 2;
		float myFloatValue = 5.25f / 2f;
		double myDoubleValue = 5.25d / 2d; //not necessary to specify d when using double
		System.out.println("myIntValue: " + myIntValue);
		System.out.println("myFloatValue: " + myFloatValue);
		System.out.println("myDoubleValue: " + myDoubleValue);
		
		double pounds = 5;
		double kilograms = pounds * 0.45359237;
		System.out.println("kilograms: " + kilograms);

	}

}
