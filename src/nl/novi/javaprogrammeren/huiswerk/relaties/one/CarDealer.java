package nl.novi.javaprogrammeren.huiswerk.relaties.one;

import java.util.ArrayList;
import java.util.Scanner;

public class CarDealer {
//    Instance Variables
    private String companyName;
    ArrayList<Car> carsInGarage = new ArrayList<>();

//    Constructors
    public CarDealer() {
    }

    public CarDealer(String companyName) {
        this.companyName = companyName;
    }

//    Getters
    public Car getCar(int carIndex){
        return carsInGarage.get(carIndex);
    }

    public void listCarsInGarage(){
        System.out.println("\n==\tListing the cars at the dealer\t==");
        for(Car car : carsInGarage){
            System.out.println(car.getBrand() + " " + car.getSubType());
            System.out.println("(" + car.getLicensePlate() + ")");
            System.out.println();
        }
    }

//    Setters
    public void addCarToGarage(){
        System.out.println("\n==\tAdding a new car!\t==\n");
        Scanner input = new Scanner(System.in);
        Car newCar = new Car();

        String licensePlate;
//        Check if licensePlate has the right lenght.
        do {
            System.out.println("Enter license plate:");
            licensePlate = input.nextLine();
        }while (licensePlate.length() != 8);
        newCar.setLicensePlate(licensePlate);

        System.out.println("Enter the car brand:");
        newCar.setBrand(input.nextLine());

        System.out.println("Enter the subtype:");
        newCar.setSubType(input.nextLine());

        System.out.println("Enter the amount of km driven:");
        newCar.setKmDriven(input.nextInt());

        newCar.setOwner(companyName);

        carsInGarage.add(newCar);
    }

//    Methods
    public void transferCar(CarOwner client, int carIndex){
//        Only sell if client is of legal age
        if(client.getAge() >= 18){
            Car car = carsInGarage.get(carIndex);
//            Only removes car from garage if transfer is succesfull.
            if(client.addCar(car)){
                System.out.println("\nA car has been sold! Yeah!\n");
                carsInGarage.remove(car);
            }
        }
    }
}
