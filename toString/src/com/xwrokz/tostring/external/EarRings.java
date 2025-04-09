package com.xwrokz.tostring.external;

public class EarRings {
    private String type;
    private int earRingPrice;
    private String earRingColor;

    public EarRings(String type, int earRingPrice, String earRingColor) {
        this.type = type;
        this.earRingPrice = earRingPrice;
        this.earRingColor = earRingColor;
        System.out.println("String ,Int, Char arg cont Running");
    }

    @Override
    public String toString() {
        return "Type:" + this.type + " \nEarRingPrice:" + this.earRingPrice + "\nEarRingColor:" + this.earRingColor;
    }
}
