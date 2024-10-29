package com.xworkz.patientdetails.street;

public class Street {

    public int streetNo;
    public String streetName;

    public Street(int streetNo, String streetName) {
        this.streetNo = streetNo;
        this.streetName = streetName;
    }

        public void getStreetDetails()
        {
            System.out.println("The street number is: "+this.streetNo);
            System.out.println("The street name is: "+this.streetName);
        }
}
