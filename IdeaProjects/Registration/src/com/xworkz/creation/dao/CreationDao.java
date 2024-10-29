package com.xworkz.creation.dao;

import com.xworkz.creation.dto.CreationDto;

public class CreationDao {
    CreationDto dto;

    public boolean createAccount(CreationDto dto)
    {
        System.out.println("Registration started");
        boolean isRegistreated = false;
        if(dto != null)
        {
            this.dto = dto;
            isRegistreated = true;
        }else{
            System.out.println("Please provide a valid details");
        }
        System.out.println("Registration ended");
        return isRegistreated;
    }

    public void getDetails()
    {
        System.out.println("The user name is: "+dto.Name);
        System.out.println("the father name is: "+dto.fatherName);
        System.out.println("The mother name is: "+dto.motherName);
        System.out.println("The mobile number is: "+dto.mobileNumber);
        System.out.println("The security question is: "+dto.securityQue);
        System.out.println("The security answer is; "+dto.securityAnswer);
    }

}
