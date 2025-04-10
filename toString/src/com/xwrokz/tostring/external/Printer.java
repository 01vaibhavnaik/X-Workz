package com.xwrokz.tostring.external;

public class Printer {
    private String brand;
    private String type;
    private int resolution;

    public Printer(String brand, String type, int resolution) {
        this.brand = brand;
        this.type = type;
        this.resolution = resolution;
        System.out.println("Printer class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nType: " + this.type + "\nResolution: " + this.resolution;
    }
    @Override
    public int hashCode(){
        return -987654;
    }
}