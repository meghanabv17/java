package com.xworkz.dmart.chocolates;

public class Chocolates {
   public int id;
   public String name;
   public int quantity;
   public double price;
   public String flavour;

   @Override
   public String toString() {
      return "Chocolates{" +
              "id=" + id +
              ", name='" + name + '\'' +
              ", quantity=" + quantity +
              ", price=" + price +
              ", flavour='" + flavour + '\'' +
              '}';
   }
}
