package com.xworkz.examapp.exam;

import com.xworkz.examapp.hallticket.HallTicket;

public class Exam {

    public int fees;
    public HallTicket ticket;

    public boolean allow(HallTicket ticket){
        System.out.println("Exam method started");
        boolean isAllowed = false;
        if(fees == 1800){
            System.out.println("Fees paid....!! begha ogi exam bari");
            if(ticket != null){
                this.ticket = ticket;
                this.ticket.getDetails();
                isAllowed = true;
                System.out.println("Hall ticket issued");
            }else {
                System.out.println("Candidate details not found go n get a proper hallticket");
            }
        }else{
            System.out.println("Modlu bandu fees kattu");
        }
        return isAllowed;
    }

    }
