package com.xwrokz.tostring.external;

public class Dolphine {
    private String habitat;
    private int weight;
    private boolean isEndangered;

    public Dolphine(String habitat, int weight, boolean isEndangered) {
        this.habitat = habitat;
        this.weight = weight;
        this.isEndangered = isEndangered;
        System.out.println("Dolphin class constructor running");
    }

    @Override
    public String toString() {
        return "Habitat: " + this.habitat + "\nWeight: " + this.weight + " kg\nEndangered: " + this.isEndangered;
    }
}
