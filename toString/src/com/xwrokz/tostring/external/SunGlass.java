package com.xwrokz.tostring.external;

public class SunGlass {
    private String sunGlassBrand;
    private int sunGlassPrice;
    private String  sunGlassColor;

    public SunGlass(String sunGlassBrand,int sunGlassPrice,String sunGlassColor){
        this.sunGlassBrand=sunGlassBrand;
        this.sunGlassPrice=sunGlassPrice;
        this.sunGlassColor=sunGlassColor;
        System.out.println("String ,Int, String arg cont Running");
    }
    @Override
    public String toString(){
        return "Sun Glass Brand:"+this.sunGlassBrand+" \nSun Glass Price:"+this.sunGlassPrice+"\nSun Glass Color:"+this.sunGlassColor;
    }
}
