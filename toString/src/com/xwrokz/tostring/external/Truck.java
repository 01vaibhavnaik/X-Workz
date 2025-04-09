package com.xwrokz.tostring.external;

public class Truck {
    private String model;
    private int capacity;
    private String engineType;

    public Truck(String model, int capacity, String engineType) {
        this.model = model;
        this.capacity = capacity;
        this.engineType = engineType;
        System.out.println("Truck class constructor running");
    }

    @Override
    public String toString() {
        return "Model: " + this.model + "\nCapacity: " + this.capacity + "\nEngine Type: " + this.engineType;
    }
}