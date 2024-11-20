package org.xworkz.jdbc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Odd_Even {
    public static void main(String[] args) {
        Collection<Integer> number = new ArrayList<>();
        number.add(123);
        number.add(25634);
        number.add(859632147);
        number.add(36985);
        number.add(21141);
        number.add(112);

        List<Integer> EvenNumber = number.stream().filter(i-> (i%2 == 0)).collect(Collectors.toList());
        System.out.println("Even numbers are:");
        EvenNumber.forEach(System.out::println);

        List<Integer> oddNumber = number.stream().filter(in -> (in%2 != 0)).collect(Collectors.toList());
        System.out.println("Odd numbers are:");
        oddNumber.forEach(System.out::println);
    }
}
