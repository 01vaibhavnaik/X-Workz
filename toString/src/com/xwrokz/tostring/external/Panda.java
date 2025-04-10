package com.xwrokz.tostring.external;

public class Panda {
    private String habitat;
    private String diet;
    private boolean isEndangered;

    public Panda(String habitat, String diet, boolean isEndangered) {
        this.habitat = habitat;
        this.diet = diet;
        this.isEndangered = isEndangered;
        System.out.println("Panda class constructor running");
    }

    @Override
    public String toString() {
        return "Habitat: " + this.habitat + "\nDiet: " + this.diet + "\nEndangered: " + this.isEndangered;
    }
    @Override
    public int hashCode(){
        return 2686;
    }
}
