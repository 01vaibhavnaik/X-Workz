package com.xwrokz.tostring.external;

public class SmartPhone {
    private String brand;
    private int storage;
    private boolean has5G;

    public SmartPhone(String brand, int storage, boolean has5G) {
        this.brand = brand;
        this.storage = storage;
        this.has5G = has5G;
        System.out.println("Smartphone class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nStorage: " + this.storage + " GB\n5G: " + this.has5G;
    }
    @Override
    public int hashCode(){
        return -8960;
    }
}
