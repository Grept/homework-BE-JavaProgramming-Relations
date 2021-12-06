package nl.novi.javaprogrammeren.huiswerk.relaties.two;

import java.util.ArrayList;

public class Competition {
    private String competitionName = "Competition X";
    private ArrayList<Club> clubsInCompetition = new ArrayList<>();

    //    CONSTRUCTORS
    public Competition(String competitionName, ArrayList<Club> clubs) {
        this.competitionName = competitionName;
        if (clubs.size() > 10 && clubs.size() < 18) {
            this.clubsInCompetition = clubs;
        } else {
            System.out.println("WARNING: Club-list not set. Competition can only contain between 10 and 18 clubs.");
        }
    }

    public Competition(String competitionName) {
        this.competitionName = competitionName;
    }

    //    SETTERS
    public void addClub(Club newClub) {
        if (clubsInCompetition.size() < 18) {
            clubsInCompetition.add(newClub);

            // Also make sure the club is set to this competition.
            newClub.setClubCompetition(this);
        } else {
            System.out.println("Sorry cannot add another club, competition is full.");
        }
    }

    public void printClubsInCompetition() {
        for (Club c : clubsInCompetition) {
            System.out.println(c.getClubName());
        }
    }

    public String getCompetitionName() {
        return competitionName;
    }
}
