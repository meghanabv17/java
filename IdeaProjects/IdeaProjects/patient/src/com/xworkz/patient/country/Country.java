package com.xworkz.patient.country;

import com.xworkz.patient.state.State;

public class Country {

    public String countryName;
    public State state;

    public Country(String countryName,State state)
    {
        this.countryName=countryName;
        this.state=state;
    }
    public void getCountry()
    {
        System.out.println("Country Name "+this.countryName);
        this.state.getState();
    }

}
