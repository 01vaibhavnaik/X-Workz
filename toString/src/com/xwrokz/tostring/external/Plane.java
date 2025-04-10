package com.xwrokz.tostring.external;

public class Plane {
    private String airline;
    private int seatingCapacity;
    private String engineType;

    public Plane(String airline, int seatingCapacity, String engineType) {
        this.airline = airline;
        this.seatingCapacity = seatingCapacity;
        this.engineType = engineType;
        System.out.println("Plane class constructor running");
    }

    @Override
    public String toString() {
        return "Airline: " + this.airline + "\nSeating Capacity: " + this.seatingCapacity + "\nEngine Type: " + this.engineType;
    }
    @Override
    public int hashCode(){
        return 2862;
    }
}
