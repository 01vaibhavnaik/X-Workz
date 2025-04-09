package com.xwrokz.tostring.external;

public class Helmet {
    private String brand;
    private String material;
    private int size;

    public Helmet(String brand, String material, int size) {
        this.brand = brand;
        this.material = material;
        this.size = size;
        System.out.println("Helmet class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nMaterial: " + this.material + "\nSize: " + this.size;
    }
}
