package com.xworkz.patient.state;

import com.xworkz.patient.area.Area;
import com.xworkz.patient.city.City;
import com.xworkz.patient.street.Street;

public class State {

    public String stateName;
    public City city;

    public State(String stateName,City city)
    {
        this.stateName=stateName;
        this.city=city;
    }
    public void getState()
    {
        System.out.println("State name "+this.stateName);
        this.city.getCity();
    }


}
