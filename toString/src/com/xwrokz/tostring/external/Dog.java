package com.xwrokz.tostring.external;

public class Dog {
    private String breed;
    private int age;
    private String size;

    public Dog(String breed, int age, String size) {
        this.breed = breed;
        this.age = age;
        this.size = size;
        System.out.println("Dog class constructor running");
    }

    @Override
    public String toString() {
        return "Breed: " + this.breed + "\nAge: " + this.age + "\nSize: " + this.size;
    }
    @Override
    public int hashCode(){
        return 9879;
    }
}