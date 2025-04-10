package com.xwrokz.tostring.external;

public class Television {
    private String brand;
    private int size;
    private String resolution;

    public Television(String brand, int size, String resolution) {
        this.brand = brand;
        this.size = size;
        this.resolution = resolution;
        System.out.println("Television class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nSize: " + this.size + "\nResolution: " + this.resolution;
    }
    @Override
    public int hashCode(){
        return 36898;
    }
}

