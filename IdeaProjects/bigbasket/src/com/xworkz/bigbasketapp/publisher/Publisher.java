package com.xworkz.bigbasketapp.publisher;

public class Publisher {

    public String name;
    public String address;
    public long phoneNo;
    public int url;

    public Publisher(String name, String address, long phoneNo, int url)
    {
        if(name != null && address != null && phoneNo > 0 && url > 0)
        {
            this.name = name;
            this.address = address;
            this.phoneNo = phoneNo;
            this.url = url;
        }
        else System.out.println("Please provide a valid ingormation");
    }
    public void getPublisherDetails()
    {
        System.out.println("Publisher details started");
        System.out.println("The name of the publisher is: "+this.name);
        System.out.println("The address is: "+this.address);
        System.out.println("The phone number is: "+this.phoneNo);
        System.out.println("The url is: "+this.url);
        System.out.println("Publisher details ended");
        System.out.println("-----------------------------------------------------------");
    }
}
