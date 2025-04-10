package com.xwrokz.tostring.external;

public class Chair {
    private String chairCompany;
    private int chairPrice;
    private String  chairColor;

    public Chair(String chairCompany,int chairPrice,String chairColor){
        this.chairCompany=chairCompany;
        this.chairPrice=chairPrice;
        this.chairColor=chairColor;
        System.out.println("String ,Int, String arg cont Running");
    }
    @Override
    public String toString(){
        return "Chair Company:"+this.chairCompany+" \nChair Price:"+this.chairPrice+"\nChair Color:"+this.chairColor;
    }
    @Override
    public int hashCode(){
        return 7893;
    }
}
