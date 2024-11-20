package com.xworkz.patientdetails.city;

import com.xworkz.patientdetails.area.Area;

public class City {

    public Area area;
    public String cityName;

    public City(String cityName){
        this.cityName = cityName;
    }

    public void getCityDetails(){
        area.getAreaDetails();
        System.out.println("The city name is: "+this.cityName);
    }
}
