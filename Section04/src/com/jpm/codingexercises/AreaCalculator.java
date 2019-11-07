package com.jpm.codingexercises;

public class AreaCalculator
{

	public static void main(String[] args)
	{
		 
	}
	
	public static double area(double radius)
	{
		if (radius < 0)
		{
			return -1;
		}
		
		double area = Math.PI * (radius * radius);
		return area;
	}
	
	public static double area (double x, double y)
	{
		if ((x < 0) || (y < 0))
		{
			return -1;
		}
		
		double area = x * y; 
		return area;
	}

}
