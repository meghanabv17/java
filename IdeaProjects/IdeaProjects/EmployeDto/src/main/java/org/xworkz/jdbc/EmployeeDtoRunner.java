package org.xworkz.jdbc;

import org.xworkz.jdbc.sort.DepartmentComparator;
import org.xworkz.jdbc.sort.IdComparator;
import org.xworkz.jdbc.sort.NameComparator;
import org.xworkz.jdbc.sort.SalaryComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EmployeeDtoRunner {
    public static void main(String[] args) {

        List<EmployeeDto> collection = new ArrayList<EmployeeDto>();

        EmployeeDto employeeDto = new EmployeeDto(1,"Akash",15000,"Sales");
        EmployeeDto employeeDto1 = new EmployeeDto(2,"Ramya",25000,"Sales execute");
        EmployeeDto employeeDto2 = new EmployeeDto(3,"Sneha",120000,"Testing");
        EmployeeDto employeeDto3 = new EmployeeDto(4,"Bhargav",40000,"Networking");
        EmployeeDto employeeDto4 = new EmployeeDto(5,"Shekar",18000,"Mechanical");
        EmployeeDto employeeDto5 = new EmployeeDto(6,"Pavan",30000,"Field work");
        EmployeeDto employeeDto6 = new EmployeeDto(7,"Nikhil",35000,"Analyst");
        EmployeeDto employeeDto7 = new EmployeeDto(8,"Rashmi",40000,"Embedded");
        EmployeeDto employeeDto8 = new EmployeeDto(9,"Poorvi",21000,"Manufacturing");
        EmployeeDto employeeDto9 = new EmployeeDto(10,"Mani",200000,"Developer");

        collection.add(employeeDto1);
        collection.add(employeeDto9);
        collection.add(employeeDto4);
        collection.add(employeeDto);
        collection.add(employeeDto2);
        collection.add(employeeDto5);
        collection.add(employeeDto3);
        collection.add(employeeDto7);
        collection.add(employeeDto6);
        collection.add(employeeDto8);
//to retrive the date;
        /*for(EmployeeDto Details : collection){
            System.out.println("The details are: "+Details);
        }*/
//comparator

        /*System.out.println("Sorting by Department:");
        collection.sort(new DepartmentComparator());
        Iterator iterator = collection.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("Sorting by id");
        Collections.sort(collection);
        collection.forEach(System.out::println);

        System.out.println("Sorting by Name:");
        collection.sort(new NameComparator());
        for (EmployeeDto Detail : collection){
            System.out.println(Detail);
        }
        collection.sort(new SalaryComparator());
        System.out.println("Sorting by Salary");
        for(EmployeeDto salary : collection){
            System.out.println(salary);
        }
*/
        System.out.println("sorting id method started");
        Collections.sort(collection);
        collection.forEach(System.out::println);

        System.out.println("sorting salary method started");
        Collections.sort(collection , new SalaryComparator());
        for(EmployeeDto sortsalary : collection){
            System.out.println(sortsalary);
        }
    }
}