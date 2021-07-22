package com.jpm.section08.arrays.solution;

import java.util.Scanner;

public class MinChallenge
{
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.println("Enter the count: ");
		int count = scanner.nextInt();
		scanner.nextLine();
		
		int[] returnedArray = readIntegers(count);
		int returnedMin = findMin(returnedArray);
		
		System.out.println("Min = " + returnedMin);
	}
	
	private static int[] readIntegers(int count)
	{
		int[] myArray = new int[count];
		
		for (int i = 0; i < myArray.length; i++)
		{
			System.out.println("Enter a number: ");
			int number = scanner.nextInt();
			scanner.hasNextLine();
			myArray[i] = number;
		}
		
		return myArray;
	}
	
	private static int findMin(int[] array)
	{
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < array.length; i++)
		{
			int value = array[i];
			if(value < min)
			{
				min = value;
			}
		}
		
		return min;
	}
}
