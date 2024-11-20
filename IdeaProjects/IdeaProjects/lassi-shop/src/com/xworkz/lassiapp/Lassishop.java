package com.xworkz.lassiapp;

import java.util.Objects;

public class Lassishop {

    private int Id;
    private String name;
    private double price;
    private int quantity;
    private String flavour;

    @Override
    public int hashCode(){
        return Id;
    }

    @Override
    public boolean equals(Object obj){
       Lassishop lassi = (Lassishop) obj;
       if(this.hashCode() == obj.hashCode())
           return true;
       return false;
    }

    @Override
    public String toString() {
        return "Lassi info- [Lassi Id = "+this.Id+" , "+" lassi name = "+this.name+" , " +
                "lassi price is = "+this.price+" , "+" lassi quantity is= "+this.quantity+" , " +
                "lassi flavour is= "+this.flavour+"]";
    }

    public void setId(int id) {
        Id = id;
    }

    public int getId() {
        return Id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public String getFlavour() {
        return flavour;
    }
}
