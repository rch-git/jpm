package com.jpm.section08.arrays.challenge;

import java.util.Scanner;

public class MinimumElement
{
	private static Scanner scanner = new Scanner(System.in);
	
	public static int[] readIntegers(int count)
	{
		int[] myArray = new int[count];
		
		for (int i = 0; i < count; i++)
		{
			System.out.println("Enter element [" + i + "]: ");
			myArray[i] = scanner.nextInt();
			scanner.nextLine();
		}
		
		return myArray;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Enter the count: ");
		int count = scanner.nextInt();
		
		int[] myArray = readIntegers(count);
		printArray(myArray);
		int min = findMin(myArray);
		System.out.println("Min = " + min);
	}
	
	private static void printArray(int[] array)
	{
		for (int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
	}
	
	private static int findMin(int[] array)
	{
		int min = array[0];
		
		for (int i = 0; i < array.length; i++)
		{
			if (min > array[i])
			{
				min = array[i];
			}
		}
		
		return min;
	}
}
