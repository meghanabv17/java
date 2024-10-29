package com.xworkz.amazonapp.impl;

import com.xworkz.amazonapp.customer.Customer;
import com.xworkz.amazonapp.product.Product;

public class CustomerImpl implements Customer {
    Product product[] = new Product[1];
    int index;
    boolean isAdded = false;
    boolean isUpdated = false;

    @Override
    public boolean addProduct(Product product) {
        if(product != null){
            if(product.getProductName() != null && product.getProductId() > 0 && product.getPrice() > 0.0){
                this.product[index] = product;
                isAdded = true;
            }else
                System.out.println("Given product is not added");
        }else
            System.out.println("Product cannot be empty");
        return isAdded;
    }

    @Override
    public void getProductDetails() {
        for(Product product1 : product){
            System.out.println("The product details are : "+product1);
        }
    }

    @Override
    public boolean updatePriceById(double newPrice, int existingId) {

        for (int index = 0; index < product.length; index++) {
            if(this.product[index].getProductId() == existingId)
            {
                this.product[index].setPrice(newPrice);
                isUpdated = true;
            }else
                System.out.println("Id is not found");
        }
        return isUpdated;
    }

    @Override
    public boolean updateRatingdbyProductName(double newRatings, String existingName) {
        for (int index = 0; index < product.length; index++) {
            if(this.product[index].getProductName().equals(existingName))
            {
                this.product[index].setRatings(newRatings);
                isUpdated = true;
            }else System.out.println("Product name cannot found");
        }
        return isUpdated;
    }

    @Override
    public String getProductNamebyId(int id) {
        String name = null;
        for (int index = 0; index < product.length; index++) {
         if(this.product[index].getProductId()== id){
           name = this.product[index].getProductName();
         }else System.out.println("Id cannot found");
        }
        return name;
    }

    @Override
    public double getRatingdbyName(String name) {
        double ratings = 0.0;
        for(int index=0; index < product.length; index++){
            if(this.product[index].getProductName().equals(name)){
                ratings = this.product[index].getRatings();
            }else System.out.println("Name cannot found");
        }
        return ratings;
    }

    @Override
    public String getProductCategoryByName(String name) {
        String category = null;
        for (int index = 0; index < product.length; index++) {
            if(this.product[index].getProductName().equals(name)){
               category = this.product[index].getCategory();
            }else System.out.println("Name cannot found");
        }
        return category;
    }

    @Override
    public double getPriceByName(String name) {
        double price = 0.0;
        for (int index = 0; index < product.length; index++) {
            if(this.product[index].getProductName().equals(name)){
                price = this.product[index].getPrice();
            }else System.out.println("Name cannot found");
        }
        return price;
    }
}
