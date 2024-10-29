package com.xworkz.growwapp;

import com.xworkz.growwapp.dao.GrowStockDao;
import com.xworkz.growwapp.dto.GrowStockDto;

public class GrowStocksRunner {



    public static void main(String[] args) {

        GrowStockDao growwStockDao = new GrowStockDao();
        GrowStockDto growwStockDto = new GrowStockDto(789, "Tata", "30-07-24", 5, 450.0);
        growwStockDao.addGrowStock(growwStockDto);
        growwStockDao.getGrowStockDetails();
    }
}
