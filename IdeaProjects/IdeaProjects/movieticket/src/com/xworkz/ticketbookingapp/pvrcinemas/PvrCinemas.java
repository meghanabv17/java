package com.xworkz.ticketbookingapp.pvrcinemas;

import com.xworkz.ticketbookingapp.bookmyshow.BookMyShow;

public class PvrCinemas implements BookMyShow {
    @Override
    public int noOfSeats() {
        return 1;
    }

    @Override
    public boolean pvrCondition() {
        return true;
    }
}
