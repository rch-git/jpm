package com.jpm.generics.sportsteam;

public class TeamOps
{

	public static void main(String[] args)
	{
		FootballPlayer fp = new FootballPlayer("Football Player 1", 2);
		FootballPlayer fp2 = new FootballPlayer("Football Player 2", 4);
		BaseballPlayer bp = new BaseballPlayer("Baseball Player 1", 3);
		SoccerPlayer sp = new SoccerPlayer("Soccer Player 1", 5);
		
		Team<FootballPlayer> footballTeam = new Team<>("Football Team");
		Team<FootballPlayer> footballTeam2 = new Team<>("Football Team 2");

		footballTeam.addPlayer(fp);
		System.out.println("Number of player(s) in team " + footballTeam.getTeamName() + ": " + footballTeam.numPlayers());
		System.out.println(fp.getStats());
		
		footballTeam2.addPlayer(fp2);
		System.out.println("Number of player(s) in team " + footballTeam2.getTeamName() + ": " + footballTeam2.numPlayers());
		System.out.println(fp2.getStats());
		
		footballTeam.matchResult(footballTeam2, 2, 3);
		footballTeam2.matchResult(footballTeam, 3, 1);
		footballTeam.matchResult(footballTeam2, 1, 1);
		
		footballTeam.printTeamStats();
		footballTeam2.printTeamStats();
		
		
		Team<BaseballPlayer> baseballTeam = new Team<>("Baseball Team");
		baseballTeam.addPlayer(bp);
		System.out.println("Number of player(s) in team " + baseballTeam.getTeamName() + ": " + baseballTeam.numPlayers());
		System.out.println(bp.getStats());
		
		Team<SoccerPlayer> soccerTeam = new Team<>("Soccer Team");
		soccerTeam.addPlayer(sp);
		System.out.println("Number of player(s) in team " + soccerTeam.getTeamName() + ": " + soccerTeam.numPlayers());
		System.out.println(sp.getStats());
		
		
	}

}
