//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.xworkz.growwapp.dao;

import com.xworkz.growwapp.dto.GrowStockDto;

public class GrowStockDao {

    GrowStockDto dto;

    public GrowStockDao() {

        System.out.println("GrowStock invoked successfully.");
    }

    public boolean addGrowStock(GrowStockDto dto) {
        boolean isGrowStockAdded = false;
        boolean isStockName = false;
        boolean isStockRefId = false;
        boolean isStockPrice = false;
        boolean isNoOfStock = false;
        boolean isDate = false;
        if (dto != null)
        {
            if (dto.getStockName() != null) {
                isStockName = true;
            } else {
                System.out.println("Please enter your valid stock name.");
            }

            if (dto.getStockRefId() > 0) {
                isStockRefId = true;
            } else {
                System.out.println("Please enter your valid stock ref id.");
            }

            if (dto.getStockPrice() > 0.0) {
                isStockPrice = true;
            } else {
                System.out.println("Please enter your valid stock price.");
            }

            if (dto.getNoOfStocks() > 0) {
                isNoOfStock = true;
            } else {
                System.out.println("Please enter your valid no of stock.");
            }

            if (dto.getDate() != null) {
                isDate = true;
            } else {
                System.out.println("Please enter your valid stock date");
            }
        } else {
            System.out.println("Please provide valid information.");
        }

        if (isStockName == true && isStockRefId == true) {
            this.dto = dto;
            isGrowStockAdded = true;
        }

        return isGrowStockAdded;
    }

    public void getGrowStockDetails() {
        System.out.println("Stock refId is " + this.dto.getStockRefId());
        System.out.println("Stock Name is " + this.dto.getStockName());
        System.out.println("Stock price is " + this.dto.getStockPrice());
        System.out.println("Stock noOfStock is " + this.dto.getNoOfStocks());
        System.out.println("Stock Date is " + this.dto.getDate());
    }
}
