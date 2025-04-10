package com.xwrokz.tostring.external;

public class Trolley {
    private String brand;
    private String material;
    private String color;

    public Trolley(String brand, String material, String color) {
        this.brand = brand;
        this.material = material;
        this.color = color;
        System.out.println("Trolley class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nMaterial: " + this.material + "\nColor: " + this.color;
    }
    @Override
    public int hashCode(){
        return -578;
    }
}