package collections;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vec = new Vector<>(3);
        vec.add("Tiger");
        vec.add("Lion");
        vec.add("Monkey");
        vec.add("Giraffe");
        vec.add("Dog");

        System.out.println("Size is " + vec.size());
        System.out.println("Default capacity is " + vec.capacity());

        System.out.println("Vector Element is " + vec);
        vec.addElement("Rat");
        vec.add("Parrot");
        vec.add("Cat");

        System.out.println("Size after addition : " + vec.size());
        System.out.println("Capacity after addition : "+ vec.capacity());

        System.out.println("First animal of the vector is : "+ vec.firstElement());
        System.out.println("Last animal of the vector is : " + vec.lastElement());
        System.out.println("The index of Parrot is "+ vec.indexOf("Parrot"));


    }
}
