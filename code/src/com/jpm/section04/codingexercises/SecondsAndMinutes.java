package com.jpm.section04.codingexercises;

public class SecondsAndMinutes
{
	private static final String INVALID_VALUE_MESSAGE = "Invalid value";

	public static void main(String[] args)
	{
		 System.out.println(getDurationString(8, 8));
		 System.out.println(getDurationString(8));
	}
	
	public static String getDurationString(long minutes, long seconds)
	{
		if ((seconds < 0) || (minutes < 0) || (seconds > 59))
		{
			return INVALID_VALUE_MESSAGE;
		}
		else
		{
			long hours = minutes / 60;
			minutes = minutes % 60;
			
			String hoursString = hours + "h";
			if (hours < 10)
			{
				hoursString = "0" + hoursString;
			}
			
			String minutesString = minutes + "m";
			if (minutes < 10)
			{
				minutesString = "0" + minutesString;
			}
			
			String secondsString = seconds + "s";
			if (seconds < 10)
			{
				secondsString = "0" + secondsString;
			}
			
//			String time = hours + "h " + minutes + "m " + seconds + "s";
			return hoursString + " " + minutesString + " " + secondsString;
		}
	}

	private static String getDurationString (long seconds)
	{
		if (seconds < 0)
		{
			return INVALID_VALUE_MESSAGE;
		}
		else
		{
			long minutes = seconds / 60;
			seconds = seconds % 60;
			return getDurationString(minutes, seconds);
		}
	}
}
