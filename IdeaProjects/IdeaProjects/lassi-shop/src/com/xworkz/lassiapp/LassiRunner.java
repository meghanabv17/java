package com.xworkz.lassiapp;

public class LassiRunner {
    public static void main(String[] args) {
        System.out.println("Here the lassi point.....!");
        Lassishop lassi = new Lassishop();
        lassi.setId(1);
        lassi.setName("Sweet lassi");
        lassi.setPrice(15.00);
        lassi.setQuantity(2);
        lassi.setFlavour("Sweet");
        System.out.println("The lassi information: "+lassi);

        Lassishop lassi1 = new Lassishop();
        lassi1.setId(2);
        lassi1.setName("Salted lassi");
        lassi1.setPrice(10.00);
        lassi1.setQuantity(5);
        lassi1.setFlavour("Salt");
        System.out.println("The lassi information: "+lassi1);

        Lassishop lassi2 = new Lassishop();
        lassi2.setId(3);
        lassi2.setName("Masala lassi");
        lassi2.setPrice(25.00);
        lassi2.setQuantity(2);
        lassi2.setFlavour("Masala");
        System.out.println("The lassi information: "+lassi2);

        Lassishop lassi3 = new Lassishop();
        lassi3.setId(4);
        lassi3.setName("Kesar lassi");
        lassi3.setPrice(50.00);
        lassi3.setQuantity(6);
        lassi3.setFlavour("Kesari");
        System.out.println("The lassi information: "+lassi3);

        Lassishop lassi4 = new Lassishop();
        lassi4.setId(5);
        lassi4.setName("Chaas lassi");
        lassi4.setPrice(35.00);
        lassi4.setQuantity(3);
        lassi4.setFlavour("Spicy");
        System.out.println("The lassi information: "+lassi4);

        Lassishop lassi5 = new Lassishop();
        lassi5.setId(6);
        lassi5.setName("Chocolate lassi");
        lassi5.setPrice(55.00);
        lassi5.setQuantity(10);
        lassi5.setFlavour("Chocolate");
        System.out.println("The lassi information: "+lassi5);

        Lassishop lassi6 = new Lassishop();
        lassi6.setId(7);
        lassi6.setName("Mango lassi");
        lassi6.setPrice(30.00);
        lassi6.setQuantity(6);
        lassi6.setFlavour("Mango");
        System.out.println("The lassi information: "+lassi6);

        Lassishop lassi7 = new Lassishop();
        lassi7.setId(8);
        lassi7.setName("Strawberry lassi");
        lassi7.setPrice(40.00);
        lassi7.setQuantity(1);
        lassi7.setFlavour("Strawberry");
        System.out.println("The lassi information: "+lassi7);

        Lassishop lassi8 = new Lassishop();
        lassi8.setId(9);
        lassi8.setName("Banana lassi");
        lassi8.setPrice(35.00);
        lassi8.setQuantity(3);
        lassi8.setFlavour("Spicy");
        System.out.println("The lassi information: "+lassi8);

        Lassishop lassi9 = new Lassishop();
        lassi9.setId(10);
        lassi9.setName("Rose lassi");
        lassi9.setPrice(70.00);
        lassi9.setQuantity(12);
        lassi9.setFlavour("Rose");
        System.out.println("The lassi information: "+lassi9);
        System.out.println("Thanks for coming");

        boolean isEqual = lassi.equals(lassi1);
        System.out.println(isEqual);

        System.out.println("First Id is: "+lassi.hashCode());
        System.out.println("Second Id is: "+lassi5.hashCode());
    }
}
