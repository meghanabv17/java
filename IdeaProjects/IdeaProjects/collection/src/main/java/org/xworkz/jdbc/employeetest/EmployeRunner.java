package org.xworkz.jdbc.employeetest;

public class EmployeRunner {
    // Main method to test the Employee class
    public static void main(String[] args) {
        double[] salaries = {50000, 55000, 60000, 58000, 62000};
        employeesalary.Employee employee = new employeesalary.Employee("John Doe", salaries);

        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Average Salary: " + employee.calculateAverageSalary());
        System.out.println("Highest Salary: " + employee.getHighestSalary());
    }
}
