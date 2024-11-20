package com.xworkz.patient.address;

import com.xworkz.patient.country.Country;

public class Address {

    public Country country;

    public Address(Country country)
    {
        this.country=country;
    }
    public void getAddress()
    {

        this.country.getCountry();
    }
}
