package com.xwrokz.tostring.external;

public class Coffee {
    private String coffeeType;
    private int coffeePrice;
    private String  coffeeLocation;

    public Coffee(String coffeeType,int coffeePrice,String coffeeLocation){
        this.coffeeType=coffeeType;
        this.coffeePrice=coffeePrice;
        this.coffeeLocation=coffeeLocation;
        System.out.println("String ,Int, String arg cont Running");
    }
    @Override
    public String toString(){
        return "Coffee Type:"+this.coffeeType+" \nCoffee Price:"+this.coffeePrice+"\nLocation :"+this.coffeeLocation;
    }
    @Override
    public int hashCode(){
        return 73;
    }
}
