package com.xworkz.creation.dao;

import com.xworkz.creation.dto.CreationDto;

public class CreationDao {
    CreationDto dto;

    public boolean createAccount(CreationDto dto)
    {
        System.out.println("Account creation started");
        boolean isAccountCreated = false;
        if(dto != null)
        {
            this.dto = dto;
            isAccountCreated = true;
        }else{
            System.out.println("Please provide a valid information");
        }
        System.out.println("Account created");
        return isAccountCreated;
    }
    public void grtDetails()
    {
        System.out.println("The user name is: "+dto.userNm);
        System.out.println("the password is: "+dto.pwd);
        System.out.println("The phone number is: "+dto.pNo);
        System.out.println("The email id is: "+dto.emailId);
        System.out.println("The date if birth is: "+dto.doB);
    }
}
