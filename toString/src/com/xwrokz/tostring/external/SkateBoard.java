package com.xwrokz.tostring.external;
public class SkateBoard {
    private String brand;
    private String material;
    private int size;

    public SkateBoard(String brand, String material, int size) {
        this.brand = brand;
        this.material = material;
        this.size = size;
        System.out.println("Skateboard class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nMaterial: " + this.material + "\nSize: " + this.size;
    }
    @Override
    public int hashCode(){
        return 2854660;
    }
}
