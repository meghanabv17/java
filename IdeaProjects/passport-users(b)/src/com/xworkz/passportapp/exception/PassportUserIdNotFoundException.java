package com.xworkz.passportapp.exception;

public class PassportUserIdNotFoundException extends RuntimeException{


    public PassportUserIdNotFoundException(String errorMessage)
    {
        System.out.println(errorMessage);
    }

}
