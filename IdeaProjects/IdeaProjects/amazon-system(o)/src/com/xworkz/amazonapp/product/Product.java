package com.xworkz.amazonapp.product;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString

public class Product {
    private int productId;
    private String productName;
    private double ratings;
    private String category;
    private double price;
}
