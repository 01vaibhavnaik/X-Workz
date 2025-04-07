package com.xworkz.com;

public class MainRunner {
    public static void main(String[] args) {
        Rubber rubber=new Rubber();
        rubber.expand();
        Rubber rubber1=new Tyer();
        rubber1.expand();
        System.out.println("----------------------------------------------");
        Tyer tyer=new Tyer();
        tyer.expand();
        tyer.compress();
        System.out.println("----------------------------------------------");
        MRFTyer mrfTyer=new MRFTyer();
        mrfTyer.expand();
        mrfTyer.compress();
        mrfTyer.radial();
        System.out.println("----------------------------------------------");
        ArmyVehicle armyVehicle=new ArmyVehicle();
        armyVehicle.wheel(rubber);
        armyVehicle.wheel(tyer);
        armyVehicle.wheel(mrfTyer);
    }

}
