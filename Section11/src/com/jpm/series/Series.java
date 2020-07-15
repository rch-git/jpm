package com.jpm.series;

public class Series
{
	public static int nSum(int number)
	{
		int nSum = 0;
		
		for(int i = 0; i < number; i++)
		{
			nSum = nSum + (number - i);
		}
		
		return nSum;
	}
	
	public static int fibonacci(int n)
	{
		if (n == 0)
		{
			return 0;
		}
		else if (n == 1 || n == 2)
		{
			return 1;
		}
		else
		{
			return fibonacci(n-1) + fibonacci(n - 2);
		}
	}
	
	public static int factorial(int n)
	{
		int f = 1;
		
		for(int i = 1; i < n; i++)
		{
			f = f * i;
		}
		
		return f;
	}
}