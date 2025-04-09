package com.xwrokz.tostring.external;

public class Koala {
    private String habitat;
    private String diet;
    private boolean isEndangered;

    public Koala(String habitat, String diet, boolean isEndangered) {
        this.habitat = habitat;
        this.diet = diet;
        this.isEndangered = isEndangered;
        System.out.println("Koala class constructor running");
    }

    @Override
    public String toString() {
        return "Habitat: " + this.habitat + "\nDiet: " + this.diet + "\nEndangered: " + this.isEndangered;
    }
}

