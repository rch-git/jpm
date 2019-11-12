package com.jpm.codingexercises;

public class PerfectNumber
{

	public static void main(String[] args)
	{
		 boolean isPerfectNumber = isPerfectNumber(28);
		 System.out.println(isPerfectNumber);

	}
	
	public static boolean isPerfectNumber (int number)
	{
		int sum = 0;
		if (number < 1)
		{
			return false;
		}
		
		for (int i = 1; i < number; i++)
		{
			if (number % i == 0)
			{
				sum += i;
			}
		}
		
		if (sum == number)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
