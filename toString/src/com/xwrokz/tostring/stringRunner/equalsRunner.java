package com.xwrokz.tostring.stringRunner;

import com.xwrokz.tostring.external.*;

import java.lang.classfile.components.CodeRelabeler;

public class equalsRunner {
    public static void main(String[] args) {
        System.out.println("============================1===================================");
        AirConditioner airConditioner1=new AirConditioner("Dell",6,"Black");
        AirConditioner airConditioner2=new AirConditioner("Dell",6,"Black");
        System.out.println("Both are same: "+airConditioner1.equals(airConditioner2));
        System.out.println("============================2===================================");
        Animal animal1=new Animal("Lion","America","brown");
        Animal animal2=new Animal("Peacock","India","Purple");
        System.out.println("Both are same: "+animal1.equals(animal2));
        System.out.println("============================3===================================");
        Bag bag1=new Bag("Nike",2000,"black");
        Bag bag2=new Bag("Puma",4000,"white");
        System.out.println("Both are same: "+bag1.equals(bag2));
        System.out.println("============================4===================================");
        Bat bat1=new Bat("India",20,true);
        Bat bat2=new Bat("India",40,true);
        System.out.println("Both are same: "+bat1.equals(bat2));
        System.out.println("============================5===================================");
        Bear bear1=new Bear("America",200,"Fish");
        Bear bear2=new Bear("india",250,"Fish");
        System.out.println("Both are same: "+bear1.equals(bear2));
        System.out.println("============================6===================================");
        Bed bed1=new Bed("Iron",32,"Brown");
        Bed bed2=new Bed("Wood",25,"Black");
        System.out.println("Both are same: "+bed1.equals(bed2));
        System.out.println("============================7===================================");
        Bicycle bicycle1=new Bicycle("MI",32,"Plastic");
        Bicycle bicycle2=new Bicycle("Fier Fox",25,"Carbon Fiber");
        System.out.println("Both are same: "+bicycle1.equals(bicycle2));
        System.out.println("============================8===================================");
        Bike bike1=new Bike("GT350",6,"Carbon Fiber");
        Bike bike2=new Bike("Java",5,"Carbon Fiber");
        System.out.println("Both are same: "+bike1.equals(bike2));
        System.out.println("============================9===================================");
        Blender blender1=new Blender("Lenevo",1000,"Yellow");
        Blender blender2=new Blender("Hier",1000,"Red");
        System.out.println("Both are same: "+blender1.equals(blender2));
        System.out.println("============================10===================================");
        Book book1=new Book("Diary","vaibhav",100);
        Book book2=new Book("Diary","chaitanya",200);
        System.out.println("Both are same: "+book1.equals(book2));
        System.out.println("============================10===================================");
        Bucket bucket1=new Bucket("Jug",200,'M');
        Bucket bucket2=new Bucket("ROY",600,'L');
        System.out.println("Both are same: "+bucket1.equals(bucket2));
        System.out.println("============================11===================================");
        Camera camera1=new Camera("Canon",248,"Focus");
        Camera camera2=new Camera("Nikon",128,"Raw");
        System.out.println("Both are same: "+camera1.equals(camera2));
        System.out.println("============================12===================================");
        Cap cap1=new Cap("PUMA",200,"Black");
        Cap cap2=new Cap("PUMA",120,"Blue");
        System.out.println("Both are same: "+cap1.equals(cap2));
        System.out.println("============================13===================================");
        Car car1=new Car("2018",20,"Black");
        Car car2=new Car("2015",12,"Blue");
        System.out.println("Both are same: "+car1.equals(car2));
        System.out.println("============================14===================================");
        Cat cat1=new Cat("Persian",20,"Black");
        Cat cat2=new Cat("Persian",12,"White");
        System.out.println("Both are same: "+cat1.equals(cat2));
        System.out.println("============================15===================================");
        Chair chair1=new Chair("JUMBO",200,"Black");
        Chair chair2=new Chair("ROY",200,"White");
        System.out.println("Both are same: "+chair1.equals(chair2));
        System.out.println("============================16===================================");
        Cloth cloth1=new Cloth("Jeans","Red","Xl");
        Cloth cloth2=new Cloth("Nylon","Grey","L");
        System.out.println("Both are same: "+cloth1.equals(cloth2));
        System.out.println("============================16===================================");
        Coffee coffee1=new Coffee("Latte",200,"Bangalore");
        Coffee coffee2=new Coffee("Capacino",200,"Goa");
        System.out.println("Both are same: "+coffee1.equals(coffee2));
        System.out.println("============================17===================================");
        Color color1=new Color("Rambow",200,"2026");
        Color color2=new Color("Camel",200,"2026");
        System.out.println("Both are same: "+color1.equals(color2));
        System.out.println("============================18===================================");
        Computer computer1=new Computer("Acer",16,"Snapdragon");
        Computer computer2=new Computer("Asus",16,"GeforceRTX");
        System.out.println("Both are same: "+computer1.equals(computer2));
        System.out.println("============================19===================================");
        Cow cow1=new Cow("Normal Cow",true,false);
        Cow cow2=new Cow("Normal Cow",true,true);
        System.out.println("Both are same: "+cow1.equals(cow2));
        System.out.println("============================20===================================");
        Crocodile crocodile1=new Crocodile("America",8,"Fish");
        Crocodile crocodile2=new Crocodile("India",9,"Deer");
        System.out.println("Both are same: "+crocodile1.equals(crocodile2));
        System.out.println("============================21===================================");
        Dog dog1=new Dog("German Sheaperd",18,"Samll");
        Dog dog2=new Dog("Dobber man ",19,"Large");
        System.out.println("Both are same: "+dog1.equals(dog2));
        System.out.println("============================22===================================");
        Dolphine dolphine1=new Dolphine("Water",180,true);
        Dolphine dolphine2=new Dolphine("Water",190,true);
        System.out.println("Both are same: "+dolphine1.equals(dolphine2));
        System.out.println("============================21===================================");
        Door door1=new Door("Black",1800,'X');
        Door door2=new Door("White",1900,'M');
        System.out.println("Both are same: "+door1.equals(door2));


    }
}
