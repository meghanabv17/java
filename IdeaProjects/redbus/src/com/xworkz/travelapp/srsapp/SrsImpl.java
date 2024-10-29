package com.xworkz.travelapp.srsapp;

import com.xworkz.travelapp.contract.RedBusContarct;

public class SrsImpl implements RedBusContarct {
    @Override
    public int minNoOfBooking() {
        return 21;
    }

    @Override
    public boolean busCondition() {
        return false;
    }
}
