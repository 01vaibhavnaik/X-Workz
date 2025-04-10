package com.xwrokz.tostring.external;

public class Soap {
    private String brand;
    private int weight;
    private String scent;

    public Soap(String brand, int weight, String scent) {
        this.brand = brand;
        this.weight = weight;
        this.scent = scent;
        System.out.println("Soap class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nWeight: " + this.weight + "\nScent: " + this.scent;
    }
    @Override
    public int hashCode(){
        return 745678;
    }
}
