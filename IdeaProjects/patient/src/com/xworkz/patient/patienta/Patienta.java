package com.xworkz.patient.patienta;

import com.xworkz.patient.address.Address;
import com.xworkz.patient.constant.Gender;

public class Patienta {

    public String pName;
    public Address address;
    public Gender gender;
    public String bloodGroup;
    public static String hospitalName;

    public Patienta(String pName,Address address)
    {
        this.address=address;
        this.pName=pName;
    }
    public void display() {
        System.out.println("patient details");
        System.out.println("Patient Name " + pName);
        System.out.println("Patient gender is: "+gender);
        System.out.println("The patient blood group is: "+bloodGroup);
        this.address.getAddress();
    }
}
