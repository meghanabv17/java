package org.xworkz.jdbc;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class AdditionRunner {
    public static void main(String[] args) {

        Addition addition = (a,b) -> {
            System.out.println(a+b);
        };
        addition.add(2,8);

        Map<String,Integer> map = new HashMap<>();
        map.put("Baba",2);
        map.put("Baba",3);
        map.put("Baba",5);
        map.put("Baba",8);
        map.put("Baba",9);
        map.put("Baba",9);
        map.put("Baba",9);
        map.put("Baba",9);
        map.put("Baba",9);
        map.put("Baba",9);
        map.put("Baba",10);

        System.out.println("concurrenthashmap");
        ConcurrentHashMap<String, Integer> map1 = new ConcurrentHashMap<>();
        map.put("apple", 1);
        map.compute("apple", (key, value) -> value == null ? 1 : value + 1);


        map.forEach((k,v)-> System.out.println(k +" "+v));
        System.out.println(map);
    }
}
