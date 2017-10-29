package com.nikos;



public class Main {

    public static void main(String[] args) {

        League<Team<FootballPlayer>> myLeague = new League<>("myLeague");

        Team<FootballPlayer> footballTeam1 = new Team<>("footballTeam1");
        Team<FootballPlayer> footballTeam2 = new Team<>("footballTeam2");
        Team<FootballPlayer> footballTeam3 = new Team<>("footballTeam3");
        Team<FootballPlayer> footballTeam4 = new Team<>("footballTeam4");
        Team<BaseballPlayer> baseballTeam1 = new Team<>("baseballTeam1");


        myLeague.add(footballTeam1);
        myLeague.add(footballTeam2);
        myLeague.add(footballTeam3);
        myLeague.add(footballTeam4);
      //  myLeague.add(baseballTeam1); cannot add a baseball team to a football league!! Verification accomplished through generics



        footballTeam1.matchResult(footballTeam2, 1, 0); // virtual match: football team1 vs football team 2
        footballTeam1.matchResult(footballTeam3, 3, 3); // virtual match: football team1 vs football team 3


        myLeague.showLeagueTable(); // will display a sorted list of teams using java.util.Collections



    }
}


