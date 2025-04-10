package com.xwrokz.tostring.external;

public class Snake {
    private String species;
    private boolean isVenomous;
    private boolean canClimb;

    public Snake(String species, boolean isVenomous, boolean canClimb) {
        this.species = species;
        this.isVenomous = isVenomous;
        this.canClimb = canClimb;
        System.out.println("Snake class constructor running");
    }

    @Override
    public String toString() {
        return "Species: " + this.species + "\nIs Venomous: " + this.isVenomous + "\nCan Climb: " + this.canClimb;
    }
    @Override
    public int hashCode(){
        return -4567;
    }}