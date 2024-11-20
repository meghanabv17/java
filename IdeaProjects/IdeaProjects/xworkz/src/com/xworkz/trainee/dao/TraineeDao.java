package com.xworkz.trainee.dao;

import com.xworkz.trainee.dto.TraineeDto;

public class TraineeDao {


    public TraineeDao(){
        System.out.println("Dao invoked successfully");
    }

    public void getDetails(TraineeDto ref){
        System.out.println("The trainee name is: "+ref.getTraineeName());
        System.out.println("The phone number is: "+ref.getPhoneNumber());
        System.out.println("The USN is: "+ref.getUSN());
        System.out.println("The reference id is: "+ref.getRefId());
        System.out.println("The emailid is: "+ref.getEmailId());
    }

}
