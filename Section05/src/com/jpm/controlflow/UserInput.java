package com.jpm.controlflow;

import java.util.Calendar;
import java.util.Scanner;

public class UserInput
{

	public static void main(String[] args)
	{
		int year = Calendar.getInstance().get(Calendar.YEAR);
//		int year = Calendar.YEAR;
		System.out.println("current year: " + year);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the year of birth: ");
		boolean hasNextInt = scanner.hasNextInt();
		
		if (hasNextInt)
		{	
			int yearOfBirth = scanner.nextInt();
			
			if (yearOfBirth < 0)
			{
				System.out.println("Invalid");
			}
			
			else
			{
//				If this line doesnt exist, then the program will skip accepting the input 
//				for name.
				scanner.nextLine();
				 
				System.out.println("Enter name: ");
				String name = scanner.nextLine();
				
				int age = year - yearOfBirth;
				
				System.out.println("Name: " + name +  ", age: " + age);
				
				scanner.close();
			}
		}
		else
		{
			System.out.println("Integers only");
		}
	}
}