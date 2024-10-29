package com.xworkz.createaccount.dao;

import com.xworkz.createaccount.dto.CreateAccountDto;

public class CreateAccountdao {
    CreateAccountDto dto;

    public boolean CreateAccountDetails(CreateAccountDto dto)
    {
        System.out.println("Creating a account");
        boolean isAccountCreated = false;
        if(null != dto)
        {
            this.dto = dto;
            isAccountCreated = true;
        }else{
            System.out.println("Please provide a valid details");
        }
        System.out.println("Account created");
        return isAccountCreated;
    }
    public void getDetails(){

        System.out.println("The user name is: "+dto.userNm);
        System.out.println("The password is: "+dto.pwd);
        System.out.println("The phone number is: "+dto.pwd);
        System.out.println("The date of birth is: "+dto.doB);
        System.out.println("The emailid is: "+dto.emailId);
    }
}
