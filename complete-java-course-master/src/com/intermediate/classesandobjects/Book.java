package com.intermediate.classesandobjects;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String toString(){
        return "Title: " + title + ", Author: " + author + ", Year: " + year;
    }
}
