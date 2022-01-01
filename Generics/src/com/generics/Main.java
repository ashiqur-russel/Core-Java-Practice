package com.generics;

public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseBallTeam pat = new BaseBallTeam("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows= new Team<>("AdelaideCrows");
        adelaideCrows.addPlayer(joe);
        System.out.println(adelaideCrows.numPlayers());

        Team<SoccerPlayer> ban = new Team<>("Ban");
        ban.addPlayer(beckham);

        Team<BaseBallTeam> eng = new Team<>("Eng");
        eng.addPlayer(pat);

        Team<FootballPlayer> melbourne= new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawton= new Team<>("Hawton");
        FootballPlayer frem = new FootballPlayer("Frem");
        melbourne.addPlayer(frem);

        hawton.matchResult(ban,1,0);
        hawton.matchResult(adelaideCrows,1,0);
        adelaideCrows.matchResult(ban,2,1);
        adelaideCrows.matchResult(hawton,3,2);




    }


}
