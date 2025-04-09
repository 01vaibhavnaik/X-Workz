package com.xwrokz.tostring.external;

public class Bear {
    private String habitat;
    private int weight;
    private String diet;

    public Bear(String habitat, int weight, String diet) {
        this.habitat = habitat;
        this.weight = weight;
        this.diet = diet;
        System.out.println("Bear class constructor running");
    }

    @Override
    public String toString() {
        return "Habitat: " + this.habitat + "\nWeight: " + this.weight + " kg\nDiet: " + this.diet;
    }
}