package com.xworkz.bigbasketapp.author;

import com.xworkz.bigbasketapp.publisher.Publisher;

public class Author {

    public String name;
    public String address;
    public String url;
    public Publisher publisher;

    public Author(String name, String address, String url, Publisher publisher)
    {
        if(name != null && address != null && url != null)
        {
            this.name = name;
            this.address = address;
            this.url = url;
            this.publisher = publisher;
        }
        else System.out.println("Provide valid information.....!!");
    }
    public void getAuthorDetails()
    {
        System.out.println("Author details started");
        System.out.println("Name of the Author is: "+this.name);
        System.out.println("Address of the author is: "+this.address);
        System.out.println("Url is: "+this.url);
        System.out.println("Author details ended");
        System.out.println("-------------------------------------------------------");
        this.publisher.getPublisherDetails();
    }
}
