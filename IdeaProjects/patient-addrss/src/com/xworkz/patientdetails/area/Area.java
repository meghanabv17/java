package com.xworkz.patientdetails.area;

import com.xworkz.patientdetails.street.Street;

public class Area {

    public Street street;
    public String areaName;
    public Area(String areaName){
     this.areaName = areaName;
    }

    public void getAreaDetails(){
        System.out.println("The area name is: "+this.areaName);
        this.street.getStreetDetails();

    }

}
