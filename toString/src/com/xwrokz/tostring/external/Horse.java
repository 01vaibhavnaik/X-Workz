package com.xwrokz.tostring.external;

public class Horse {
    private String breed;
    private String color;
    private int height;

    public Horse(String breed, String color, int height) {
        this.breed = breed;
        this.color = color;
        this.height = height;
        System.out.println("Horse class constructor running");
    }

    @Override
    public String toString() {
        return "Breed: " + this.breed + "\nColor: " + this.color + "\nHeight: " + this.height + " cm";
    }
}
