package com.xworkz.shop;

import com.xworkz.shop.beautyparlour.BeautyParlour;
import com.xworkz.shop.beautyparlour.MayuriParlour;
import com.xworkz.shop.medicalstore.MedicalStore;
import com.xworkz.shop.shop.Shop;

public class ShopRunner {
    public static void main(String[] args) {
        Shop shop = new MayuriParlour();
        shop.dobusiness();
        shop.charity();

        Shop shop1 = new MedicalStore();
        shop1.dobusiness();
    }
}
