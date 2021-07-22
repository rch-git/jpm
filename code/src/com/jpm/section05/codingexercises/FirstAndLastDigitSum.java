package com.jpm.section05.codingexercises;

public class FirstAndLastDigitSum
{

	public static void main(String[] args)
	{
		int sum = sumFirstAndLastDigit(955512456);
		System.out.println(sum);
	}
	
	public static int sumFirstAndLastDigit (int number)
	{
		if (number < 0)
		{
			return -1;
		}
		else
		{
			int lastNumber = 0;
			
			int firstNumber = 0;
			
			if (number < 10)
			{
				firstNumber = number;
			}
			else
			{
				lastNumber = number % 10;
				do
				{
					firstNumber = number / 10;
					number = number / 10;
					
				} while (number > 10);
			}
			
			System.out.println("First number = " + firstNumber + "; Last Number: " + lastNumber);
			
			return (firstNumber + lastNumber);
		}
	}
}
