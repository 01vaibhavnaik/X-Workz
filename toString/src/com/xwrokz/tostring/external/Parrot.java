package com.xwrokz.tostring.external;

public class Parrot {
    private String color;
    private String habitat;
    private boolean canTalk;

    public Parrot(String color, String habitat, boolean canTalk) {
        this.color = color;
        this.habitat = habitat;
        this.canTalk = canTalk;
        System.out.println("Parrot class constructor running");
    }

    @Override
    public String toString() {
        return "Color: " + this.color + "\nHabitat: " + this.habitat + "\nCan Talk: " + this.canTalk;
    }
    @Override
    public int hashCode(){
        return -7642;
    }
}
