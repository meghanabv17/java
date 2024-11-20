package com.xworkz.amazonapp;

import com.xworkz.amazonapp.customer.Customer;
import com.xworkz.amazonapp.impl.CustomerImpl;
import com.xworkz.amazonapp.product.Product;

import java.util.Scanner;

public class Customerrunner {
    public static void main(String[] args) {
        Customer customer = new CustomerImpl();
        Scanner scanner = new Scanner(System.in);

        for (int index = 0; index < 1; index++) {

            Product product = new Product();

            System.out.println("Enter a product Id");
            int id = scanner.nextInt();
            product.setProductId(id);

            System.out.println("Enter product name");
            String name = scanner.next();
            product.setProductName(name);

            System.out.println("Enter the ratings of the product");
            double ratings = scanner.nextDouble();
            product.setRatings(ratings);

            System.out.println("Enter the category");
            String category = scanner.next();
            product.setCategory(category);

            System.out.println("Enter the price of the product");
            double price = scanner.nextDouble();
            product.setPrice(price);

            customer.addProduct(product);
        }

        customer.getProductDetails();

        //update Price By Id
        System.out.println("Enter the Id which you want to update the price");
        int existingId = scanner.nextInt();

        System.out.println("Enter the new price");
        double newPrice = scanner.nextDouble();
        customer.updatePriceById(newPrice , existingId);
        customer.getProductDetails();

        //update Ratings by ProductName
        System.out.println("Enter the product name which you want to update the ratings");
        String existingName = scanner.next();

        System.out.println("Enter the new ratings of the product");
        double newRatings = scanner.nextDouble();
        customer.updateRatingdbyProductName(newRatings, existingName);
        customer.getProductDetails();

        //get Product Name by Id
        System.out.println("Enter a Id Which you wants the name");
        int id = scanner.nextInt();
        String name = customer.getProductNamebyId(id);
        System.out.println("The name of the given Id is: "+name);

        //get Ratings1 by Name
        System.out.println("Enter the name which you want the ratings");
        name = scanner.next();
        double ratings = customer.getRatingsByName(name);
        System.out.println("The ratings of the given product is: "+ratings);

        //get Product Category By Name
        System.out.println("Enter a name which you want a category");
        name = scanner.next();
        String category = customer.getProductCategoryByName(name);
        System.out.println("The category of the given product is: "+category);

        //get Price By Name
        System.out.println("Enter a name to get a price");
        name = scanner.next();
        double price = customer.getPriceByName(name);
        System.out.println("The price of the given product is: "+price);
    }

}
