package com.xwrokz.tostring.external;

public class Ostrich {
    private String habitat;
    private int speed;
    private boolean canFly;

    public Ostrich(String habitat, int speed, boolean canFly) {
        this.habitat = habitat;
        this.speed = speed;
        this.canFly = canFly;
        System.out.println("Ostrich class constructor running");
    }

    @Override
    public String toString() {
        return "Habitat: " + this.habitat + "\nSpeed: " + this.speed + " km/h\nCan Fly: " + this.canFly;
    }
    @Override
    public int hashCode(){
        return -86952;
    }
}
