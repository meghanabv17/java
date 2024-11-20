package com.xworkzk.jobapp.company;

import com.xworkzk.jobapp.employee.Employee;

public interface Company {

    boolean addEmployeeDetails(Employee employee);
    void getAllEmployeeDetails();

    boolean updateNameById(String newName, int existingId);

    String getAddressByName(String name);
    public boolean DeleteEmployee();
}
