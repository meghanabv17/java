package org.xworkz.jdbc;
import java.util.ArrayList;
import java.util.Collection;

public class runner {
    public static void main(String[] args) {

        Collection collection = new ArrayList();
        Collection collection1 = new ArrayList();
        dto dto4 = new dto(4,"Guli",3.2);
        dto dto5 = new dto(5,"Malla",3.0);
        dto dto1 = new dto(1, "KGF", 4.0);
        dto dto2 = new dto(2, "Three", 5.0);
        dto dto3 = new dto(3, "Galipata", 5.0);
collection.add(dto1);
collection.add(dto2);
collection.add(dto3);
collection1.add(dto4);
collection1.add(dto5);

collection.addAll(collection1);

        collection.forEach(System.out::println);
        collection1.forEach(System.out::println);

        System.out.println(collection1.size());

        System.out.println(collection.contains("Guli"));
        System.out.println(collection.containsAll(collection1));
        System.out.println(collection1.remove("KGF"));
        System.out.println(collection.removeAll(collection1));

        collection.forEach(System.out::println);
    }
}
