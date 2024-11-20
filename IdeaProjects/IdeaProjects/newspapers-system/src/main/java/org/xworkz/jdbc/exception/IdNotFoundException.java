package org.xworkz.jdbc.exception;

public class IdNotFoundException extends RuntimeException{
    public IdNotFoundException(String message){
        System.out.println(message);
    }
}
