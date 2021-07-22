package com.jpm.section10.generics.sportsteam;

import java.util.ArrayList;
/**
 * Class to create a team. Instantiate this class with a specific player type
 * Ex - Team<FootballPlayer> x = new Team<>("x");
 * We make use of Generics to ensure that a team can only have a specific type of player
 * 
 * Without <T extends Player>, it would be possible to instantiate Team<String> = new Team<>("xyz")
 * which is incorrect. 
 * 
 * @author Ravi
 *
 * @param <T>
 */
public class Team<T extends Player> implements Comparable<Team<T>>
{
	private String teamName;
	private int played = 0;
	private int won = 0;
	private int lost = 0;
	private int tied = 0;
	
	private ArrayList<T> members = new ArrayList<T>();
	
	public Team(String teamName)
	{
		this.teamName = teamName;
	}
	
	public String getTeamName()
	{
		return this.teamName;
	}
	
	public boolean addPlayer(T player)
	{
		if(members.contains(player))
		{
			System.out.println(player.getPlayerName() + " is already in the team.");
			return false;
		}
		else
		{
			members.add(player);
			System.out.println(player.getPlayerName() + " added to " + this.teamName);
			return true;
		}
	}
	
	public int numPlayers()
	{
		return this.members.size();
	}
	
	/**
	 * This method takes in a team, and a set of scores to calculate the result. 
	 * Team<T> opponent ensures that a only teams of same sport can compete with each other.
	 * 
	 * footballTeam.matchResult(baseballTeam, 2, 3); is invalid
	 * 
	 * @param opponent
	 * @param ourScore
	 * @param theirScore
	 */
	public void matchResult(Team<T> opponent, int ourScore, int theirScore)
	{
		if(ourScore > theirScore)
		{
			this.won++;
		}
		else if(theirScore > ourScore)
		{
			this.lost++;
		}
		else
		{
			this.tied++;
		}
		this.played++;
		if(opponent != null)
		{
//			This is done to set the stats for the opponent team as well
//			null is passed to ensure that we are not caught in an infinite loop
			opponent.matchResult(null, theirScore, ourScore);
		}
	}
	
	public void printTeamStats()
	{
		System.out.println("Stats for team: " + this.teamName);
		System.out.println("Played: " + this.played);
		System.out.println("Won: " + this.won);
		System.out.println("Lost: " + this.lost);
		System.out.println("Tied: " + this.tied);
	}
	
	public int ranking()
	{
		return (won * 2) + tied;
	}

	@Override
	public int compareTo(Team<T> o)
	{
		if(this.ranking() > o.ranking())
		{
			return -1;
		}
		else if(this.ranking() < o.ranking())
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}