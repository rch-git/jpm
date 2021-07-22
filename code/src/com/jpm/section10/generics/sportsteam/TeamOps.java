package com.jpm.section10.generics.sportsteam;

public class TeamOps
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
		
		SoccerPlayer sp = new SoccerPlayer("Soccer Player 1", 5);
		SoccerPlayer sp2 = new SoccerPlayer("Soccer Player 2", 3);
		
		/**
		 * Create teams		
		 */
		Team<FootballPlayer> footballTeam = new Team<>("Football Team");
		Team<FootballPlayer> footballTeam2 = new Team<>("Football Team 2");
		
		Team<BaseballPlayer> baseballTeam = new Team<>("Baseball Team");
		Team<BaseballPlayer> baseballTeam2 = new Team<>("Baseball Team 2");
		
		Team<SoccerPlayer> soccerTeam = new Team<>("Soccer Team");
		Team<SoccerPlayer> soccerTeam2 = new Team<>("Soccer Team 2");
		
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
		
		soccerTeam.addPlayer(sp);
		System.out.println("Number of player(s) in team " + soccerTeam.getTeamName() + ": " + soccerTeam.numPlayers());
		System.out.println(sp.getStats());
		
		soccerTeam2.addPlayer(sp2);
		System.out.println("Number of player(s) in team " + soccerTeam2.getTeamName() + ": " + soccerTeam2.numPlayers());
		System.out.println(sp2.getStats());
		
		
		/**
		 * Match results
		 */
		footballTeam.matchResult(footballTeam2, 2, 3);
		footballTeam.matchResult(footballTeam2, 3, 1);
		
		baseballTeam.matchResult(baseballTeam2, 3, 5);
		baseballTeam.matchResult(baseballTeam2, 8, 1);
		
		soccerTeam.matchResult(soccerTeam2, 4, 3);
		soccerTeam.matchResult(soccerTeam2, 4, 3);
		
		
		/**
		 * print stats
		 */
		footballTeam.printTeamStats();
		footballTeam2.printTeamStats();
		
		baseballTeam.printTeamStats();
		baseballTeam2.printTeamStats();
		
		soccerTeam.printTeamStats();
		soccerTeam2.printTeamStats();
		
		/**
		 * print rankings
		 */
		System.out.println("------RANKINGS-------");
		System.out.println(footballTeam.getTeamName() + ": " + footballTeam.ranking());
		System.out.println(footballTeam2.getTeamName() + ": " + footballTeam2.ranking());
		System.out.println(soccerTeam.getTeamName() + ": " + soccerTeam.ranking());
		System.out.println(soccerTeam2.getTeamName() + ": " + soccerTeam2.ranking());
		System.out.println(baseballTeam.getTeamName() + ": " + baseballTeam.ranking());
		System.out.println(baseballTeam2.getTeamName() + ": " + baseballTeam2.ranking());
		
		/**
		 * compare teams
		 */
		System.out.println(baseballTeam.getTeamName() + " vs " + baseballTeam2.getTeamName() + ": " + baseballTeam.compareTo(baseballTeam2));
		System.out.println(soccerTeam.getTeamName() + " vs " + soccerTeam2.getTeamName() + ": " + soccerTeam.compareTo(soccerTeam2));
		System.out.println(baseballTeam.getTeamName() + " vs " + baseballTeam2.getTeamName() + ": " + baseballTeam.compareTo(baseballTeam2));
	}
}