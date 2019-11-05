package com.jpm.methods;

public class MethodOverloading
{

	public static void main(String[] args)
	{
		int newScore = calculateScore("test", 5000);
		System.out.println("New Score: " + newScore);
		newScore = calculateScore(5000);
	}
	
	public static int calculateScore(String playerName, int score)
	{
		System.out.println("Player: " + playerName + ", Score: " + score);
		return score * 1000;
	}
	
	public static int calculateScore(int score)
	{
		System.out.println("Unnamed player: , Score: " + score);
		return score * 1000;
	}

}
