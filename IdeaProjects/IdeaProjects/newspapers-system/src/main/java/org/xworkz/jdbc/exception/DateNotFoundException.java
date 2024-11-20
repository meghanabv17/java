package org.xworkz.jdbc.exception;

public class DateNotFoundException extends RuntimeException{
    public DateNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }
}
