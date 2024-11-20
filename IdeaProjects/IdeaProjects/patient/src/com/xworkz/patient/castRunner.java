package com.xworkz.patient;

public class castRunner {
    public static void main(String[] args) {

        //typecasting
        //implicit primitive typecasting
        int i = 100;
        double i1= i;
        System.out.println(i1);

        //explicit primitive typecasting
        double i2 = 200;
        int i3 = (int) i2;
        System.out.println(i3);

        byte i5 = (byte)450;
        System.out.println("The number is: "+i5);
    }
}
