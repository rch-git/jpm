package com.jpm.codingexercises;

import java.util.Scanner;

public class InputThenPrintSumAndAverage
{

	public static void main(String[] args)
	{
		inputThenPrintSumAndAverage();
	}
	
	public static void inputThenPrintSumAndAverage()
	{
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		double average = 0;
		int count = 0;
		
		while (true)
		{
			System.out.println("Enter number: ");
			boolean isNumber = scanner.hasNextInt();
			
			if(isNumber)
			{
				int number = scanner.nextInt();
				sum += number;
				count++;
			}
			else
			{
				break;
			}
		}
		
		average = Math.round((double) sum/count);
		
		System.out.println("SUM = " + sum + " AVG = " + average);
		
		scanner.close();	
	}
}
