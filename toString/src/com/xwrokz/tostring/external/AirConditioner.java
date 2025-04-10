package com.xwrokz.tostring.external;

public class AirConditioner {
    private String brand;
    private int coolingCapacity;
    private String color;

    public AirConditioner(String brand, int coolingCapacity, String color) {
        this.brand = brand;
        this.coolingCapacity = coolingCapacity;
        this.color = color;
        System.out.println("AirConditioner class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nCooling Capacity: " + this.coolingCapacity + "\nColor: " + this.color;
    }
    @Override
    public int hashCode(){
        return 9;
    }
}
