package com.xwrokz.tostring.external;

public class Suitcase {
    private String brand;
    private int size;
    private String color;

    public Suitcase(String brand, int size, String color) {
        this.brand = brand;
        this.size = size;
        this.color = color;
        System.out.println("Suitcase class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nSize: " + this.size + "\nColor: " + this.color;
    }
    @Override
    public int hashCode(){
        return 78;
    }
}