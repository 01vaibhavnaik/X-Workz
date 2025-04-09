package com.xwrokz.tostring.external;

public class Book {
    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        System.out.println("Book class constructor running");
    }

    @Override
    public String toString() {
        return "Title: " + this.title + "\nAuthor: " + this.author + "\nPages: " + this.pages;
    }
}
