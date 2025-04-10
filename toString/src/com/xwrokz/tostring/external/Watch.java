package com.xwrokz.tostring.external;

public class Watch {
    private String watchBrand;
    private int watchPrice;
    private String  watchColor;

    public Watch(String watchBrand,int watchPrice,String watchColor){
        this.watchBrand=watchBrand;
        this.watchPrice=watchPrice;
        this.watchColor=watchColor;
        System.out.println("String ,Int, String arg cont Running");
    }
    @Override
    public String toString(){
        return "Watch Brand:"+this.watchBrand+" \nWatch Price:"+this.watchPrice+"\nWatch Color:"+this.watchColor;
    }
    @Override
    public int hashCode(){
        return -3456765;
    }
}
