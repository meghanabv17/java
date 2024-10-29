package com.xworkz.bookstoreapp.chart;

public interface BookStore {

    boolean addChateNames(Charts chart);
    void getChartDetails();

    double getPricebyName(String name);
    boolean updateChart(int existingId, double newPrice);

    boolean updateNoOfPhotosbyTypes(int exixtingnoOfPhotos, String newType);
    boolean deleteChart();

    String[] getTypeWithSamePrice();
}
