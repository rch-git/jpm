package com.jpm.generics.challenge.league;


public class BaseballPlayer extends Player
{
	private int numberOfHomeRuns;
	
	public BaseballPlayer(String playerName, int numberOfHomeRuns)
	{
		super(playerName);
		this.numberOfHomeRuns = numberOfHomeRuns;
		// TODO Auto-generated constructor stub
	}
	
	public BaseballPlayer(String playerName)
	{
		this(playerName, 0);
	}
	
	@Override
	public String getStats()
	{
		return "Number of home runs: " + this.numberOfHomeRuns;
	}
}
