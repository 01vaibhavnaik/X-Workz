package com.xwrokz.tostring.external;

public class Door {

    private String doorColor;
    private int doorPrice;
    private char doorSize;

    public Door(String doorColor,int doorPrice,char doorSize){
        this.doorColor=doorColor;
        this.doorPrice=doorPrice;
        this.doorSize=doorSize;
        System.out.println("String ,Int, Char arg cont Running");
    }
    @Override
    public String toString(){
        return "Brand:"+this.doorColor+" \nPrice:"+this.doorPrice+"\nSize:"+this.doorSize;
    }
    @Override
    public int hashCode(){
        return 86783;
    }


}

