package com.xwrokz.tostring.external;

public class Table {
    private String tableType;
    private int tablePrice;
    private String  tableColor;

    public Table(String tableType,int tablePrice,String tableColor){
        this.tableType=tableType;
        this.tablePrice=tablePrice;
        this.tableColor=tableColor;
        System.out.println("String ,int, String arg cont Running");
    }
    @Override
    public String toString(){
        return "Table Company:"+this.tableType+" \nTable Price:"+this.tablePrice+"Rs"+"\nTable Color:"+this.tableColor;
    }
    @Override
    public int hashCode(){
        return 23465;
    }
}
