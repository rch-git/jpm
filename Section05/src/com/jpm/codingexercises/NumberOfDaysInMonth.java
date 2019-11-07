package com.jpm.codingexercises;

public class NumberOfDaysInMonth
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}
	
	public static boolean isLeapYear(int year)
	{
		boolean isLeapYear = false;
		
		if (!((year <= 0) || (year > 9999)))
		{
			if (year % 4 == 0 && (year % 100 != 0))
			{
				isLeapYear = true;
			}
			else if (year % 400 == 0)
			{
				isLeapYear = true;
			}
		}
		
		return isLeapYear;
	}
	
	public static int getDaysInMonth(int month, int year)
	{
		
		boolean isLeapYear = isLeapYear(year);
		int numberOfDays = 0;
		
		if ((month < 1) || (month > 12) || (year < 0) || (year > 9999))
		{
			return -1;
		}
		else if ((month == 2) && isLeapYear)
		{
			return 29;
		}
		else if ((month == 2) && !isLeapYear)
		{
			return 28;
		}
		else
		{
			switch (month)
			{
				case 1:
					numberOfDays = 31;
					break;
				case 3:
					numberOfDays = 31;
					break;
				case 4:
					numberOfDays = 30;
					break;
				case 5:
					numberOfDays = 31;
					break;
				case 6:
					numberOfDays = 30;
					break;
				case 7:
					numberOfDays = 31;
					break;
				case 8:
					numberOfDays = 31;
					break;
				case 9:
					numberOfDays = 30;
					break;
				case 10:
					numberOfDays = 31;
					break;
				case 11:
					numberOfDays = 30;
					break;
				case 12:
					numberOfDays = 31;
					break;
			}
			
			return numberOfDays;
		}
	}
}
