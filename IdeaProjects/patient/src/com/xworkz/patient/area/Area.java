package com.xworkz.patient.area;

import com.xworkz.patient.street.Street;

public class Area {

    public String areaName;
    public Street street;

    public Area(String areaName,Street street)
    {
        this.areaName=areaName;
        this.street=street;
    }
    public void getStreet()
    {
        System.out.println("Area name "+this.areaName);
        this.street.getStreetDetails();
    }

}
