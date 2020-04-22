package com.jpm.arrays.solution;

import java.util.Arrays;

public class ReverseArraySolution
{
	public static void main(String[] args)
	{
		int[] array = new int[] {55,33,-1, 77, 333,999, -9999};
		System.out.println("Original array: " + Arrays.toString(array));
		reverseArray(array);
		System.out.println("Reversed array: " + Arrays.toString(array));
	}
	
	private static void reverseArray(int[] array)
	{
		int maxIndex = array.length -1;
		int halfLength = array.length / 2;
		
		for (int i = 0; i < halfLength; i++)
		{
			int temp = array[i];
			array[i] = array[maxIndex - i];
			array[maxIndex - i] = temp;
		}
	}
}