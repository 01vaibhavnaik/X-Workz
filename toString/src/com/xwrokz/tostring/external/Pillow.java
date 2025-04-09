package com.xwrokz.tostring.external;

public class Pillow {
    private String material;
    private String size;
    private String color;

    public Pillow(String material, String size, String color) {
        this.material = material;
        this.size = size;
        this.color = color;
        System.out.println("Pillow class constructor running");
    }

    @Override
    public String toString() {
        return "Material: " + this.material + "\nSize: " + this.size + "\nColor: " + this.color;
    }
}
