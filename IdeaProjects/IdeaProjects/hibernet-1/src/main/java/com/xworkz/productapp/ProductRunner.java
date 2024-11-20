package com.xworkz.productapp;

import com.xworkz.productapp.dao.EcommerceDao;
import com.xworkz.productapp.dao.EcommerceDaoImpl;
import com.xworkz.productapp.dto.ProductDto;
import com.xworkz.productapp.service.EcommereceService;
import com.xworkz.productapp.service.EcommereceServiceImpl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class ProductRunner {
    public static void main(String[] args) {

        ProductDto productDto = new ProductDto();
        EcommerceDao ecommerceDao = new EcommerceDaoImpl();



       /* productDto = new ProductDto(55,"Bangle","Stylish",250.0,4.3);
        ecommerceDao.addProducts(productDto);*/

//get a details by id;
        /*EcommereceService ecommereceService = new EcommereceServiceImpl();
        //ecommereceService.validateAndSaveProduct(productDto);
        ProductDto dto = ecommereceService.getProductById(1);
        System.out.println(dto);

//update value by id;
        ProductDto update = ecommereceService.updateNameById(6,"Washing Machine");
        System.out.println(update);
        System.out.println("Value updated");*/


//delete value by name;
ecommerceDao.deleteDetailsByName(1);
    }
}
