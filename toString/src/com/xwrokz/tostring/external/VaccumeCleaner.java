package com.xwrokz.tostring.external;

public class VaccumeCleaner {
    private String brand;
    private int power;
    private String color;

    public VaccumeCleaner(String brand, int power, String color) {
        this.brand = brand;
        this.power = power;
        this.color = color;
        System.out.println("VacuumCleaner class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nPower: " + this.power + "\nColor: " + this.color;
    }
}

