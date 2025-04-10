package com.xwrokz.tostring.external;

public class Tent {
    private String brand;
    private int capacity;
    private String color;

    public Tent(String brand, int capacity, String color) {
        this.brand = brand;
        this.capacity = capacity;
        this.color = color;
        System.out.println("Tent class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nCapacity: " + this.capacity + "\nColor: " + this.color;
    }
    @Override
    public int hashCode(){
        return 8765;
    }
}