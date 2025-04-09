package com.xwrokz.tostring.external;

public class Mug {
    private String material;
    private String color;
    private int capacity;

    public Mug(String material, String color, int capacity) {
        this.material = material;
        this.color = color;
        this.capacity = capacity;
        System.out.println("Mug class constructor running");
    }

    @Override
    public String toString() {
        return "Material: " + this.material + "\nColor: " + this.color + "\nCapacity: " + this.capacity;
    }
}
