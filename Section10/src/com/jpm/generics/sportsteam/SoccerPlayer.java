package com.jpm.generics.sportsteam;

public class SoccerPlayer extends Player
{
	private int numberOfGoals;
	
	public SoccerPlayer(String playerName, int numberOfGoals)
	{
		super(playerName);
		this.numberOfGoals = numberOfGoals;
	}
	
	public SoccerPlayer(String playerName)
	{
		this(playerName, 0);
	}

	@Override
	public String getStats()
	{
		// TODO Auto-generated method stub
		return "Number of goals: " + this.numberOfGoals;
	}

}
