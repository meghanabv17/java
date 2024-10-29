package com.xworkz.travelapp;

import com.xworkz.travelapp.agency.Travelagency;
import com.xworkz.travelapp.contract.RedBusContarct;
import com.xworkz.travelapp.srsapp.SrsImpl;
import com.xworkz.travelapp.vrlapp.VrlImpl;

public class TravelRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        Travelagency travelagency = new Travelagency();
        RedBusContarct vrlbus = new VrlImpl();
        travelagency.booking(vrlbus,12);

        RedBusContarct srsbus = new SrsImpl();
        travelagency.booking(srsbus, 0);

        System.out.println("Main ended");
    }
}
