package com.xwrokz.tostring.external;

public class Bicycle {
    private String brand;
    private int wheelSize;
    private String type;

    public Bicycle(String brand, int wheelSize, String type) {
        this.brand = brand;
        this.wheelSize = wheelSize;
        this.type = type;
        System.out.println("Bicycle class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nWheel Size: " + this.wheelSize + "\nType: " + this.type;
    }
}