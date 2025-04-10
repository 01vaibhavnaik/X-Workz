package com.xwrokz.tostring.external;

public class Car {
    private String model;
    private int year;
    private String color;

    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
        System.out.println("Car class constructor running");
    }

    @Override
    public String toString() {
        return "Model: " + this.model + "\nYear: " + this.year + "\nColor: " + this.color;
    }
    @Override
    public int hashCode(){
        return -739;
    }
}
