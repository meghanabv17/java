package org.xworkz.jdbc.exception;

public class NoOfPagesNotFoundException extends RuntimeException{
    public NoOfPagesNotFoundException(String message){
        System.out.println(message);
    }
}
