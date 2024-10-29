package com.xworkz.ticketbookingapp;

import com.xworkz.ticketbookingapp.booking.GetTicket;
import com.xworkz.ticketbookingapp.bookmyshow.BookMyShow;
import com.xworkz.ticketbookingapp.paytmmovies.PaytmMovies;
import com.xworkz.ticketbookingapp.pvrcinemas.PvrCinemas;

public class TicketRunner {
    public static void main(String[] args) {
        System.out.println("Main started");
        GetTicket get = new GetTicket();
        BookMyShow ticket = new PaytmMovies();
        get.booking(ticket, 0);
        System.out.println("-----------------------------------------------------------");

        BookMyShow ticket1 = new PvrCinemas();
        get.booking(ticket1, 10);

        System.out.println("Main ended");
    }
}
