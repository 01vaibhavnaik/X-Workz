package com.xwrokz.tostring.external;

public class Jug {
    private String color;
    private int capacity;
    private String material;
    
    
    public Jug(String color,int capacity,String material){
        this.color=color;
        this.capacity=capacity;
        this.material=material;
        System.out.println("String ,Int,String arg cont Running");
    }
    @Override
    public String toString(){
        return "Color:"+this.color+"\nCapacity:"+this.capacity+"\nMaterial:"+this.material;
    }
    @Override
    public int hashCode(){
        return 5;
    }
    
}
