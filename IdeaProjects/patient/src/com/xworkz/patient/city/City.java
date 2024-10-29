package com.xworkz.patient.city;

import com.xworkz.patient.area.Area;
import com.xworkz.patient.street.Street;

public class City {

    public String cityName;
    public Area area;

    public City(String cityName,Area area)
    {
        this.cityName=cityName;
        this.area=area;
    }
    public void getCity()
    {
        System.out.println("City name "+this.cityName);
        this.area.getStreet();
    }
}
