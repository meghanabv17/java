package com.xworkz.trycatch;

import java.util.Scanner;

public class AddArray {
    static int size[] = new int[3];

    public static void main(String[] args) {
        System.out.println("Main started");
        //ArrayIndexOutOfBoundsException
        try {
            size[0] = 1;
            size[1] = 2;
            size[2] = 3;
            size[3] = 4;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Size is more than the given");
        }
        System.out.println("Main ended");

        //ClassNotFoundException;
        System.out.println("ClassNotFoundException started");
        Class<AddArray> addarray = null;

        try {
            addarray = (Class<AddArray>) Class.forName("com.xworkz.trycatch.Add");
            System.out.println("Come in to the try");
        }
        catch(ClassNotFoundException e){
            System.out.println("No class found");
        }
    }
}

