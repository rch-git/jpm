package com.jpm.section06.controlflow._switch.challenge;

public class NumberOfDaysInMonth
{
	public static void main(String[] args)
	{
		
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
		if(month > 12 || month < 1 || year > 9999 || year < 0)
		{
			return -1;
		}
		boolean isLeapYear = isLeapYear(year);
		
		return switch(month)
				{
					case 1 -> 31;
					case 2 -> {
						if(isLeapYear)
						{
							yield 29;
						}
						else
						{
							yield 28;
						}
						
					}
					case 3 -> 31;
					case 4 -> 30;
					case 5 -> 31;
					case 6 -> 30;
					case 7 -> 31;
					case 8 -> 31;
					case 9 -> 30;
					case 10 -> 31;
					case 11 -> 30;
					case 12 -> 31;
					default -> -1;
				};
			
	}
}
