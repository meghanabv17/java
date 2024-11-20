package org.xworkz.jdbc;

import java.util.*;

public class Numbers {

    public static void main(String[] args) {
        List collection = new LinkedList();
        collection.add(10);
        collection.add(20);
        collection.add(30);
        //collection.add(null);
        collection.add(40);
        //collection.add(null);
        collection.add(301);
        collection.add(50);
        collection.add(60);
        collection.add(750);

        collection.add(2,111);
        collection.remove(2);

       // collection.forEach(System.out::println);
        for(Object num : collection)
            System.out.println(num);
    }
}
