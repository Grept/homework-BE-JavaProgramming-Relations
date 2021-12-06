package nl.novi.javaprogrammeren.huiswerk.relaties.one;

import java.util.ArrayList;

public class CarOwner {
//    Instance Variables
    private String name;
    private ArrayList<Car> carsOwned = new ArrayList<>();
    private int age;

//    Constructors
    public CarOwner() {
    }

    public CarOwner(String name) {
        this.name = name;
    }

//    Getters
    public int getAge() {
        return age;
    }

    //    Methods
    public boolean addCar(Car newCar){
//        Declines transfer if license-plate is missing. Lets caller know if transfer is succesfull.
        if (newCar.getLicensePlate() != null){
            newCar.setOwner(name);
            carsOwned.add(newCar);
            return true;
        } else{
            System.out.println("Cannot transfer car: Missing license-plate!!");
            return false;
        }
    }

    public void listCarsOwned() {
        System.out.println("I am " + name + ", these are my cars.");
        for (Car car : carsOwned) {
            System.out.println(car.getBrand() + " " + car.getSubType());
            System.out.println("(" + car.getLicensePlate() + ")");
            System.out.println();
        }
    }
}
