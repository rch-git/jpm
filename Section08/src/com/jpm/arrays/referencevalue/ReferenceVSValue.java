package com.jpm.arrays.referencevalue;

import java.util.Arrays;

public class ReferenceVSValue
{
	public static void main(String[] args)
	{
		int myIntValue = 10;
		int anotherIntValue = myIntValue;
		
		System.out.println("myIntValue = " + myIntValue);
		System.out.println("anotherIntValue: " + anotherIntValue);
		
		anotherIntValue++;
		
		System.out.println("myIntValue = " + myIntValue);
		System.out.println("anotherIntValue = " + anotherIntValue);
		
//		the keyword new means that a new object is created. 
		int[] myIntArray = new int[5];
		
//		there is no new keyword, therefore, its value is via a reference
		int[] anotherArray = myIntArray;
		
		System.out.println("myIntArray = " + Arrays.toString(myIntArray));
		System.out.println("myIntArray = " + Arrays.toString(anotherArray));
		
//		This updates the array in the memory, and it affects both the variables
		anotherArray[0] = 1;
		
		System.out.println("After change, myIntArray = " + Arrays.toString(myIntArray));
		System.out.println("After change, myIntArray = " + Arrays.toString(anotherArray));
		
		anotherArray = new int[] {4,5,6,7,8};
		
		modifyArray(myIntArray);
		
		System.out.println("After modifyArray, myIntArray = " + Arrays.toString(myIntArray));
		System.out.println("After modifyArray, myIntArray = " + Arrays.toString(anotherArray));
	}
	
	private static void modifyArray(int[] array)
	{
		array[0] = 2;
		array = new int[] {1,2,3,4,5};
		System.out.println("array: " + Arrays.toString(array));
	}
}
