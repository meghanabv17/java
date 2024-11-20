package com.xworkz.trycatch;

public class Division {
    public static void main(String[] args) {
        System.out.println("Main started");
        divide(10,0);
        System.out.println("Main ended");
    }

    //ArithmeticException
    public static void divide(int n,int d){
        System.out.println("Division method started");
        try{
            System.out.println(n/d);
        }catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        System.out.println("Division method ended");
    }
}
