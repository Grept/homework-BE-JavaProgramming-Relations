package nl.novi.javaprogrammeren.huiswerk.relaties.two;

public class Player {
    private Club myClub = null;
    private String name = null;


    //    CONSTRUCTORS
    public Player() {
    }

    public Player(Club myClub) {
        this.myClub = myClub;
    }

    public Player(String name) {
        this.name = name;
    }

    public Player(Club myClub, String name) {
        this.myClub = myClub;
        this.name = name;
    }


    //    SETTERS
    public void setPlayerClub(Club myClub) {
        this.myClub = myClub;
    }

    public void setName(String name) {
        this.name = name;
    }

    //    GETTERS
    public Club getPlayerClub() {
        return myClub;
    }

    public String getName() {
        return name;
    }
}
