package com.xworkzk.jobapp.impl;

import com.xworkzk.jobapp.company.Company;
import com.xworkzk.jobapp.employee.Employee;

public class CompanyImpl implements Company {
    Employee employee[] = new Employee[1];
    int index;
    boolean isAdded = false;
    boolean isUpdated = false;

    @Override
    public boolean addEmployeeDetails(Employee employee) {
        if(employee != null){
            if(employee.getEmployeeId() > 0 && employee.getEmployeeName() != null
            && employee.getAddress() != null){
                this.employee[index++] = employee;
                isAdded = true;
            }else System.out.println("Provide valid information....!!");
        }
        return isAdded;
    }

    @Override
    public void getAllEmployeeDetails() {
        for(Employee employee : employee){
            System.out.println("Employee details are : "+employee);
        }
    }

    @Override
    public boolean updateNameById(String newName, int existingId) {
        for (int index = 0; index < employee.length; index++) {

            if (this.employee[index].getEmployeeId() == existingId) {
                this.employee[index].setEmployeeName(newName);
                isUpdated = true;
            } else System.out.println("Id cannot found");
        }
        return isUpdated;
    }

    @Override
    public String getAddressByName(String name) {
        String address = null;
        for (int index = 0; index < employee.length; index++) {
            if(this.employee[index].getEmployeeName().equals(name)) {
                address = this.employee[index].getAddress();
            }else System.out.println("Entered name cannot found");
        }
        return address;
    }

    @Override
    public boolean DeleteEmployee() {
        return false;
    }
}
