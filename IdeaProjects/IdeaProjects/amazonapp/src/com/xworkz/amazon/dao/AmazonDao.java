package com.xworkz.amazon.dao;

import com.xworkz.amazon.dto.AmazonDto;

public class AmazonDao {
    public void getDetails(AmazonDto shiva) {
        System.out.println("The email is: "+shiva.getEmail());
        System.out.println("The password is: "+shiva.getPassword());
        System.out.println("The phone number is: "+shiva.getPhoneNo());
        System.out.println("The adresss is: "+shiva.getAddresss());
        System.out.println("The user name is: " +shiva.getUserName());
        System.out.println("user Amazon process ended");
    }
}