package com.xworkz.showapp;

import com.xworkz.showapp.bookmyshow.BookMyShow;
import com.xworkz.showapp.paytm.Paytm;
import com.xworkz.showapp.pvr.Pvr;

public class BookMyShowRunner {

    public static void main(String[] args){
      //  System.out.println(BookMyShow.ownerName);
        BookMyShow bookMyShow = new Pvr();
        int miniBooking = bookMyShow.miniBooking();
        System.out.println("mini booking is done by paytm..........");
        Paytm paytm = new Pvr();
        }
    }

