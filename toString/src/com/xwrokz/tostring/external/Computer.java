package com.xwrokz.tostring.external;

public class Computer {
    private String brand;
    private int ramSize;
    private String processorType;

    public Computer(String brand, int ramSize, String processorType) {
        this.brand = brand;
        this.ramSize = ramSize;
        this.processorType = processorType;
        System.out.println("Computer class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nRAM Size: " + this.ramSize + "\nProcessor Type: " + this.processorType;
    }
    @Override
    public int hashCode(){
        return -7539;
    }
}
