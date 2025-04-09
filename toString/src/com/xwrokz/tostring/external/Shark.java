package com.xwrokz.tostring.external;

public class Shark {
    private String species;
    private boolean isDangerous;
    private boolean canSurviveInFreshwater;

    public Shark(String species, boolean isDangerous, boolean canSurviveInFreshwater) {
        this.species = species;
        this.isDangerous = isDangerous;
        this.canSurviveInFreshwater = canSurviveInFreshwater;
        System.out.println("Shark class constructor running");
    }

    @Override
    public String toString() {
        return "Species: " + this.species + "\nIs Dangerous: " + this.isDangerous + "\nCan Survive in Freshwater: " + this.canSurviveInFreshwater;
    }
}
