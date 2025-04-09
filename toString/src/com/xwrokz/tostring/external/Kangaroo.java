package com.xwrokz.tostring.external;

public class Kangaroo {
    private String habitat;
    private int weight;
    private int jumpHeight;

    public Kangaroo(String habitat, int weight, int jumpHeight) {
        this.habitat = habitat;
        this.weight = weight;
        this.jumpHeight = jumpHeight;
        System.out.println("Kangaroo class constructor running");
    }

    @Override
    public String toString() {
        return "Habitat: " + this.habitat + "\nWeight: " + this.weight + " kg\nJump Height: " + this.jumpHeight + " m";
    }
}