package com.xworkz.array;

public class Array {
    public static void main(String[] args) {

        Object[] obj = new Customer[2];
        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("Megha");
        customer.setPhoneNumber(8523698521l);
        customer.setAddress("Mysore");
        obj[0] = customer;
        System.out.println(obj[0]);
    }
}
