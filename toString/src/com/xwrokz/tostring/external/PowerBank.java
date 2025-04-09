package com.xwrokz.tostring.external;

public class PowerBank {
    private String powerBankCompany;
    private int powerBankPrice;
    private String  powerBankColor;

    public PowerBank(String powerBankCompany,int powerBankPrice,String powerBankColor){
        this.powerBankCompany=powerBankCompany;
        this.powerBankPrice=powerBankPrice;
        this.powerBankColor=powerBankColor;
        System.out.println("String ,int, String arg cont Running");
    }
    @Override
    public String toString(){
        return "Power Bank Company:"+this.powerBankCompany+" \nPower Bank Price:"+this.powerBankPrice+"Rs"+"\nPower Bank Color:"+this.powerBankColor;
    }
}
