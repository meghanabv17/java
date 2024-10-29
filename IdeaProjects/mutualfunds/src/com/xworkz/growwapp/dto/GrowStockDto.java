package com.xworkz.growwapp.dto;

public class GrowStockDto {
    private int stockRefId;
    private String stockName;
    private double stockPrice;
    private String date;
    private int noOfStocks;


    public GrowStockDto(){
        System.out.println("The data transfer object invoked successfully.!");
    }

    public int getStockRefId() {
        return stockRefId;
    }

    public String getStockName() {
        return stockName;
    }

    public String getDate() {
        return date;
    }

    public int getNoOfStocks() {
        return noOfStocks;
    }

    public double getStockPrice() {
        return stockPrice;
    }
    public GrowStockDto(int stockRefId, String stockName, String date, int noOfStocks, double stockPrice)
    {
        this.stockRefId = stockRefId;
        this.stockName = stockName;
        this.date = date;
        this.stockPrice = stockPrice;
        this.noOfStocks = noOfStocks;
    }
}
