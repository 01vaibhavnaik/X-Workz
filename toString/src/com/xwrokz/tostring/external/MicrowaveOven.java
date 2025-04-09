package com.xwrokz.tostring.external;

public class MicrowaveOven {
    private String brand;
    private int wattage;
    private String color;

    public MicrowaveOven(String brand, int wattage, String color) {
        this.brand = brand;
        this.wattage = wattage;
        this.color = color;
        System.out.println("MicrowaveOven class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nWattage: " + this.wattage + "\nColor: " + this.color;
    }
}