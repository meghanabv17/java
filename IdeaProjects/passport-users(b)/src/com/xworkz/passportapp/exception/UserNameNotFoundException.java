package com.xworkz.passportapp.exception;

public class UserNameNotFoundException extends RuntimeException{

    public UserNameNotFoundException(String errorMessage)
    {
        System.out.println(errorMessage);
    }
}
