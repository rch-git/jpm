package com.jpm.section05.controlflow;

import java.util.Scanner;

public class MinMax
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		 int min = Integer.MAX_VALUE;
		 int max = Integer.MIN_VALUE;
		 		 
		 while (true)
		 {
			 System.out.println("Enter number: ");
			 boolean isNumber = scanner.hasNextInt();
			 
			 if (isNumber)
			 {
				 int number = scanner.nextInt();
				 
				 if (number > max)
				 {
					 max = number;
				 }
				 if (number < min)
				 {
					 min = number;
				 }
			 }
			 else
			 {
				 System.out.println("");
				 break;
			 }
			 
			 scanner.nextLine();
		 }
		 
		 System.out.println("Min = " + min + ", Max = " + max);
		 
		 scanner.close();
	}
}