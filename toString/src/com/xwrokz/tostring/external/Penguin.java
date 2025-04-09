package com.xwrokz.tostring.external;

public class Penguin {
    private String habitat;
    private int weight;
    private String diet;

    public Penguin(String habitat, int weight, String diet) {
        this.habitat = habitat;
        this.weight = weight;
        this.diet = diet;
        System.out.println("Penguin class constructor running");
    }

    @Override
    public String toString() {
        return "Habitat: " + this.habitat + "\nWeight: " + this.weight + " kg\nDiet: " + this.diet;
    }
}
