package com.xwrokz.tostring.external;

public class Seagull {
    private String habitat;
    private int wingspan;
    private String diet;

    public Seagull(String habitat, int wingspan, String diet) {
        this.habitat = habitat;
        this.wingspan = wingspan;
        this.diet = diet;
        System.out.println("Seagull class constructor running");
    }

    @Override
    public String toString() {
        return "Habitat: " + this.habitat + "\nWingspan: " + this.wingspan + " cm\nDiet: " + this.diet;
    }
}