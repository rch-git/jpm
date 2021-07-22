package com.jpm.section04.methods;

public class MethodOverloading
{

	public static void main(String[] args)
	{
		int newScore = calculateScore("test", 5000);
		System.out.println("New Score: " + newScore);
		calculateScore(5000);
		calculateScore();
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
	
	public static void calculateScore()
	{
		System.out.println("No score or name");
	}
}
