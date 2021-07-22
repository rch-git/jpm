package com.jpm.section04.codingexercises;

public class DecimalComparator
{
	public static void main(String[] args)
	{
		 boolean areEqual = areEqualByThreeDecimalPlaces(3.176, 3.175);
		 System.out.println(areEqual);
	}
	
	public static boolean areEqualByThreeDecimalPlaces(double d1, double d2)
	{
		boolean areEqual = false;
		int i1 = (int) (d1 * 1000);
		int i2 = (int) (d2 * 1000);
		
		if (i1 == i2)
		{
			areEqual = true;
		}
		
		return areEqual;
	}
}
