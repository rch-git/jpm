package com.jpm.section05.codingexercises;

public class GreatestCommonDivisor
{

	public static void main(String[] args)
	{
		 int gcd = getGreatestCommonDivisor(1010, 10);
		 System.out.println(gcd);

	}
	
	public static int getGreatestCommonDivisor (int first, int second)
	{
		int gcd = 1;
		
		if ((first < 10) || (second < 10))
		{
			return -1;
		}
		
		int minimum = Integer.min(first, second);
		
		for (int i = 2; i <= minimum; i++)
		{
			if ((first % i == 0) && (second % i == 0))
			{
				gcd = i;
			}
		}
		
		return gcd;
	}
}
