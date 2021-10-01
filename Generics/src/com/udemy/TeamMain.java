package com.udemy;

public class TeamMain {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Jpe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beck = new SoccerPlayer("Beck");


        // Any game players are added in team( it shouldn't be )

        Team<FootballPlayer> india = new Team("India");
        india.addPlayer(joe);

        // india.addPlayer(pat);
        //india.addPlayer(beck);

        System.out.println(india.numPlayers());

        Team<BaseballPlayer> Ban = new Team<>("Bangladesh");
        Ban.addPlayer(pat);

        Team<SoccerPlayer> brokenTeam = new Team<>("This won't Work");
        brokenTeam.addPlayer(beck);

        Team<FootballPlayer> ger = new Team<>("Germany");
        Team<FootballPlayer> eng = new Team<>("England");

        ger.matchResult(eng, 1, 0);
        ger.matchResult(india, 3, 8);

        Ban.matchResult(india, 2, 1);
        Ban.matchResult(ger, 4, 5);

    }
}
