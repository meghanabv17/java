package org.xworkz.jdbc.dto;

import lombok.*;

@Setter
@Getter
@ToString


public class NewspaperDto {
    private int id;
    private String papername;
    private int noOfPages;
    private String language;
    private double price;
    private String editorName;
    private String date;
    private int noOfArticles;

    public NewspaperDto(int id, String papername, int noOfPages, String language, double price, String editorName,
                        String date, int noOfArticles) {
             this.id=id;
             this.papername = papername;
             this.noOfPages=noOfPages;
             this.language=language;
             this.price=price;
             this.editorName=editorName;
             this.date=date;
             this.noOfArticles=noOfArticles;
    }
}