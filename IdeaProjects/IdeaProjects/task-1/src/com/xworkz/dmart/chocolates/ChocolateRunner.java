package com.xworkz.dmart.chocolates;

import com.xworkz.dmart.dmart.Dmart;

import java.util.Scanner;

public class ChocolateRunner {
    public static void main(String[] args) {

        Dmart mart = new ChocolatesImpl();
        Scanner scanner =  new Scanner(System.in);
        for (int index = 0; index < 1; index++) {

            Chocolates refer = new Chocolates();

            System.out.println("Enter the Id");
            int id = scanner.nextInt();
            System.out.println("The Id is: "+id);

            System.out.println("Enter the name of the chocolate");
            String name = scanner.next();
            System.out.println("The chocolate name is: "+name);

            System.out.println("Enter the Quantity");
            int quantity = scanner.nextInt();
            System.out.println("The quantity of chocolate is: "+quantity);

            System.out.println("Enter the price of the chocolate");
            double price = scanner.nextDouble();
            System.out.println("The price of the chocolate is: "+price);

            System.out.println("Enter the flavour of the chocolate");
            String flavour = scanner.next();
            System.out.println("The flovour of the chocolate is: "+flavour);

            mart.addChocolates(refer);
        }
        mart.getAllCocolates();
        mart.UpdateChocolatNameById("Dairy Milk",1);
        mart.getAllCocolates();
        mart.deleteChocolateName();
    }
}
