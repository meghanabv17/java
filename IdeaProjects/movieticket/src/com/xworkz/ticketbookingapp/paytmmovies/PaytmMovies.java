package com.xworkz.ticketbookingapp.paytmmovies;

import com.xworkz.ticketbookingapp.bookmyshow.BookMyShow;

public class PaytmMovies implements BookMyShow {
    @Override
    public int noOfSeats() {
        return 10;
    }

    @Override
    public boolean pvrCondition() {
        return true;
    }
}
