package com.xwrokz.tostring.external;

public class Rabbit {
    private String breed;
    private boolean isDomestic;
    private boolean hasLongEars;

    public Rabbit(String breed, boolean isDomestic, boolean hasLongEars) {
        this.breed = breed;
        this.isDomestic = isDomestic;
        this.hasLongEars = hasLongEars;
        System.out.println("Rabbit class constructor running");
    }

    @Override
    public String toString() {
        return "Breed: " + this.breed + "\nIs Domestic: " + this.isDomestic + "\nHas Long Ears: " + this.hasLongEars;
    }
    @Override
    public int hashCode(){
        return 2345678;
    }
}
