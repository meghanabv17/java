package org.xworkz.jdbc.map;

import org.xworkz.jdbc.productdetails.ProductDto;

import java.sql.Connection;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Map.*;

public class MapRunner {
    public static void main(String[] args) {
        //Map map = new LinkedHashMap<>();
        Map<Integer, ProductDto> map = new HashMap();

        /*map.put(5, "Cricket");
        map.put(8, "Volleyball");
        map.put(10, "Hockey");
        map.put(8, "Kho-Kho");
        map.put(2, "Kabaddi");
        map.put(1, "ThrowBall");
        map.put(22, "Badmiton");
        map.put(2, "Lifting");
        map.put(50,"Hockey");*/
        map.put(4, new ProductDto(2,"AC",1000.0,"Cool",4.1));
        map.put(25, new ProductDto(1,"Sunscream",500.0,"Beauty",3.1));
        map.put(12,new ProductDto(5,"Pen",13.0,"Writing",3.1));


        Map<Integer, ProductDto> sortedMap = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.comparing(ProductDto::getName)))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
        System.out.println(sortedMap);


        //Map<Integer, ProductDto> sortedByValue = map.entrySet().stream().sorted(Map.;
//using foreach;
       // map.forEach((k,v)-> System.out.println(k +" "+v));
//converting map to set and get the value;
        /*Set<Map.Entry<Integer,String>> entrySet = map.entrySet();
        for(Map.Entry<Integer,String> entry : entrySet){
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key +" "+value);
        }*/
    }
}
