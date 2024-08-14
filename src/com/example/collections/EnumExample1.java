package com.example.collections;

import java.security.Key;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

class Book {
    int id;
    String name, author, publisher;
    int quantity;
    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
public class EnumExample1 {

    public enum Key{
        ONE, TWO, THREE
    };
    public static void main(String[] args) {
        EnumMap<Key, Book>  map = new EnumMap<Key, Book>(Key.class);

       Book book = new Book(1,"OS", "Gelvin","Wiley",5);
       map.put(Key.TWO, book);
       map.put(Key.THREE, book);

       for (Map.Entry<Key, Book> entry : map.entrySet()) {
           Book b = entry.getValue();
           System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
       }
    }
}
