package com.jpm.section08.arrays.challenge;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysChallenge
{
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int[] a = getIntegers();
		printArray(a);
		sortArray(a);
	}
	
	public static int[] getIntegers()
	{
		System.out.println("Enter the length of the array: ");
		int arrayLength = scanner.nextInt();
		System.out.println("Size of the array is: " + arrayLength);
		
		int[] intArray = new int[arrayLength];
		
		for(int i = 0; i < intArray.length; i++)
		{
			System.out.println("Enter element [" + i + "]: ");
			intArray[i] = scanner.nextInt();
			
		}

		return intArray;
	}
	
	public static void printArray(int[] arrayToPrint)
	{
		for(int i = 0; i < arrayToPrint.length; i++)
		{
			System.out.println("[" + i + "]: " + arrayToPrint[i]);
		}
	}
	
	public static void sortArray(int[] unSortedArray)
	{
		int[] temp = unSortedArray.clone();
		
		System.out.println("Print temp array");
		printArray(temp);
		Arrays.sort(temp);
		
		temp = ArrayReverse.reverseArray(temp);
		
		System.out.println("Sorting complete.");
		printArray(temp);
	}
}