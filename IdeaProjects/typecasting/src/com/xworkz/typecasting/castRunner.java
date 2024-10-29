package com.xworkz.typecasting;

public class castRunner {
    public static void main(String[] args) {


        //typecasting
        //implicit primitive typecasting
        int i = 100;
        double i1 = i;
        System.out.println("the double number is: "+i1);


        //explicit primitive typecasting
        double i2 = 200.12;
        int i3 = (int) i2;
        System.out.println("The int number is: "+i3);

        byte i5 = (byte) 450;
        System.out.println("The byte number is: " + i5);
    }
}
