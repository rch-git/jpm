package com.jpm.section10.generics.challenge.league;

/**
 * Abstract class for a player. 
 * Classes should extend this abstract class and implement different player types. 
 * 
 * This is an abstract class because we do not want to instantiate a player. 
 * 
 * @author Ravi
 *
 */
public abstract class Player
{
	private String playerName;
	
	public Player(String playerName)
	{
		this.playerName = playerName;
	}

	public String getPlayerName()
	{
		return playerName;
	}

	public void setPlayerName(String playerName)
	{
		this.playerName = playerName;
	}
	
	public abstract String getStats();
}
