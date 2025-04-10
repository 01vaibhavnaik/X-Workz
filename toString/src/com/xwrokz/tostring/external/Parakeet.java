package com.xwrokz.tostring.external;

public class Parakeet {
    private String color;
    private String habitat;
    private boolean canMimicSpeech;

    public Parakeet(String color, String habitat, boolean canMimicSpeech) {
        this.color = color;
        this.habitat = habitat;
        this.canMimicSpeech = canMimicSpeech;
        System.out.println("Parakeet class constructor running");
    }

    @Override
    public String toString() {
        return "Color: " + this.color + "\nHabitat: " + this.habitat + "\nCan Mimic Speech: " + this.canMimicSpeech;
    }
    @Override
    public int hashCode(){
        return 5628;
    }
}