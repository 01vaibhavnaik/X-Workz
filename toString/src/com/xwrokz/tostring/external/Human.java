package com.xwrokz.tostring.external;

public class Human {
    private String humanName;
    private int humanAge;
    private String  humanSex;

    public Human(String humanName,int humanAge,String humanSex){
        this.humanName=humanName;
        this.humanAge=humanAge;
        this.humanSex=humanSex;
        System.out.println("String ,int, String arg cont Running");
    }
    @Override
    public String toString(){
        return "Human Nane:"+this.humanName+" \nHuman Age:"+this.humanAge+"\nSex:"+this.humanSex;
    }
    @Override
    public int hashCode(){
        return 9037;
    }
}
