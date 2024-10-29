package com.xworkz.showapp.pvr;

import com.xworkz.showapp.bookmyshow.BookMyShow;
import com.xworkz.showapp.paytm.Paytm;
import com.xworkz.showapp.theater.Theater;

public class Pvr implements BookMyShow , Theater, Paytm {

        @Override
        public int miniBooking () {

            System.out.println("Book My Show ownerName :" + ownerName);
        return 0;
    }
    }
