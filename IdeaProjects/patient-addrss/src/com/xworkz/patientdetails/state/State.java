package com.xworkz.patientdetails.state;

import com.xworkz.patientdetails.city.City;

public class State {

    public String stateName;
    public City city;
    public State(String stateName){
        this.stateName = stateName;
    }

    public void getStateDetails(){
        System.out.println("The state name is: "+this.stateName);
        city.getCityDetails();
    }
}
