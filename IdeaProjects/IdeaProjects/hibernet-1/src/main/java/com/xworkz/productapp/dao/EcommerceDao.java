package com.xworkz.productapp.dao;

import com.xworkz.productapp.dto.ProductDto;

public interface EcommerceDao {

    void addProducts(ProductDto productDto);
    ProductDto getProducyById(int id);
    ProductDto updateNameById(int existingId, String name);
    void deleteDetailsByName(int id);

}
