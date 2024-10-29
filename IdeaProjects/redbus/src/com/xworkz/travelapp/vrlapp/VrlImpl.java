package com.xworkz.travelapp.vrlapp;

import com.xworkz.travelapp.contract.RedBusContarct;

public class VrlImpl implements RedBusContarct {
    @Override
    public int minNoOfBooking() {
        return 32;
    }

    @Override
    public boolean busCondition() {
        return true;
    }
}
