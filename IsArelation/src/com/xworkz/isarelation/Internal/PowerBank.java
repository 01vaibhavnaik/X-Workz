package com.xworkz.isarelation.Internal;

public class PowerBank extends Technologia{
    public PowerBank(){
        System.out.println("no arg cont of power bank");
    }
    @Override
    public void  techPrice(){
        System.out.println("Running techPrice updated");
    }
    @Override
    public void  techStart(){
        System.out.println("Running techStart updated");
    }
    @Override
    public void  techRun(){
        System.out.println("Running tech run updated");
    }
    @Override
    public void  techStop(){
        System.out.println("Running tech Stop updated");
    }
    @Override
    public void  techPart(){
        System.out.println("Running tech Part updated");
    }
}
