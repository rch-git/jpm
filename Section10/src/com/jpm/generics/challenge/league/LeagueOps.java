package com.jpm.generics.challenge.league;

public class LeagueOps
{
	public static void main(String[] args)
	{
		/**
		 * Create players
		 */
		FootballPlayer fp = new FootballPlayer("Football Player 1", 2);
		FootballPlayer fp2 = new FootballPlayer("Football Player 2", 4);
		
		BaseballPlayer bp = new BaseballPlayer("Baseball Player 1", 3);
		BaseballPlayer bp2 = new BaseballPlayer("Baseball Player 2", 4);
		
		/**
		 * Create teams		
		 */
		Team<FootballPlayer> footballTeam = new Team<>("Football Team");
		Team<FootballPlayer> footballTeam2 = new Team<>("Football Team 2");
		
		Team<BaseballPlayer> baseballTeam = new Team<>("Baseball Team");
		Team<BaseballPlayer> baseballTeam2 = new Team<>("Baseball Team 2");
		
		/**
		 * Add players to teams
		 */
		footballTeam.addPlayer(fp);
		System.out.println("Number of player(s) in team " + footballTeam.getTeamName() + ": " + footballTeam.numPlayers());
		System.out.println(fp.getStats());
		
		footballTeam2.addPlayer(fp2);
		System.out.println("Number of player(s) in team " + footballTeam2.getTeamName() + ": " + footballTeam2.numPlayers());
		System.out.println(fp2.getStats());
		
		baseballTeam.addPlayer(bp);
		System.out.println("Number of player(s) in team " + baseballTeam.getTeamName() + ": " + baseballTeam.numPlayers());
		System.out.println(bp.getStats());
		
		baseballTeam2.addPlayer(bp2);
		System.out.println("Number of player(s) in team " + baseballTeam2.getTeamName() + ": " + baseballTeam2.numPlayers());
		System.out.println(bp2.getStats());
		
		/**
		 * Match results
		 */
		footballTeam.matchResult(footballTeam2, 2, 3);
		footballTeam.matchResult(footballTeam2, 3, 1);
		
		baseballTeam.matchResult(baseballTeam2, 3, 5);
		baseballTeam.matchResult(baseballTeam2, 8, 1);
		
		/**
		 * print rankings
		 */
		System.out.println("------RANKINGS-------");
		System.out.println(footballTeam.getTeamName() + ": " + footballTeam.ranking());
		System.out.println(footballTeam2.getTeamName() + ": " + footballTeam2.ranking());
		System.out.println(baseballTeam.getTeamName() + ": " + baseballTeam.ranking());
		System.out.println(baseballTeam2.getTeamName() + ": " + baseballTeam2.ranking());
		
		League<Team<FootballPlayer>> footballLeague = new League<>("FL1");
		footballLeague.add(footballTeam);
		footballLeague.add(footballTeam2);
		System.out.println("--League Table--");
		footballLeague.showLeagueTable();
	}
}