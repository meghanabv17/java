package com.xworkz.bottledetails;

public class Bottle {
    String name;
    String quantity;
    int id;
    String company;
    public Bottle(String name, String quantity, int id, String company)
    {
        if(name != null && quantity != null && id > 0)
        {
            this.name = name;
            this.quantity = quantity;
            this.id = id;
            this.company = company;
        }
    }
    public void patientinfo()
    {
        System.out.println("--------------------------------------------------------------------");
        System.out.println("The Bottle name is: "+this.name);
        System.out.println("The Bottle quantity is: "+this.quantity);
        System.out.println("The id is: "+this.id);
        System.out.println("The company of the bottle is: "+this.company);
    }
}
