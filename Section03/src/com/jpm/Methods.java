package com.jpm;

public class Methods
{

	public static void main(String[] args)
	{
		int finalScore = calculateScore(true, 800, 5, 50);
		System.out.println("Your final score was " + finalScore);
		finalScore = calculateScore(true, 10000, 8, 200);
		System.out.println("Your final score was " + finalScore);
		
		int position = calculateHighScore(500);
		displayHighScorePosition("xyz", position);

		
	}
	
	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus)
	{
		if (gameOver)
		{
			int finalScore = score + (levelCompleted + bonus);
			finalScore += 1000;
			return finalScore;
		}
		else
		{
			//negative one typically means its an error or invalid
			return -1;
		}
	
	}
	
	public static void displayHighScorePosition(String playerName, int position)
	{
		System.out.println("Player " + playerName + " managed to get into position " + position + " on the high score table");
	}
	
	public static int calculateHighScore(int playerScore)
	{
		int returnValue;
		if (playerScore >= 1000)
		{
			returnValue = 1;
		}
		else if (500 <= playerScore)
		{
			returnValue = 2;
		}
		else if (100 <= playerScore)
		{
			returnValue = 3;
		}
		else
		{
			returnValue = 4;
		}
		
		return returnValue;
	}
}
