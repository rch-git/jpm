package com.jpm.section04.codingexercises;

public class SpeedConverter
{

	public static void main(String[] args)
	{
		 printConversion(1.5);

	}
	
	public static long toMilesPerHour(double kilometersPerHour)
	{
		if (kilometersPerHour >= 0)
		{
			double milesPerHour = kilometersPerHour/1.609;
			milesPerHour = Math.round(milesPerHour);
			return (long) milesPerHour;
		}
		else
		{
			return -1;
		}
	}
	
	public static void printConversion(double kilometersPerHour)
	{
		if (kilometersPerHour >= 0)
		{
			long milesPerHours = toMilesPerHour(kilometersPerHour);
			System.out.println(kilometersPerHour + " km/h = " + milesPerHours + " mi/h");
		}
		else
		{
			System.out.println("Invalid Value");
		}
	}

}
