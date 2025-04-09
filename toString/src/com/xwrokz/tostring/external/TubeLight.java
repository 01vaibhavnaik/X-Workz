package com.xwrokz.tostring.external;

public class TubeLight {
    private String tubeLightBrand;
    private int tubeLightPrice;
    private String  tubeLightColor;

    public TubeLight(String tubeLightBrand,int tubeLightPrice,String tubeLightColor){
        this.tubeLightBrand=tubeLightBrand;
        this.tubeLightPrice=tubeLightPrice;
        this.tubeLightColor=tubeLightColor;
        System.out.println("String ,Int, String arg cont Running");
    }
    @Override
    public String toString(){
        return "TubeLight Brand:"+this.tubeLightBrand+" \nTubeLight Price:"+this.tubeLightPrice+"\nTubeLight Color:"+this.tubeLightColor;
    }
}
