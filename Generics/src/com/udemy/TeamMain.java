package com.udemy;

public class TeamMain {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Jpe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beck = new SoccerPlayer("Beck");

        Team india = new Team("India");
        india.addPlayer(joe);
        india.addPlayer(pat);
        india.addPlayer(beck);

        System.out.println(india.numPlayers());
    }
}
