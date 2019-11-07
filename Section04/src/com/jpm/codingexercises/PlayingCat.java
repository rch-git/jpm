package com.jpm.codingexercises;

public class PlayingCat
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}
	public static boolean isCatPlaying (boolean summer, int temperature)
	{
		boolean isCatPlaying = false;
		if (summer)
		{
			if ((25 <= temperature) && (temperature <= 45))
			{
				isCatPlaying = true;
			}
		}
		else
		{
			if ((25 <= temperature) && (temperature <= 35))
			{
				isCatPlaying = true;
			}
		}
		
		return isCatPlaying;
	}
}
