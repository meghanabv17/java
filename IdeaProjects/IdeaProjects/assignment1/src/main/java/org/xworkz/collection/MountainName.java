package org.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MountainName {

    public static void main(String[] args) {
        Collection mountains = new ArrayList();
        Collection mountains1 = new ArrayList();
// Adding mountain names to the first collection
        mountains.add("Mount Everest");
        mountains.add("K2");
        mountains.add("Kangchenjunga");
        mountains.add("Lhotse");
// Adding mountain names to the second collection
        mountains1.add("Makalu");
        mountains1.add("Cho Oyu");
        mountains1.add("Dhaulagiri");
        mountains1.add("Manaslu");
// Adding all elements from mountains to itself (which has no effect)
        mountains.addAll(mountains);
// Removing a specific mountain
        mountains.remove("Mount Everest");
// Removing all mountains present in mountains1
        mountains.removeAll(mountains1);
// Checking if a specific mountain is present
        System.out.println("Contains K2: " + mountains.contains("K2"));
// Printing remaining mountains in the collection
        System.out.println("The mountains are: " + mountains);
// Printing the size of the mountains collection
        System.out.println("The size is: " + mountains.size());
// Retaining only the mountains present in mountains1 (none in this case)
        System.out.println("Retains: " + mountains.retainAll(mountains1));
// Checking if all mountains in mountains1 are present in mountains (should return false)
        System.out.println("Contains all from mountains1: " + mountains.containsAll(mountains1));
// Clearing the second collection
        mountains1.clear();
        System.out.println("Mountains in mountains1: " + mountains1);
// Working with lists
        List mountains2 = new ArrayList();
        List mountains3 = new ArrayList();
// Adding mountains to specific positions in the list
        mountains2.add(0, "Annapurna");
        mountains2.add(1, "Shishapangma");
// Adding another mountain to the list
        mountains3.add("Broad Peak");
// Adding all elements from mountains2 to mountains3 starting at position 0
        mountains3.addAll(0, mountains2);
// Printing the final list
        System.out.println(mountains3);
    }
}
