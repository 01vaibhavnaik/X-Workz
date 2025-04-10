package com.xwrokz.tostring.external;
public class Lamp {
    private String brand;
    private String color;
    private int brightness;

    public Lamp(String brand, String color, int brightness) {
        this.brand = brand;
        this.color = color;
        this.brightness = brightness;
        System.out.println("Lamp class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nColor: " + this.color + "\nBrightness: " + this.brightness;
    }
    @Override
    public int hashCode(){
        return 28197;
    }
}
