package com.springboard.basics.springbootin10steps;

public class Book {
    long id;
    String name;
    String author;
    //generate constructor
    public Book(long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }
    //generate getter

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    //generate to string
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

}
