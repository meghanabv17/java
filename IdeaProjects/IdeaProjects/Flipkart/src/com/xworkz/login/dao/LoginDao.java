package com.xworkz.login.dao;

import com.xworkz.login.dto.LoginDto;

public class LoginDao {
    LoginDto dto;

    public boolean createAccount(LoginDto dto)
    {
        System.out.println("login started");
        boolean islogin = false;
        if(dto!=null){
            this.dto = dto;
            islogin = true;
        }else{
            System.out.println("please provide correct login information");
        }
        System.out.println("Login completed");
        return islogin;
    }
    public void getdetails(){
        System.out.println("The user name is: "+dto.userNm);
        System.out.println("The password id: "+dto.pwd);
        System.out.println("The phone number is: "+dto.pNo);
        System.out.println("The email id is: "+dto.emailId);
        System.out.println("The date of birth is: "+dto.doB);
    }
}
