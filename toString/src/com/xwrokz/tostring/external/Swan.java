package com.xwrokz.tostring.external;

public class Swan {
    private String color;
    private String habitat;
    private double wingspan;

    public Swan(String color, String habitat, double wingspan) {
        this.color = color;
        this.habitat = habitat;
        this.wingspan = wingspan;
        System.out.println("Swan class constructor running");
    }

    @Override
    public String toString() {
        return "Color: " + this.color + "\nHabitat: " + this.habitat + "\nWingspan: " + this.wingspan + " meters";
    }
    @Override
    public int hashCode(){
        return 6568;
    }
}