package com.xworkz.patient.street;

public class Street {
    public int streetNo;
    public String streetName;

    public Street(int streetNo,String streetName)
    {
        this.streetNo=streetNo;
        this.streetName=streetName;
    }

    public void getStreetDetails()
    {
        System.out.println("Street no "+this.streetNo);
        System.out.println("Street name "+this.streetName);
    }

}
