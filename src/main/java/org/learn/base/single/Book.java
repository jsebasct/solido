package org.learn.base.single;

public class Book {
    String name;
    String authorName;
    int year;
    int price;
    int isbn;

    public Book(String name, String authorName, int year, int price, int isbn) {
        this.name = name;
        this.authorName = authorName;
        this.year = year;
        this.price = price;
        this.isbn = isbn;
    }
}
