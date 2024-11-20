package com.xworkz.register.dao;

import com.xworkz.register.dto.RegisterDto;

import java.sql.SQLOutput;

public class RegisterDao {
    RegisterDto dto;

    public boolean createAccount(RegisterDto dto)
    {
        System.out.println("Registration started");
        boolean isRegistered = false;
        if(dto!=null)
        {
            this.dto = dto;
            isRegistered = true;
        }else{
            System.out.println("Please provide valid details");
        }
        System.out.println("Registration completed");
        return isRegistered;
    }
    public void getDetails(){
        System.out.println("The name is: "+dto.fullNm);
        System.out.println("The phone number is: "+dto.phoneNo);
        System.out.println("The emailid is: "+dto.emailid);
        System.out.println("The password is: "+dto.pwd);
        System.out.println("The type of the job is: "+dto.jobtype);
    }
}
