package com.xwrokz.tostring.external;

public class Cloth {
    private String material;
    private String color;
    private String size;

    public Cloth(String material, String color, String size) {
        this.material = material;
        this.color = color;
        this.size = size;
        System.out.println("Cloth class constructor running");
    }

    @Override
    public String toString() {
        return "Material: " + this.material + "\nColor: " + this.color + "\nSize: " + this.size;
    }
    @Override
    public int hashCode(){
        return 83;
    }
}