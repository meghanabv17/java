package com.xworkz.bakery.dto;

public class BakeryDto {

    private String cakeName;
    private String chocolateName;
    private String biscuitName;
    private String sweetName;
    private double cookiesPrice;
    private long bakeryOwnerNumber;

    public void setCakeName(String cakeName){
        this.cakeName = cakeName;
    }

    public String getCakeName(){
        return cakeName;
    }

    public void setChocolateName(String chocolateName) {
        this.chocolateName = chocolateName;
    }

    public String getChocolateName() {
        return chocolateName;
    }

    public void setBiscuitName(String biscuitName) {
        this.biscuitName = biscuitName;
    }

    public String getBiscuitName() {
        return biscuitName;
    }

    public void setSweetName(String sweetName) {
        this.sweetName = sweetName;
    }

    public String getSweetName() {
        return sweetName;
    }

    public void setCookiesPrice(double cookiesPrice) {
        this.cookiesPrice = cookiesPrice;
    }

    public double getCookiesPrice() {
        return cookiesPrice;
    }

    public void setBakeryOwnerNumber(long bakeryOwnerNumber) {
        this.bakeryOwnerNumber = bakeryOwnerNumber;
    }

    public long getBakeryOwnerNumber() {
        return bakeryOwnerNumber;
    }
}
