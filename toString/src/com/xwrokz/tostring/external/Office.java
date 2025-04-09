package com.xwrokz.tostring.external;

public class Office {
    private String companyName;
    private int openTime;
    private int closeTime;

    public Office(String companyName, int openTime, int closeTime) {
        this.companyName = companyName;
        this.openTime = openTime;
        this.closeTime = closeTime;
        System.out.println("String ,Int, Int arg cont Running");
    }

    @Override
    public String toString() {
        return "Company Name:" + this.companyName + " \nOpen Time:" + this.openTime +"AM"+"\nClose Time:"+this.closeTime+"PM";
    }
}
