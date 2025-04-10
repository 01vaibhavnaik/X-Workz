package com.xwrokz.tostring.external;

public class Crocodile {
    private String habitat;
    private int length;
    private String diet;

    public Crocodile(String habitat, int length, String diet) {
        this.habitat = habitat;
        this.length = length;
        this.diet = diet;
        System.out.println("Crocodile class constructor running");
    }

    @Override
    public String toString() {
        return "Habitat: " + this.habitat + "\nLength: " + this.length + " meters\nDiet: " + this.diet;
    }
    @Override
    public int hashCode(){
        return 39;
    }
}