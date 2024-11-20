package com.xworkx.createaccount.dao;

import com.xworkx.createaccount.dto.CreateAccountDto;

public class CreateAccountDao {
    CreateAccountDto dto;

    public boolean createNewAccount(CreateAccountDto dto)
    {
        System.out.println("Account creation started");
        boolean isAccountCreated = false;
        if(dto!=null)
        {
            this.dto = dto;
            isAccountCreated = true;
        }else{
            System.out.println("Please provide valid details");
        }
        System.out.println("Account created");
        return isAccountCreated;
    }
    public void getdetails(){
        System.out.println("The user name is: "+dto.userNm);
        System.out.println("The password is: "+dto.pwd);
        System.out.println("The phone number is: "+dto.phoneNo);
        System.out.println("The email id is: "+dto.emailid);
        System.out.println("The date of birth is: "+dto.doB);
    }

}
