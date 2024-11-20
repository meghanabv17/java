package com.xworkz.pizzaapp;

public class Pizzaapp {

    private int Id;
    private String name;
    private double price;
    private String toppings;
    private char size;

    @Override
    public int hashCode(){
        return Id;
    }

    @Override
    public boolean equals(Object obje){
        Pizzaapp pizza = (Pizzaapp) obje;
        if(this.hashCode() == obje.hashCode())
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "pizza - {pizza Id= "+this.Id+" , "+" pizza name is= "+this.name+" , " +
                "pizza prize = "+this.price+" , "+" pizza toppings = "+this.toppings+" , "+" pizza size = "+this.size+"}";
    }

    public void setId(int id) {
        Id = id;
    }

    public int getId() {
        return Id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public String getToppings() {
        return toppings;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public char getSize() {
        return size;
    }
}
