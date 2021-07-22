package com.jpm.section05.codingexercises;

public class EvenDigitSum
{

	public static void main(String[] args)
	{
		 int sum = getEvenDigitSum(8);
		 System.out.println(sum);

	}
	
	public static int getEvenDigitSum(int number)
	{
		int sum = 0;
		if (number >= 0)
		{
			int extractedNumber = 0;
			do
			{
				extractedNumber = number % 10;
				number = number /10;
				if (extractedNumber % 2 == 0)
				{
					sum += extractedNumber;
				}
			} while (number > 0);
			
			return sum;
		}
		
		return -1;
	}

}
