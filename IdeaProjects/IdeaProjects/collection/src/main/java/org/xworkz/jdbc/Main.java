package org.xworkz.jdbc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
collection.add("Red velvet");
collection.add("Fruits & nuts");
collection.add("Oreo");
collection.add("Fuse");
collection.add("Crackle");
collection.add("Five Star");
collection.add("Bubbly");
collection.add("Kitkat");
collection.add("Snikers");
collection.add("King");
collection.add("Butterscotch");

Collection collection1 = new ArrayList();
collection1.add("Rose");
collection1.add("Jasmine");
collection1.add("Champu");
collection1.add("Marigold");
////to add the entire data
//collection1.addAll(collection);
       System.out.println("The chocolates are: "+collection);
        System.out.println("The flowers are: "+collection1);


       // collection.retainAll(Rose);

//getting the size of the data --> int is the return type;
        System.out.println("The total size of the data is: "+collection1.size());

//check is available or not --> boolean is the return type;
//clear --> return type is void;
        collection1.clear();
//remove(object o) --> return type is boolean;
//removeAll(Collection e)--> return type is boolean;

//contains(object e), containsAll(Collection e)--> return type is boolean;
        boolean isAvailable = collection.contains("Kitkat");
        System.out.println("Chocolate is available : "+isAvailable);
//fetching a details by using for each;
        /*for(Object type: collection){
            System.out.println((String)type);
        }*/

//retrive a object from collection;
        Iterator<String> itr = collection.iterator();
        System.out.println("Retrive object from the collection");
        while(itr.hasNext()){
            String chocolate_Names = itr.next();
            System.out.println("The chocolate is: "+chocolate_Names);
        }
    }
}