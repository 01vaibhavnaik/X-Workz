package com.xwrokz.tostring.external;

public class Tiger {
    private String habitat;
    private int weight;
    private String stripePattern;

    public Tiger(String habitat, int weight, String stripePattern) {
        this.habitat = habitat;
        this.weight = weight;
        this.stripePattern = stripePattern;
        System.out.println("Tiger class constructor running");
    }

    @Override
    public String toString() {
        return "Habitat: " + this.habitat + "\nWeight: " + this.weight + " kg\nStripe Pattern: " + this.stripePattern;
    }
}