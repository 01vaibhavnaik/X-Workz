package com.xwrokz.tostring.external;

public class Treadmill {
    private String brand;
    private int speedRange;
    private String color;

    public Treadmill(String brand, int speedRange, String color) {
        this.brand = brand;
        this.speedRange = speedRange;
        this.color = color;
        System.out.println("Treadmill class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nSpeed Range: " + this.speedRange + "\nColor: " + this.color;
    }
}
