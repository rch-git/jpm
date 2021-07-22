package com.jpm.section05.codingexercises;

public class SharedDigit
{

	public static void main(String[] args)
	{
		 boolean hasSharedDigit = hasSharedDigit(12, 43);
		 System.out.println(hasSharedDigit);
	}
	
	public static boolean hasSharedDigit (int num1, int num2)
	{
		if ((num1 < 10) || (num1 > 99) || (num2 < 10) || (num2 > 99))
		{
			return false;
		}
		else
		{
			int d1 = num1 % 10;
			if (d1 == (num2 % 10) || d1 == (num2 / 10))
			{
				return true;
			}
			
			d1 = num1 / 10;
			if (d1 == (num2 % 10) || d1 == (num2 / 10))
			{
				return true;
			}
			
			return false;
		}
	}

}
