package com.jpm.codingexercises;

public class Palindrome
{

	public static void main(String[] args)
	{
		int reverseNum = palindrome(-222);
		System.out.println(reverseNum);
		
		boolean isPalindrome;
		System.out.println(isPalindrome = isPalindrome(-222));
	}
	
	public static int palindrome (int number)
	{
		int reverse = 0;
		
		do
		{
			int lastDigit = number % 10;
			reverse = reverse * 10;
			reverse += lastDigit;
			number = number / 10;
			
		} while ((number > 0) || (number < 0));
		
		return reverse;
	}
	
	public static boolean isPalindrome (int num)
	{
		int reverse = 0;
		int y = num;
			do
			{
				int lastDigit = y % 10;
				reverse = reverse * 10;
				reverse += lastDigit;
				y = y / 10;
				
			} while ((y > 0) || (y < 0));
		
		if (num == reverse)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
