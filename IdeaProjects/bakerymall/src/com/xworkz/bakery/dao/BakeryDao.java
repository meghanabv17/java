package com.xworkz.bakery.dao;

import com.xworkz.bakery.dto.BakeryDto;

public class BakeryDao {

    public void getDetails(BakeryDto ref){
        System.out.println("The cake name is: "+ref.getCakeName());
        System.out.println("The chocolate name is: "+ref.getChocolateName());
        System.out.println("The biscuit name is: "+ref.getBiscuitName());
        System.out.println("The sweet name is: "+ref.getSweetName());
        System.out.println("The cookies price is: "+ref.getCookiesPrice());
        System.out.println("The owner number is: "+ref.getBakeryOwnerNumber());
    }
}
