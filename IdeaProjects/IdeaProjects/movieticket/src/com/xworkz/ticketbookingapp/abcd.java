package com.xworkz.ticketbookingapp;

public class abcd {
    public static void main(String[] args) {
        interface MyInterface {
            // You can declare a method similar to an Object method
            String toString();
        }

        class MyClass implements MyInterface {
            // Override the toString method from Object
            @Override
            public String toString() {
                return "MyClass Implementation";
            }
        }

    }
}
