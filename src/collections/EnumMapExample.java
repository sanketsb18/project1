package collections;

import java.util.EnumMap;
import java.util.Map;

class Book {
    int id, pages, quantity;
    String name, author, publisher;
    public Book(int id, String name, String author, String publisher, int pages, int quantity) {
        this.id=id;
        this.name=name;
        this.author=author;
        this.publisher=publisher;
        this.pages=pages;
        this.quantity=quantity;
    }
}

public class EnumMapExample {
    public enum Key {
        One, Two, Three
    }
    public static void main(String[] args) {
        EnumMap<Key,Book>map = new EnumMap<>(Key.class);

        //creating Books
        Book b1=new Book(1123, "Harry Potter", "J.K. Rowling", "KP Publications", 50,560 );
        Book b2= new Book(12364, "Wings Of Fire", "APJ Abdul Kalam", "HP publication", 623, 1500);
        Book b3= new Book(1536, "Music", "A R Rahmqn", "PR publications", 453, 2000);
        map.put(Key.One, b1);
        map.put(Key.Two, b2);
        map.put(Key.Three, b3);

        for(Map.Entry<Key, Book> entry:map.entrySet()) {
            Book b = entry.getValue();
            System.out.println("Id : " +b.id+ " Name : " + b.name +" Author : " + b.author+ " Publisher : "+ b.publisher + " Pages : " + b.pages + " Quantity : "+ b.quantity);
        }
    }
}
