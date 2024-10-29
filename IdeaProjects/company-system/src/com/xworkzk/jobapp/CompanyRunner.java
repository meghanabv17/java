package com.xworkzk.jobapp;

import com.xworkzk.jobapp.company.Company;
import com.xworkzk.jobapp.employee.Employee;
import com.xworkzk.jobapp.impl.CompanyImpl;

import java.util.Scanner;

public class CompanyRunner {
    public static void main(String[] args) {
        Company company = new CompanyImpl();
        Scanner scanner = new Scanner(System.in);

        for (int index = 0; index < 1; index++) {
            Employee employee = new Employee();

            System.out.println("Enter a employee Id");
            int id = scanner.nextInt();
            employee.setEmployeeId(id);
            System.out.println("Enter employee name");
            String name = scanner.next();
            employee.setEmployeeName(name);
            System.out.println("Enter employee blood group");
            String bloodGroup = scanner.next();
            employee.setBloodGroup(bloodGroup);
            System.out.println("Enter the address of the employee");
            String address = scanner.next();
            employee.setAddress(address);
            company.addEmployeeDetails(employee);
        }
        company.getAllEmployeeDetails();

        //updateNameById
        System.out.println("Enter a id which you wants to update the name");
        int existingId = scanner.nextInt();
        System.out.println("Enter the new name");
        String newName = scanner.next();
        company.updateNameById(newName,existingId);
        company.getAllEmployeeDetails();

        //getAddressByName
        System.out.println("Enter the name to get address");
        String name = scanner.next();
        String address = company.getAddressByName(name);
        System.out.println("The adreess of the given name is: "+address);
    }
}
