package com.xwrokz.tostring.external;

public class Animal {
    private String animalName;
    private String animalFound;
    private String animalColor;

    public Animal(String animalName,String animalFound,String animalColor){
        this.animalName=animalName;
        this.animalFound=animalFound;
        this.animalColor=animalColor;
        System.out.println("String ,String, String arg cont Running");
    }
    @Override
    public String toString(){
        return "Animal Name:"+this.animalName+" \nAnimal Found:"+this.animalFound+"\nAnimal Color:"+this.animalColor;
    }
    @Override
    public int hashCode(){
        return -89;
    }
}
