package com.xworkz.shop.beautyparlour;

import com.xworkz.shop.shop.Shop;

public abstract class BeautyParlour implements Shop {
    @Override
    public void dobusiness() {
        System.out.println("Painting works are done here");
    }
}
