package com.xworkz.shop.medicalstore;

import com.xworkz.shop.shop.Shop;

public class MedicalStore implements Shop {
    @Override
    public void dobusiness() {
        System.out.println("Come and be healthy");
    }

    @Override
    public void charity() {

    }
}
