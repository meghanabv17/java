package org.xworkz.jdbc;

import java.util.*;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {

        List<String> collection = new LinkedList<>();
//list is known as index based collection;
//list is a ordered list and index based list;
//It allowes n number os null values and duplicate values;
        collection.add("Wondrela");
        collection.add("GRS");
        collection.add("Fun world");
        collection.add("Innovative film city");
        collection.add("Universal");
        collection.add("Lumbini gardens");
        collection.add("Neeladri Amusement and Water Parks");
        collection.add("Crazy Waters");
        collection.add("Brundavan");
        collection.add("GRS");

        for(String name : collection) {
            collection.add("123");// --> getting an concurrentModificationException;(we can
            // overcome this exception by using iterator, CopyOnWriteArrayList, ConcurrentHashMap);
            System.out.println(name);
        }

/*
//adding a data with index by using list;
        collection.add(7,"Black knight");
        collection.add(0,"Worlds of wonder");
//we get this option only by using List;
        System.out.println("The 10th index value is: "+collection.get(10));
//retrive a object;
        Iterator<String> itr = collection.iterator();
        System.out.println("The Amusement parks are: ");
        while(itr.hasNext()){
            String amusement = itr.next();
            if(amusement.startsWith("B"))
            System.out.println(amusement);
        }
//using a stream
        collection.stream().filter(amusement-> amusement.startsWith("C")).forEach(System.out::println);
//In set, we get an unordered data's;
//It allowes, one null value and, It does not allow duplicate values;
        System.out.println("consumer interface.......!");
        collection.forEach(parkname -> System.out.println(parkname));

        System.out.println("Predicate interface...!");
        System.out.println(collection.stream().filter(parkname->parkname.equals("Universal")).findFirst());
*/

    }
}
