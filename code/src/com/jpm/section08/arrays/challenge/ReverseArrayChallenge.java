package com.jpm.section08.arrays.challenge;

import java.util.Arrays;

public class ReverseArrayChallenge
{

	public static void main(String[] args)
	{
		int[] array = new int[] {1,2,3,4,5,6};
		System.out.println("Original array: " + Arrays.toString(array));
		reverseArray(array);
	}
	
	private static void reverseArray(int[] array)
	{
		for (int i = 0; i < array.length/2; i++)
		{
			int temp = array[i];
			array[i] = array[(array.length-1) - i];
			array[(array.length-1) - i] = temp;
		}
			
		System.out.println("Reverse Array: " + Arrays.toString(array));
	}
}
