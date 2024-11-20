package com.xworkz.food.order;

public class Food {

    public String foodName;
    public String price;
    public boolean isAvailable;
    public int quantity;

    public void getDetails(){

        System.out.println("The food name is: "+this.foodName);
        System.out.println("The price of the price is: "+this.price);
        System.out.println("The food is available: "+this.isAvailable);
        System.out.println("The number os food we need is: "+this.quantity);
    }
}
