package org.xworkz.jdbc.exception;

public class IdNotFoundException extends RuntimeException {
        public IdNotFoundException(String errorMessage){
            System.out.println(errorMessage);
        }
}