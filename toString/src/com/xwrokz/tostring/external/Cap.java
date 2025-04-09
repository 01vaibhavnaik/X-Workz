package com.xwrokz.tostring.external;

public class Cap {
    private String capBrand;
    private int capPrice;
    private String  capColor;

    public Cap(String capBrand,int capPrice,String capColor){
        this.capBrand=capBrand;
        this.capPrice=capPrice;
        this.capColor=capColor;
        System.out.println("String ,Int, String arg cont Running");
    }
    @Override
    public String toString(){
        return "Cap Brand:"+this.capBrand+" \nCap Price:"+this.capPrice+"\nCap Color:"+this.capColor;
    }
}
