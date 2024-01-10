package com.jpm.section06.controlflow._switch.challenge;

public class EnhancedSwitchExample
{
	public static void main(String[] args)
	{
		for (int i = 0; i < 8; i++)
		{
			printDayOfWeek(i);
		}
	}
	
	public static void printDayOfWeek(int day)
	{
		String dayOfWeek = switch(day)
				{
					case 0 -> "Saunday";
					case 1 -> "Monday";
					case 2 -> "Tuesday";
					case 3 -> "Wednesday";
					case 4 -> "Thursday";
					case 5 -> "Friday";
					case 6 -> "Saturday";
					default -> {
						String invalidDay = "Invalid day.";
						yield invalidDay;
					}
				}; 
		
		System.out.println(day + ": " + dayOfWeek);
//		System.out.println(day + ": " + returnDay(day));
	}
	
//	public static String returnDay (int day)
//	{
//		return switch(day)
//				{
//					case 0 -> "Saunday";
//					case 1 -> "Monday";
//					case 2 -> "Tuesday";
//					case 3 -> "Wednesday";
//					case 4 -> "Thursday";
//					case 5 -> "Friday";
//					case 6 -> "Saturday";
//					default -> {
//						String invalidDay = "Invalid day.";
//						yield invalidDay;
//					}
//				};
//	}
}