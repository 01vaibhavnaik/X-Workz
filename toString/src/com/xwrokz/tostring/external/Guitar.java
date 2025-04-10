package com.xwrokz.tostring.external;

public class Guitar {
    private String brand;
    private int stringCount;
    private String type;

    public Guitar(String brand, int stringCount, String type) {
        this.brand = brand;
        this.stringCount = stringCount;
        this.type = type;
        System.out.println("Guitar class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nString Count: " + this.stringCount + "\nType: " + this.type;
    }
    @Override
    public int hashCode(){
        return 927;
    }
}
