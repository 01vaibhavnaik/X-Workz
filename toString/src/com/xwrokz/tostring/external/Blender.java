package com.xwrokz.tostring.external;

public class Blender {
    private String brand;
    private int speedLevels;
    private String color;

    public Blender(String brand, int speedLevels, String color) {
        this.brand = brand;
        this.speedLevels = speedLevels;
        this.color = color;
        System.out.println("Blender class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nSpeed Levels: " + this.speedLevels + "\nColor: " + this.color;
    }
}
