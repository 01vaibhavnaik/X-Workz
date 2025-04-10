package com.xwrokz.tostring.external;

public class Color {
    private String colorBrand;
    private int colorPrice;
    private String  colorMfd;

    public Color(String colorBrand,int colorPrice,String colorMfd){
        this.colorBrand=colorBrand;
        this.colorPrice=colorPrice;
        this.colorMfd=colorMfd;
        System.out.println("String ,int, String arg cont Running");
    }
    @Override
    public String toString(){
        return "Color Brand:"+this.colorBrand+" \nColor Price:"+this.colorPrice+"Rs"+"\nColor MFD:"+this.colorMfd;
    }
    @Override
    public int hashCode(){
        return 830;
    }
}
