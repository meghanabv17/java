package com.xworkz.trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GetAge {
    public static void main(String[] args) {
        System.out.println("main started");

        //InputMismatchException
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the user age");
            int age = scanner.nextInt();
            System.out.println("The age is: "+age);
        }catch(InputMismatchException e){
            System.out.println("Enter the age in only numbers");
        }
        System.out.println("Main ended");
    }
}
