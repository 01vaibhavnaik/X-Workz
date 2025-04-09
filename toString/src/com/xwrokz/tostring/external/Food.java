package com.xwrokz.tostring.external;

public class Food {
    private String foodType;
    private int foodPrice;
    private String  foodLocation;

    public Food(String foodType,int foodPrice,String foodLocation){
        this.foodType=foodType;
        this.foodPrice=foodPrice;
        this.foodLocation=foodLocation;
        System.out.println("String ,int, String arg cont Running");
    }
    @Override
    public String toString(){
        return "Food Type:"+this.foodType+" \nFood Price:"+this.foodPrice+"Rs"+"\nFood Shop Location:"+this.foodLocation;
    }
}
