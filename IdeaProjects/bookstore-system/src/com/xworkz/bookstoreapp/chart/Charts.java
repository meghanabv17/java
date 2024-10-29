package com.xworkz.bookstoreapp.chart;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Charts {

    private int chartId;
    private String chartName;
    private String chartType;
    private String color;
    private int noOfPhotos;
    private double price;
}
