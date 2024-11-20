package com.xworkz.productapp.dto;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product_details") //mapping database table
public class ProductDto {

    @Id
    @Column(name = "product_id")
    private int productId;

    @Column(name = "product_name")
    private String Name;

    @Column(name = "product_category")
    private String productCategory;

    @Column(name = "product_price")
    private double price;

    @Column(name = "product_ratings")
    private double ratings;
}
