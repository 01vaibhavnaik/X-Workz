package com.xwrokz.tostring.external;

public class Duck {
    private String color;
    private String habitat;
    private boolean canSwim;

    public Duck(String color, String habitat, boolean canSwim) {
        this.color = color;
        this.habitat = habitat;
        this.canSwim = canSwim;
        System.out.println("Duck class constructor running");
    }

    @Override
    public String toString() {
        return "Color: " + this.color + "\nHabitat: " + this.habitat + "\nCan Swim: " + this.canSwim;
    }
    @Override
    public int hashCode(){
        return 639;
    }
}
