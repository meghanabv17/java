package com.xworkz.examapp.supplementary;

import com.xworkz.examapp.exam.Exam;
import com.xworkz.examapp.hallticket.HallTicket;

public class SupplementaryExam extends Exam {

    int noOfAttempts = 2;

   @Override
    public boolean allow(HallTicket ticket) {
        System.out.println("supplementary method started");
       System.out.println("Parvagilla innond sala bari pass agtiya");
        boolean isAllowed = false;
        if (noOfAttempts > 1) {
            if (fees == 300) {
                if (ticket != null) {
                    this.ticket = ticket;
                    this.ticket.getDetails();
                    isAllowed = true;
                    System.out.println("Hall ticket issued");
                } else {

                    System.out.println("Candidate details not found go n get a proper hallticket");
                }
            } else  System.out.println("Modlu bandu supplementary fees kattu");
        }else System.out.println("Unfortunetely you are passed, you can go and enjoy");
        return isAllowed;
    }
}
