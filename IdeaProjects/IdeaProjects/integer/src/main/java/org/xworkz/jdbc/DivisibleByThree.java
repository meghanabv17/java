package org.xworkz.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DivisibleByThree {
    public static void main(String[] args) {

        List<Integer>collection = new ArrayList();
        collection.add(100);
        collection.add(85);
        collection.add(12);
        collection.add(224);
        collection.add(541);
        collection.add(131);
        collection.add(152);
        collection.add(79);
        collection.add(91);
        collection.add(39);
        collection.add(21);
        collection.add(32);

        System.out.println("the number divisible by 3: "+
                collection.stream().filter(num->num%3==0).collect(Collectors.toList()));
        System.out.println("Number between 100 and 300: "+
                collection.stream().filter(num->num>100&&num<300).collect(Collectors.toList()));
        System.out.println("Number divisible by 5: "
                +collection.stream().filter(num->num%5==0).collect(Collectors.toList()));
    }
}
