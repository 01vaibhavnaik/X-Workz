package com.xwrokz.tostring.external;

public class Refrigerator {
    private String brand;
    private int capacity;
    private String color;

    public Refrigerator(String brand, int capacity, String color) {
        this.brand = brand;
        this.capacity = capacity;
        this.color = color;
        System.out.println("Refrigerator class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nCapacity: " + this.capacity + "\nColor: " + this.color;
    }
}
