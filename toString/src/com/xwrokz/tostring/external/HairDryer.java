package com.xwrokz.tostring.external;

public class HairDryer {
    private String brand;
    private int power;
    private String color;

    public HairDryer(String brand, int power, String color) {
        this.brand = brand;
        this.power = power;
        this.color = color;
        System.out.println("HairDryer class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nPower: " + this.power + "\nColor: " + this.color;
    }
    @Override
    public int hashCode(){
        return -879;
    }
}
