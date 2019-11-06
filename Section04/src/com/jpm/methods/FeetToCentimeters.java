package com.jpm.methods;

public class FeetToCentimeters
{

	public static void main(String[] args)
	{
//		double centimeters = calcFeetAndInchesToCentimeters(73);
		double centimeters = calcFeetAndInchesToCentimeters(6, 1);
		System.out.println("centimeters = " + centimeters);
	}
	
	public static double calcFeetAndInchesToCentimeters(int feet, int inches)
	{
		double centimeters;
		
		if ((feet < 0) || ((inches > 12) || (inches < 0)))
		{
			return -1;
		}
		else
		{
			inches += (feet * 12);
			centimeters = inches * 2.54;
			
			return centimeters;
		}
	}
	
	public static double calcFeetAndInchesToCentimeters (int inches)
	{
		if (inches < 0)
		{
			return -1;
		}
		else
		{
			int feet = inches / 12;
			inches = inches % 12;
			double centimeters = calcFeetAndInchesToCentimeters(feet, inches);
			return centimeters;
		}	
	}
}
