package com.jpm.section10.generics.sportsteam;


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
