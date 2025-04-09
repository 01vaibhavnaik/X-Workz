package com.xwrokz.tostring.external;

public class Mattress {
    private String brand;
    private int size;
    private String material;

    public Mattress(String brand, int size, String material) {
        this.brand = brand;
        this.size = size;
        this.material = material;
        System.out.println("Mattress class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nSize: " + this.size + "\nMaterial: " + this.material;
    }
}
