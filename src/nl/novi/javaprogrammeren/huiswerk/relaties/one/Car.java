package nl.novi.javaprogrammeren.huiswerk.relaties.one;

public class Car {
//    Instance Variables
    private String licensePlate;
    private String brand;
    private String subType;
    private int kmDriven;
    private String owner;

//    Constructors
    public Car(){
    }

    public Car(String licensePlate, String brand, String subType, int kmDriven) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.subType = subType;
        this.kmDriven = kmDriven;
    }

//    Getters
    public String getLicensePlate(){
        return licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public String getSubType() {
        return subType;
    }

    //    Setters
    public void setLicensePlate(String licensePlate){
        this.licensePlate = licensePlate;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public void setKmDriven(int kmDriven) {
        this.kmDriven = kmDriven;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
