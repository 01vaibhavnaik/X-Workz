package com.xwrokz.tostring.external;

public class Cat {
    private String breed;
    private int age;
    private String color;

    public Cat(String breed, int age, String color) {
        this.breed = breed;
        this.age = age;
        this.color = color;
        System.out.println("Cat class constructor running");
    }

    @Override
    public String toString() {
        return "Breed: " + this.breed + "\nAge: " + this.age + "\nColor: " + this.color;
    }
}
