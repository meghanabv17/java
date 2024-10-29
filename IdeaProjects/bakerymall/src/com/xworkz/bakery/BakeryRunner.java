package com.xworkz.bakery;

import com.xworkz.bakery.dao.BakeryDao;
import com.xworkz.bakery.dto.BakeryDto;

public class BakeryRunner {

    public static void main(String[] args) {
        BakeryDto dto = new BakeryDto();
        dto.setCakeName("Cupcakes");
        dto.setChocolateName("Snikers");
        dto.setBiscuitName("Dark Fantasy");
        dto.setSweetName("Rasgulla");
        dto.setCookiesPrice(100.0);
        dto.setBakeryOwnerNumber(8521478963l);

        BakeryDao dao = new BakeryDao();
        dao.getDetails(dto);
    }
}
