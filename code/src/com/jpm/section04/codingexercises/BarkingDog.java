package com.jpm.section04.codingexercises;

public class BarkingDog
{

	public static void main(String[] args)
	{
		boolean b = shouldWakeUp(true, 44);
		System.out.println(b);

	}
	
	public static boolean shouldWakeUp(boolean barking, int hourOfDay)
	{
		if(barking && (0 <= hourOfDay && hourOfDay <= 23))
		{
			if ((hourOfDay < 8 || hourOfDay > 22) )
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}

}
