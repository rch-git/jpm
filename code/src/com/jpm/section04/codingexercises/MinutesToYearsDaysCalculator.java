package com.jpm.section04.codingexercises;

public class MinutesToYearsDaysCalculator
{
	private static long MINUTES_IN_YEAR = 525600;
	private static long MINUTES_IN_DAY = 1440;
	
//	public static void main(String[] args)
//	{
//		// TODO Auto-generated method stub
//
//	}
	
	public static void printYearsAndDays (long minutes)
	{
		if (minutes < 0)
		{
			System.out.println("Invalid Value");
		}
		else
		{
			int years = (int) (minutes / MINUTES_IN_YEAR);
			long days = (minutes % MINUTES_IN_YEAR) / MINUTES_IN_DAY;
			
			System.out.println(minutes + " min = " + years + " y and " + days + " d");
		}
	}
}
