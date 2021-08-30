package com.leonealejandro;

class Book {
    String title;
    String author;


    public Book(String title, String author) {
        this.title = "The Alchemist";
        this.author = "Paulo Coelho";
    }
}

class MyBook extends Book {
    int price = 0;

    MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }


class Main {
        static void main(String[] args) {
        }
    }
}