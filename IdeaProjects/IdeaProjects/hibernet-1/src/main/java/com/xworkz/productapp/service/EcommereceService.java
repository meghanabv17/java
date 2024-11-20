package com.xworkz.productapp.service;

import com.xworkz.productapp.dto.ProductDto;

public interface EcommereceService {
   boolean validateAndSaveProduct(ProductDto dto);
   boolean addProducts(ProductDto productDto);
   ProductDto getProductById(int id);
   ProductDto updateNameById(int existingId, String name);
   void deleteDetailsByName(int id);
}
