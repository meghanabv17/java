package com.xworkz.bookstoreapp;

import com.xworkz.bookstoreapp.chart.BookStore;
import com.xworkz.bookstoreapp.chart.Charts;
import com.xworkz.bookstoreapp.impl.ChartImpl;

import java.util.Scanner;

public class StoreRunner {

    public static void main(String[] args) {
        BookStore store = new ChartImpl();

        Scanner scanner = new Scanner(System.in);

        for (int index = 0; index < 1; index++) {
            Charts charts = new Charts();

            System.out.println("Enter a chart Id");
            int chartId = scanner.nextInt();
            charts.setChartId(chartId);

            System.out.println("Enter the chart name");
            String chatName = scanner.next();
            charts.setChartName(chatName);

            System.out.println("Enter a chart type");
            String chartType = scanner.next();
            charts.setChartType(chartType);

            System.out.println("Enter chart color");
            String chartColor = scanner.next();
            charts.setColor(chartColor);

            System.out.println("Enter the number of photos");
            int noOfPhotos = scanner.nextInt();
            charts.setNoOfPhotos(noOfPhotos);

            System.out.println("Enter a chart price");
            double chartPrice = scanner.nextDouble();
            charts.setPrice(chartPrice);
            store.addChateNames(charts);
        }

            store.getChartDetails();

        //update operation;
        Charts charts = new Charts();
        System.out.println("Enter a id you want to change the price");
        int id = scanner.nextInt();

        System.out.println("Enter a new price");
        double newprice = scanner.nextDouble();
        charts.setPrice(newprice);
        store.updateChart(id, newprice);
        store.getChartDetails();

        System.out.println("Enter the number of photos available");
        int noOfPhotos = scanner.nextInt();

        System.out.println("Enter a new type");
        String newType = scanner.next();
        charts.setChartType(newType);
        store.updateNoOfPhotosbyTypes(noOfPhotos,newType);
        store.getChartDetails();

        //get price by name
        System.out.println("enter the name that you wants a price");
        String name = scanner.next();

        System.out.println("The price is: "+charts.getPrice());
        store.getPricebyName(name);

        //store.getChartDetails();

    }
}
