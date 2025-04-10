package com.xwrokz.tostring.external;

public class SmartWatch {
    private String brand;
    private boolean hasGPS;
    private boolean isWaterproof;

    public SmartWatch(String brand, boolean hasGPS, boolean isWaterproof) {
        this.brand = brand;
        this.hasGPS = hasGPS;
        this.isWaterproof = isWaterproof;
        System.out.println("Smartwatch class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nHas GPS: " + this.hasGPS + "\nIs Waterproof: " + this.isWaterproof;
    }
    @Override
    public int hashCode(){
        return -545678;
    }
}