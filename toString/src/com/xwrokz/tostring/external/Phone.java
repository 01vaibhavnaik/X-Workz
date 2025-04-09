package com.xwrokz.tostring.external;

public class Phone {
    private String phoneCompany;
    private float phonePrice;
    private String  phoneColor;

    public Phone(String phoneCompany,float phonePrice,String phoneColor){
        this.phoneCompany=phoneCompany;
        this.phonePrice=phonePrice;
        this.phoneColor=phoneColor;
        System.out.println("String ,float, String arg cont Running");
    }
    @Override
    public String toString(){
        return "Phone Company:"+this.phoneCompany+" \nPhone Price:"+this.phonePrice+"LKH"+"\nPhone Color:"+this.phoneColor;
    }
}
