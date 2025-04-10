package com.xwrokz.tostring.external;

public class Toaster {
    private String brand;
    private int sliceCapacity;
    private String color;

    public Toaster(String brand, int sliceCapacity, String color) {
        this.brand = brand;
        this.sliceCapacity = sliceCapacity;
        this.color = color;
        System.out.println("Toaster class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nSlice Capacity: " + this.sliceCapacity + "\nColor: " + this.color;
    }
    @Override
    public int hashCode(){
        return 987654;
    }
}