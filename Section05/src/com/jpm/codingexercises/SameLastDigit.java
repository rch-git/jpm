package com.jpm.codingexercises;

public class SameLastDigit
{

	public static void main(String[] args)
	{

	}
	
	public static boolean hasSameLastDigit(int one, int two, int three)
	{

		if (isValid(one) && isValid(two) && isValid(three))
		{
			if ((one % 10) == (two % 10))
				return true;
			else if ((one % 10) == (three % 10))
				return true;
			else return (two % 10) == (three % 10);
		}

		return false;
	}

	public static boolean isValid(int number)
	{
		return (number >= 10) && (number <= 1000);
	}
}