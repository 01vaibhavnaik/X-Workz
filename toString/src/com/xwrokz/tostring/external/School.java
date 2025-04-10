package com.xwrokz.tostring.external;

public class School {

    private String studentName;
    private String subject;
    private int standard;

    public School(String studentName,String subject,int standard){
        this.studentName=studentName;
        this.subject=subject;
        this.standard=standard;
        System.out.println("String,String,Int arg cont Running");
    }
    @Override
    public String toString(){
        return "Student Name:"+this.studentName+" \nSubject:"+this.subject+"\nStandard:"+this.standard;
    }
    @Override
    public int hashCode(){
        return -7654569;
    }


}
