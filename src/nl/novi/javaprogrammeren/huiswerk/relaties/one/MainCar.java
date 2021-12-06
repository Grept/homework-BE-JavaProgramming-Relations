package nl.novi.javaprogrammeren.huiswerk.relaties.one;

public class MainCar {
    /*
    Maak de volgende drie klassen:
    CarOwner, Car, CarDealer.

    Verzin zelf wat simpele instance variables bij CarOwner en CarDealer.
    Car heeft: kenteken, merk, subtype, aantalKmGereden

    Een CarOwner kan 0 of meerdere auto's hebben.
    Een CarDealer kan 0 of meerdere auto's hebben.
    Een Car kan 0 of 1 owner hebben (alleen CarOwner-klasse). Wanneer de auto bij de dealer staat is de carowner
    leeg (null).

    Voeg aan de CarDealer een methode toe die een auto vanuit zijn garage kan overschrijven naar de CarOwner. Zowel
    de list van CarOwner moet dan uitgebreid worden als de eigenaar van de Car moet aangepast worden. We hebben het hier
    dus over een bidirectionele relatie!

    Zorg ervoor dat alleen unieke auto's op basis van een kenteken aan de List van CarDealer en CarOwner toegevoegd
    kunnen worden.

    Extra: Voeg een variabele leeftijd toe aan CarOwner. Check daarna altijd of de CarOwner wel 18 of ouder is.

     */
    public static void main(String[] args) {

        CarDealer dealer1 = new CarDealer("DiscountCars");
        CarOwner owner1 = new CarOwner("Tom");

//        The dealer aquires two cars
        dealer1.addCarToGarage();
        dealer1.addCarToGarage();

//        The dealer shows the cars he has
        dealer1.listCarsInGarage();

//        The dealer sells a car to the client
        dealer1.transferCar(owner1, 1);

//        The client shows his cars
        owner1.listCarsOwned();

//        The dealer shows his remaining cars
        dealer1.listCarsInGarage();
    }
}
