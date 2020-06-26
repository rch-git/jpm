package com.jpm.generics.challenge.league;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team<Player>>
{
	public String leagueName;
	private ArrayList<T> league = new ArrayList<>();
	
	public League(String leagueName)
	{
		super();
		this.leagueName = leagueName;
	}

	public boolean addTeam(T team)
	{
		if(!league.contains(team))
		{
			league.add(team);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void showLeagueTable()
	{
		Collections.sort(league);
	}
}