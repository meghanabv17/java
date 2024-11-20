package com.xworkz.amazonapp.customer;

import com.xworkz.amazonapp.product.Product;

public interface Customer {

    boolean addProduct(Product product);

    void getProductDetails();

    boolean updatePriceById(double newPrice, int existingId);

    boolean updateRatingdbyProductName(double newRatings, String existingName);

    String getProductNamebyId(int id);

    double getRatingsByName(String name);

    String getProductCategoryByName(String name);

    double getPriceByName(String name);

    // boolean deleteProductDetails();
}
