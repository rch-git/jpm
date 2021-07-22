package com.jpm.section05.controlflow;

public class DayOfTheWeek
{

	public static void main(String[] args)
	{
		printDayOfTheWeek(1);
		printDayOfTheWeek("sunday");
	}
	
	public static void printDayOfTheWeek (int day)
	{
		switch (day)
		{
			case 0:
				System.out.println("Sunday");
				break;
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			default:
				System.out.println("Invalid day");
				break;
		}	
	}
	
	public static void printDayOfTheWeek (String day)
	{
		day = day.toLowerCase();
		
		switch(day)
		{
			case "sunday": case "monday": case "tuesday": case "wednesday": case "thursday": case "friday": case "saturday": 
				System.out.println("valid");
				break;
			default:
				System.out.println("invalid");
				break;
		}
	}
}