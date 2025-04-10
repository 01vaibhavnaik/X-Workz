package com.xwrokz.tostring.external;

public class Speaker {
    private String brand;
    private int wattage;
    private String color;

    public Speaker(String brand, int wattage, String color) {
        this.brand = brand;
        this.wattage = wattage;
        this.color = color;
        System.out.println("Speaker class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nWattage: " + this.wattage + "\nColor: " + this.color;
    }
    @Override
    public int hashCode(){
        return -975678;
    }
}