package com.xwrokz.tostring.external;

public class Home {

    private String homeType;
    private int homeRent;
    private String  homeLocatin;

    public Home(String homeType,int homeRent,String homeLocatin){
        this.homeType=homeType;
        this.homeRent=homeRent;
        this.homeLocatin=homeLocatin;
        System.out.println("String ,Int, String arg cont Running");
    }
    @Override
    public String toString(){
        return "Type:"+this.homeType+" \nRent:"+this.homeRent+"\nAddress:"+this.homeLocatin;
    }
}
