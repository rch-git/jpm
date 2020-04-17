package com.jpm.arrays.challenge;

public class ArrayReverse
{
	public static int[] reverseArray(int[] inputArray)
	{
		int[] temp = inputArray.clone();
		int[] reversedArray = new int[temp.length];
		
		for (int i = 0; i < temp.length; i++)
		{
			reversedArray[i] = temp[(temp.length-1) - i];
		}
		
		return reversedArray;
	}
	
	public static void main(String[] args)
	{
		int[] a = {88,66,44,99,11,3,5, 999};
		int[] b = reverseArray(a);
		for (int i = 0; i < b.length; i++)
		{
			System.out.println("b[" + i + "]: " + b[i]);
		}
	}
}
