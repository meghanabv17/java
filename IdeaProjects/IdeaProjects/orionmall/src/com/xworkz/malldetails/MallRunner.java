package com.xworkz.malldetails;

public class MallRunner {
    public static void main(String[] args) {


        MallDetails mall = new MallDetails();
        mall.Weekend();
        //polymorphism
        MallDetails shopping = new ShoppingCenter();
        shopping.Weekend();
        FoodShop food = new FoodShop();
        food.Weekend();
    }
}
