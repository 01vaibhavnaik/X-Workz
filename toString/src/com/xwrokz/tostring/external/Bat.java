package com.xwrokz.tostring.external;

public class Bat {
    private String habitat;
    private int wingspan;
    private boolean isNocturnal;

    public Bat(String habitat, int wingspan, boolean isNocturnal) {
        this.habitat = habitat;
        this.wingspan = wingspan;
        this.isNocturnal = isNocturnal;
        System.out.println("Bat class constructor running");
    }

    @Override
    public String toString() {
        return "Habitat: " + this.habitat + "\nWingspan: " + this.wingspan + " cm\nNocturnal: " + this.isNocturnal;
    }
}