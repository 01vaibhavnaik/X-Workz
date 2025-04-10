package com.xwrokz.tostring.external;

public class StandMixer {
    private String brand;
    private int speedLevels;
    private String color;

    public StandMixer(String brand, int speedLevels, String color) {
        this.brand = brand;
        this.speedLevels = speedLevels;
        this.color = color;
        System.out.println("StandMixer class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nSpeed Levels: " + this.speedLevels + "\nColor: " + this.color;
    }
    @Override
    public int hashCode(){
        return -58;
    }
}
