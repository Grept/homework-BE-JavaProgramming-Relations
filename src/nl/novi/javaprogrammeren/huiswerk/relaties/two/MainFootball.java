package nl.novi.javaprogrammeren.huiswerk.relaties.two;

import java.util.ArrayList;

public class MainFootball {

    /*
     * Programmeer de volgende relaties:
     * Een competitie kan minimaal 18 en maximaal 18 clubs hebben.
     * Een club kan bij 1 competitie horen en minimaal 18 spelers en maximaal 25 spelers hebben.
     * Een speler kan bij 1 club horen.
     *
     * Extra: Je moet via het speler object kunnen zeggen in welke competitie de speler speelt.
     */

    public static void main(String[] args) {

        ArrayList<Club> listOfClubs = new ArrayList<>();
        listOfClubs.add(new Club("PSV"));
        listOfClubs.add(new Club("Ajax"));
        listOfClubs.add(new Club("Feyenoord"));
        listOfClubs.add(new Club("FC Utrecht"));
        listOfClubs.add(new Club("SC Cambuur"));
        listOfClubs.add(new Club("Vitesse"));
        listOfClubs.add(new Club("FC Twente"));
        listOfClubs.add(new Club("Go Ahead Eagles"));
        listOfClubs.add(new Club("N.E.C."));
        listOfClubs.add(new Club("sc Heerenveen"));
        listOfClubs.add(new Club("Willem II"));
        listOfClubs.add(new Club("AZ"));
        listOfClubs.add(new Club("FC Groningen"));
        listOfClubs.add(new Club("Heracles Almelo"));
        listOfClubs.add(new Club("RKC Waalwijk"));
        listOfClubs.add(new Club("Sparta Rotterdam"));
        listOfClubs.add(new Club("PEC Zwolle"));
//        listOfClubs.add(new Club("Fortuna Sittard"));

        Competition eredivisie = new Competition("Eredivisie", listOfClubs);
        eredivisie.listClubs();

    }
}
