package com.xwrokz.tostring.external;

public class Laptop {
    private String laptopCompany;
    private float laptopPrice;
    private String  laptopColor;

    public Laptop(String laptopCompany,float laptopPrice,String laptopColor){
        this.laptopCompany=laptopCompany;
        this.laptopPrice=laptopPrice;
        this.laptopColor=laptopColor;
        System.out.println("String ,float, String arg cont Running");
    }
    @Override
    public String toString(){
        return "Laptop Company:"+this.laptopCompany+" \nLaptop Price:"+this.laptopPrice+"LKH"+"\nLaptop Color:"+this.laptopColor;
    }
    @Override
    public int hashCode(){
        return -1245;
    }
}
