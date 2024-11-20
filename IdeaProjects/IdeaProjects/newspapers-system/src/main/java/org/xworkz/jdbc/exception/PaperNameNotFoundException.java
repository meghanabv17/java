package org.xworkz.jdbc.exception;

public class PaperNameNotFoundException extends RuntimeException{
    public PaperNameNotFoundException(String message){
        System.out.println(message);
    }
}
