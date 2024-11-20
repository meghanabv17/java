package com.xworkz.bookstoreapp.impl;

import com.xworkz.bookstoreapp.chart.BookStore;
import com.xworkz.bookstoreapp.chart.Charts;

public class ChartImpl implements BookStore {
    Charts charts[] = new Charts[1];
    int index;

    @Override
    public boolean addChateNames(Charts charts) {
        boolean isAdded = false;
        if(charts != null){
                this.charts[index++] = charts;
                isAdded = true;
        }
        return isAdded;
    }

    @Override
    public void getChartDetails() {
        for(Charts chart : charts) {
            System.out.println("The charts details are: " + chart);
        }
    }

    @Override
    //getting a price by name;
    public double getPricebyName(String name) {
        double chartPrice = 0.0;
        for (int index = 0; index < charts.length; index++) {
            if(this.charts[index].getChartName() == name){
                if(name != null)
                this.charts[index].getPrice();
            }
        }
        return chartPrice;
    }

    @Override
    //update chart price by Id operation  ==> 1;
    public boolean updateChart(int existingId, double newPrice) {
        boolean isUpdated = false;
        for (int index = 0; index < charts.length; index++) {
            if(this.charts[index].getChartId() == existingId)
            {
                this.charts[index].setPrice(newPrice);
                isUpdated = true;
            }

        }
        return isUpdated;
    }
//update operation ==> 2;
    @Override
    public boolean updateNoOfPhotosbyTypes(int exixtingnoOfPhotos, String newType) {
        boolean isTypeUpdated = false;
        for (int index = 0; index < charts.length; index++) {
            if(this.charts[index].getNoOfPhotos() == exixtingnoOfPhotos)
            {
                this.charts[index].setChartType(newType);
                isTypeUpdated = true;
            }
            if(isTypeUpdated == false){
                System.out.println("Provided number of photos are not available");
            }
        }
        return false;
    }

    @Override
    public boolean deleteChart() {
        return false;
    }

    //get type by same price;
    @Override
    public String[] getTypeWithSamePrice() {
        int price = 0;
        for (int index = 0; index < charts.length; index++) {
            if(price == price){

            }
        }

        return new String[price];
    }
}
