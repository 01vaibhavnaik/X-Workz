package com.xwrokz.tostring.external;

public class Tortoise {
    private String habitat;
    private int lifespan;
    private String diet;

    public Tortoise(String habitat, int lifespan, String diet) {
        this.habitat = habitat;
        this.lifespan = lifespan;
        this.diet = diet;
        System.out.println("Tortoise class constructor running");
    }

    @Override
    public String toString() {
        return "Habitat: " + this.habitat + "\nLifespan: " + this.lifespan + " years\nDiet: " + this.diet;
    }
    @Override
    public int hashCode(){
        return -54;
    }
}