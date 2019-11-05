package com.jpm.codingexercises;

public class TeenNumberChecker
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}
	
	public static boolean hasTeen(int num1, int num2, int num3)
	{
		boolean hasTeen = false;
		
		if (((13 <= num1) && (num1 <= 19)) || ((13 <= num2) && (num2 <= 19)) || ((13 <= num3) && (num3 <= 19)))
		{
			hasTeen = true;
		}
		
		return hasTeen;
	}
	
	public static boolean isTeen (int num1)
	{
		boolean isTeen = false;
		
		if ((13 <= num1) && (num1 <= 19))
		{
			isTeen = true;
		}
		
		return isTeen;
	}
}
