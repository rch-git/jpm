package com.jpm.section04.codingexercises;

public class LeapYear
{

	public static void main(String[] args)
	{
		boolean b = isLeapYear(1800);
		System.out.println(b);

	}
	
	public static boolean isLeapYear(int year)
	{
		boolean isLeapYear = false;
		
		if (!((year <= 0) || (year > 9999)))
		{
			if (year % 4 == 0 && (year % 100 != 0))
			{
				isLeapYear = true;
			}
			else if (year % 400 == 0)
			{
				isLeapYear = true;
			}
		}
		
		return isLeapYear;
	}
}
