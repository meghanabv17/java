package org.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PoetWriter {

    public static void main(String[] args) {
        Collection writer = new ArrayList();
        Collection writer1 = new ArrayList();
        writer.add("Aravind adiga");
        writer.add("Salman Rushdie");
        writer.add("Arundati roy");
        writer.add("Neelam sakena chandra");
        writer1.add("Rakhi kapoor");
        writer1.add("Jhumpa lahiri");
        writer1.add("Kiran desai");
        writer1.add("Dr sumit goel");
        writer.addAll(writer);

        writer.remove("Aravind adiga");
        writer.removeAll(writer1);
        System.out.println("Contains: "+writer.contains("Salman Rushdie"));
        System.out.println("The writers are: "+writer);
        System.out.println("The size is: "+writer.size());
        System.out.println("Retains: "+writer.retainAll(writer1));
        System.out.println(writer.containsAll(writer1));
        writer1.clear();
        System.out.println("Writers are: "+writer1);

        List writer2 = new ArrayList();
        List writer3 = new ArrayList();
        writer2.add(0,"Chitra Divakaruni");
        writer2.add(1,"Ravi subramanian");
        writer3.add("Sandeep");
        writer3.addAll(0,writer2);
        System.out.println(writer3);

    }
}
