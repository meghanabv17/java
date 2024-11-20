package com.xworkz.ticketbookingapp.booking;

import com.xworkz.ticketbookingapp.bookmyshow.BookMyShow;

public class GetTicket {

    BookMyShow ticket;
    public boolean booking(BookMyShow ticket, int noOfSeats){
        boolean isbooked = false;
        if(ticket != null){
            System.out.println("Booking initialised... Check the pvr condition");
            if(ticket.pvrCondition() == true) {
                System.out.println("Pvr is descent Please check seat availability");
                if (noOfSeats > 0) {
                    System.out.println("Seats are available");
                    this.ticket = ticket;
                    isbooked = true;
                } else System.out.println("No empty seats..! please change the date");
            }else System.out.println("Pvr is not descent");
        }else System.out.println("Not able book your......");
        return isbooked;
    }
}
