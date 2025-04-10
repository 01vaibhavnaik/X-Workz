package com.xwrokz.tostring.external;

public class Shirt {
    private String shirtBrand;
    private int shirtPrice;
    private char shirtSize;

    public Shirt(String shirtBrand, int shirtPrice, char shirtSize) {
        this.shirtBrand = shirtBrand;
        this.shirtPrice = shirtPrice;
        this.shirtSize = shirtSize;
        System.out.println("String ,Int, Char arg cont Running");
    }

    @Override
    public String toString() {
        return "Shirt Brand:" + this.shirtBrand + " \nShirt Price:" + this.shirtPrice + "\nShirt Size:" + this.shirtSize;
    }
    @Override
    public int hashCode(){
        return 2960;
    }}
