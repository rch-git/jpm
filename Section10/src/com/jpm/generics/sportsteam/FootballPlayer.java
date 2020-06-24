package com.jpm.generics.sportsteam;

public class FootballPlayer extends Player
{
	private int numberOfTouchdowns;
	
	public FootballPlayer(String playerName, int numberOfTouchdowns)
	{
		super(playerName);
		this.numberOfTouchdowns = numberOfTouchdowns;
	}
	
	public FootballPlayer(String playerName)
	{
		this(playerName, 0);
	}

	@Override
	public String getStats()
	{
		// TODO Auto-generated method stub
		return "Number of touchdowns: " + this.numberOfTouchdowns;
	}
	
}
