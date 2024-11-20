package com.xworkz.amazonapp.impl;

import com.xworkz.amazonapp.customer.Customer;
import com.xworkz.amazonapp.product.Product;

public class CustomerImpl implements Customer {
    Product  product [] = new Product[1];
    int index;
    boolean isadded = false;
    boolean isUpdated =  false;

    @Override
    public boolean addProducts(Product product) {
        if (product != null) {
            if (product.getName() != null && product.getPrice() > 0 && product.getRatings() > 0.0) {
                this.product[index++] = product;
                isadded = true;
            }
        }
        return isadded;
    }

  @Override
   public void getAllProducts() {
       for (Product product : product)
            System.out.println("product details: " + product);
    }

    @Override
    public String getProductNameByCategory(String category) {
        System.out.println("getProductNameByCategory started");
        String name = null;
        for (int index = 0; index < product.length; index++) {

                if (this.product[index].getCategory().equals(category)) {
                    name = this.product[index].getName();
                }else System.out.println("Enetered category is not found");
        }
        System.out.println("getProductNameByCategory ended");
                    return name;

    }

    @Override
    public double getProductRatingsByName(String name) {
        System.out.println("getProductRatingsByName started");
        double ratings = 0.0;
        for (int index = 0; index < product.length; index++) {
            if (this.product[index].getName().equalsIgnoreCase(name)) {
                ratings = this.product[index].getRatings();
            }else System.out.println("Enetered name is not found");
            System.out.println("getProductRatingsByName ended");
        }
        return ratings;
    }

    @Override
    public double getPriceById(int id) {
        System.out.println("getPriceById started");
        double price = 0.0;
        for (int index = 0; index < product.length; index++) {
            if(this.product[index].getId() == id)
                price = this.product[index].getPrice();
            else System.out.println("Entered Id is not available");
            System.out.println("getPriceById ended");
        }
        return price;
    }

    @Override
    public String getBrandbyName(String name) {
        String brand = null;
        System.out.println("getBrandbyName started");
        for (int index = 0; index < product.length; index++) {
            if (this.product[index].getName().equalsIgnoreCase(name))
               brand = this.product[index].getBrand();
            else System.out.println("Given name is not found");
            System.out.println("getBrandbyName ended");
        }
        return brand;
    }

    @Override
    public String getProductByRatings(double ratings) {
        String products = null;
        System.out.println("getProductByRatings started");
        for (int index = 0; index < product.length; index++) {
            if(this.product[index].getRatings() == ratings)
                products = this.product[index].getName();
            else System.out.println("Given ratings is not available");
            System.out.println("getProductByRatings ended");
        }
        return products;
    }

    @Override
    public String getProductById(int id) {
        String name = null;
        System.out.println("getProductById started");
        for (int index = 0; index < product.length; index++) {
            if(this.product[index].getId() == id)
                name = this.product[index].getName();
            else System.out.println("Given id not found");
            System.out.println("getProductById ended");
        }
        return name;
    }

    @Override
    public String getproductByCategory(String category) {
        String name = null;
        System.out.println("getproductByCategory started");
        for (int index = 0; index < product.length; index++) {
            if(this.product[index].getCategory().equalsIgnoreCase(category))
                name = this.product[index].getName();
            else System.out.println("Given category is not found");
            System.out.println("getproductByCategory ended");
        }
        return name;
    }

    @Override
    public boolean updateRatingsByName(double updatedRatings, String name) {
        System.out.println("updatedRatings started");
        for (int index = 0; index < product.length; index++) {
            if(this.product[index].getName().equalsIgnoreCase(name)) {
                this.product[index].setRatings(updatedRatings);
                isUpdated = true;
            }else System.out.println("Given name is not found");
            System.out.println("updatedRatings ended");
        }
        return isUpdated;
    }

    @Override
    public boolean updateNameByBrands(String updatedName, String brand) {
        System.out.println("updateNameByBrands started");
        for (int index = 0; index < product.length; index++) {
            if(this.product[index].getBrand().equalsIgnoreCase(brand)){
                this.product[index].setName(updatedName);
                isUpdated = true;
            }else System.out.println("Given brand is not found");
            System.out.println("updateNameByBrands ended");
        }
        return isUpdated;
    }

    @Override
    public boolean updatePriceByName(double price, String name) {
        System.out.println("updatePriceByName started");
        for (int index = 0; index < product.length; index++) {
            if(this.product[index].getName().equalsIgnoreCase(name)){
                this.product[index].setPrice(price);
                isUpdated = true;
            }else System.out.println("Given name is not found");
            System.out.println("updatePriceByName ended");
        }
        return isUpdated;
    }

    @Override
    public boolean updateNameById(String name, int id) {
        System.out.println("updateNameById started");
        for (int index = 0; index < product.length; index++) {
            if(this.product[index].getId() == id){
                this.product[index].setName(name);
                isUpdated = true;
            }else System.out.println("Given id is not found");
            System.out.println("updateNameById ended");
        }
        return isUpdated;
    }
}

