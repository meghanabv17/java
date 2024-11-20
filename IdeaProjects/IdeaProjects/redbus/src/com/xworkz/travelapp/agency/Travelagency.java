package com.xworkz.travelapp.agency;

import com.xworkz.travelapp.contract.RedBusContarct;

public class Travelagency {
    RedBusContarct contract;
    //int noOfSeats;

    public boolean booking(RedBusContarct contract, int noOfSeats){
        System.out.println("Booking for safe journey started");
        boolean isbooked = false;
        if(contract != null){
            System.out.println("Contrct initiated check the bus condition");
            boolean isConditionGood = contract.busCondition();
                if(isConditionGood){
                    //if(noOfSeats > 0) {
                        //System.out.println("Seats are available....");
                        System.out.println("Bus condition is good");
                        this.contract = contract;
                        isbooked = true;
                   // }else System.out.println("There is no seats available here...!!");
            }else System.out.println("Bus condition is not good..... you are not able to travel");
        }else System.out.println("You cannot able to book....");
        System.out.println("Booking for safe journey ended");
        return isbooked;
    }
}
