package com.xwrokz.tostring.external;

public class Microwave {
    private String brand;
    private int capacity;
    private String color;

    public Microwave(String brand, int capacity, String color) {
        this.brand = brand;
        this.capacity = capacity;
        this.color = color;
        System.out.println("Microwave class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nCapacity: " + this.capacity + "\nColor: " + this.color;
    }
}
