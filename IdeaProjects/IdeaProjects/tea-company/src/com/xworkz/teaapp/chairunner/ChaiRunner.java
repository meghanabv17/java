package com.xworkz.teaapp.chairunner;

import com.xworkz.teaapp.Chaiwala;

public class ChaiRunner {
    public static void main(String[] args) {
        Chaiwala chaiwala = new Chaiwala();
        chaiwala.setChaiId(1);
        chaiwala.setChaiName("Amruth tea");
        chaiwala.setPrice(10.0);
        chaiwala.setQuantity("50ml");
        System.out.println("Come have enjoy our chai company");
        System.out.println("Our chai information is: "+chaiwala);
        System.out.println("Thanks for coming");

        Chaiwala chaiwala1 = new Chaiwala();
        chaiwala1.setChaiId(2);
        chaiwala1.setChaiName("Pothis tea");
        chaiwala1.setPrice(12.0);
        chaiwala1.setQuantity("45ml");
        System.out.println("Come have enjoy our chai company");
        System.out.println("Our chai information is: "+chaiwala1);
        System.out.println("Thanks for coming");

        Chaiwala chaiwala2 = new Chaiwala();
        chaiwala2.setChaiId(3);
        chaiwala2.setChaiName("Maccha's tea");
        chaiwala2.setPrice(10.0);
        chaiwala2.setQuantity("40ml");
        System.out.println("Come have enjoy our chai company");
        System.out.println("Our chai information is: "+chaiwala2);
        System.out.println("Thanks for coming");

        Chaiwala chaiwala3 = new Chaiwala();
        chaiwala3.setChaiId(4);
        chaiwala3.setChaiName("Empty tea");
        chaiwala3.setPrice(10.0);
        chaiwala3.setQuantity("40ml");
        System.out.println("Come have enjoy our chai company");
        System.out.println("Our chai information is: "+chaiwala3);
        System.out.println("Thanks for coming");

        Chaiwala chaiwala4 = new Chaiwala();
        //passing one ref object to another ref object
        chaiwala4 = chaiwala;
        System.out.println(chaiwala4);

        //boolean isEqual = chaiwala == (chaiwala4);
        boolean isEqual = chaiwala.equals(chaiwala);
        System.out.println(isEqual);

        boolean isEqual1 = chaiwala1.equals(chaiwala3);
        System.out.println(isEqual1);
        System.out.println("The first Id is: "+ chaiwala.hashCode());
        System.out.println("The second Id is: "+chaiwala1.hashCode());
    }
}
