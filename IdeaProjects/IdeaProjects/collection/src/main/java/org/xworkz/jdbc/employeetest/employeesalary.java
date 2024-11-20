package org.xworkz.jdbc.employeetest;

public class employeesalary {
    public static class Employee {
        private String name;
        private double[] salaries;

        // Constructor to initialize the employee's name and salaries array
        public Employee(String name, double[] salaries) {
            this.name = name;
            this.salaries = salaries;
        }
        // Method to calculate and return the average salary
        public double calculateAverageSalary() {
            double sum = 0;
            for (double salary : salaries) {
                sum += salary;
            }
            return sum / salaries.length;
        }
        // Method to return the highest salary
        public double getHighestSalary() {
            double highest = salaries[0];
            for (double salary : salaries) {
                if (salary > highest) {
                    highest = salary;
                }
            }
            return highest;
        }
        // Getter for the employee's name (optional, for displaying the name if needed)
        public String getName() {
            return name;
        }

    }

}
