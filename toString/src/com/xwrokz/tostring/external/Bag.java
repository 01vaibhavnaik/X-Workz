package com.xwrokz.tostring.external;

public class Bag {
    private String bagBrand;
    private int bagPrice;
    private String  bagColor;

    public Bag(String bagBrand,int bagPrice,String bagColor){
        this.bagBrand=bagBrand;
        this.bagPrice=bagPrice;
        this.bagColor=bagColor;
        System.out.println("String ,Int, String arg cont Running");
    }
    @Override
    public String toString(){
        return "Bag Brand:"+this.bagBrand+" \nBag Price:"+this.bagPrice+"\nBag Color:"+this.bagColor;
    }
    @Override
    public int hashCode(){
        return 987;
    }
}
