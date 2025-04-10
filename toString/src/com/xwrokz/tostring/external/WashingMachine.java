package com.xwrokz.tostring.external;

public class WashingMachine {
    private String brand;
    private int capacity;
    private String type;

    public WashingMachine(String brand, int capacity, String type) {
        this.brand = brand;
        this.capacity = capacity;
        this.type = type;
        System.out.println("WashingMachine class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nCapacity: " + this.capacity + "\nType: " + this.type;
    }
    @Override
    public int hashCode(){
        return 76548;
    }
}