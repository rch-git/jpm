package com.jpm.section06.controlflow._switch;

public class SwitchMain
{
	public static void main(String[] args)
	{
		int value = 5;
//		if (value ==1)
//		{
//			System.out.println("Value was 1");
//		}
//		else if (value == 2)
//		{
//			System.out.println("Value was 2");
//		}
//		else
//		{
//			System.out.println("Value: " + value);
//		}
		
		switch(value)
		{
			case 1:
				System.out.println("Value was 1");
				break;
			case 2:
				System.out.println("Value was 2");
				break;
			default:
				System.out.println("Printing default value: " + value);
				break;
		}
		
//		String month = "APR";
		String month = "XYZ";
		System.out.println(month + " is in: " + getQuarter(month));
	}
	
	public static String getQuarter(String month)
	{
//		Regular case statement
//		switch(month)
//		{
//			case "JANUARY":
//			case "FEBRUARY":
//			case "MARCH":
//				return "1st";
//			case "APRIL":
//			case "MAY":
//				return "2nd";
//			case "AUGUST":
//			case "SEP":
//				return "3rd";
//			case "NOV":
//			case "DEC":
//				return "4th";
//		}
		
//		enhanced case statement. Java 17+. Not supported in Java 1.8
		return switch(month)
				{
			case "JAN", "FEB", "MAR" -> "1st Q";
			case "APR", "MAY", "JUN" -> "2nd Q";
			case "JUL", "AUG", "SEP" -> "3rd Q";
			case "OCT", "NOV", "DEC" -> "4th Q";
//			default -> "BAD";
//			Using yield is necessary when there is a code block
			default -> {
				String badResponse = "BAD QUARTER";
				yield badResponse;
			}
				};
		
//		return "Bad month";
	}
	
	/*
	 * Syntax for switch statement
	 * 
	 * switch(value)
	 * {
	 * 	case x: 
	 * 		some code for x
	 * 		break;
	 * 	case y:
	 * 		some code for y
	 * 		break;
	 * 	default:
	 * 		some code for default
	 * 		break;
	 * }
	 */
	
	
}
