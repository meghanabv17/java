package org.xworkz.jdbc;

import org.xworkz.jdbc.sort.DueDateComparator;
import org.xworkz.jdbc.sort.IdComparator;
import org.xworkz.jdbc.sort.IssueDateComparator;
import org.xworkz.jdbc.sort.PriceComparator;

import java.util.ArrayList;
import java.util.List;

public class BillDtoRunner {
    public static void main(String[] args) {

        List<BillDto> bills = new ArrayList();

        BillDto bill = new BillDto(1,"12/10/24","24/11/24",20000.0);
        BillDto bill1 = new BillDto(2,"13/08/24","21/11/24",5000.0);
        BillDto bill2 = new BillDto(3,"23/11/24","25/12/24",25000.0);
        BillDto bill3 = new BillDto(4,"18/10/24","29/10/24",15000.0);
        BillDto bill4 =new BillDto(5,"1/05/24","1/08/24",500000.0);
        BillDto bill5 = new BillDto(6,"11/07/24","11/08/24",8000.0);

        bills.add(bill5);
        bills.add(bill3);
        bills.add(bill4);
        bills.add(bill1);
        bills.add(bill);
        bills.add(bill2);

//To retrive the data;
        bills.sort(new IdComparator());
        System.out.println("Sorting by id:");
        bills.forEach(System.out::println);

        System.out.println("Sorting by issue date");
        bills.sort(new IssueDateComparator());
        bills.forEach(System.out::println);

        System.out.println("sorting by due date:");
        bills.sort(new DueDateComparator());
        bills.forEach(System.out::println);

        System.out.println("Sorting by amount:");
        bills.sort(new PriceComparator());
        for (BillDto All_bills : bills){
            System.out.println(All_bills);
        }
    }
}