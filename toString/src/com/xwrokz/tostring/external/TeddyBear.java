package com.xwrokz.tostring.external;

public class TeddyBear {
    private String color;
    private boolean hasSound;
    private boolean isSoft;

    public TeddyBear(String color, boolean hasSound, boolean isSoft) {
        this.color = color;
        this.hasSound = hasSound;
        this.isSoft = isSoft;
        System.out.println("TeddyBear class constructor running");
    }

    @Override
    public String toString() {
        return "Color: " + this.color + "\nHas Sound: " + this.hasSound + "\nIs Soft: " + this.isSoft;
    }
}
