package com.xwrokz.tostring.external;

public class Pen {
    private String brand;
    private String color;
    private double length;

    public Pen(String brand, String color, double length) {
        this.brand = brand;
        this.color = color;
        this.length = length;
        System.out.println("Pen class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nColor: " + this.color + "\nLength: " + this.length;
    }
}
