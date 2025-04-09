package com.xwrokz.tostring.external;

public class Shoe {
    private String shoeBrand;
    private int shoePrice;
    private String  shoeColor;

    public Shoe(String shoeBrand,int shoePrice,String shoeColor){
        this.shoeBrand=shoeBrand;
        this.shoePrice=shoePrice;
        this.shoeColor=shoeColor;
        System.out.println("String ,Int, String arg cont Running");
    }
    @Override
    public String toString(){
        return "Shoe Brand:"+this.shoeBrand+" \nShoe Price:"+this.shoePrice+"\nShoe Color:"+this.shoeColor;
    }
}
