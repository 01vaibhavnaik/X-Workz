package com.xwrokz.tostring.external;

public class Bed {
    private String material;
    private int size;
    private String color;

    public Bed(String material, int size, String color) {
        this.material = material;
        this.size = size;
        this.color = color;
        System.out.println("Bed class constructor running");
    }

    @Override
    public String toString() {
        return "Material: " + this.material + "\nSize: " + this.size + "\nColor: " + this.color;
    }
}
