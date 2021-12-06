package nl.novi.javaprogrammeren.huiswerk.relaties.two;

import java.util.ArrayList;
import java.util.Scanner;

public class Club {
    private String clubName;
    private Competition clubCompetition;
    ArrayList<Player> clubPlayerList = new ArrayList<>();

    public Club(String clubName) {
        this.clubName = clubName;
    }

//    Getters

    public String getClubName() {
        return clubName;
    }

//    Setters
    public void addNewPlayer(Player newPlayer) {
        if (clubPlayerList.size() < 25){
            System.out.println("Adding a player...");
            clubPlayerList.add(newPlayer);

            // Also make sure the playerClub is set to this club.
            newPlayer.setPlayerClub(this);
        }
        else{
            System.out.println("Sorry, the club is full.");
        }
    }

    public void removePlayer(){
        if(clubPlayerList.size() > 10){
            printClubPlayerList();
            System.out.print("Who do you want to remove (enter a number): ");

            Scanner input = new Scanner(System.in);
            int playerToRemoveIndex = input.nextInt();

            clubPlayerList.remove(playerToRemoveIndex);
        }
        else{
            System.out.println("Cannot remove player,.. we are with too few!");
        }

    }

    public void setClubCompetition(Competition clubCompetition){
        this.clubCompetition = clubCompetition;
    }

    public void printClubPlayerList(){
        for(int i = 0; i < clubPlayerList.size(); i++){
            System.out.println((i +1) + "\t" + clubPlayerList.get(i).getName());
        }
    }
}


