package com.xwrokz.tostring.external;

public class Tree {
    private String treeName;
    private int treeLifeSpan;
    private String  treeLocated;

    public Tree(String treeName,int treeLifeSpan,String treeLocated){
        this.treeName=treeName;
        this.treeLifeSpan=treeLifeSpan;
        this.treeLocated=treeLocated;
        System.out.println("String ,Int, String arg cont Running");
    }
    @Override
    public String toString(){
        return "Tree Name:"+this.treeName+" \nYear:"+this.treeLifeSpan+"\nFound In:"+this.treeLocated;
    }
    @Override
    public int hashCode(){
        return -678;
    }
}
