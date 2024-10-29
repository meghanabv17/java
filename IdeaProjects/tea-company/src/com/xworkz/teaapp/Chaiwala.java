package com.xworkz.teaapp;

public class Chaiwala{
    private int chaiId;
    private String chaiName;
    private double price;
    private String quantity;

    @Override
    public int hashCode(){
        return chaiId;
    }
    @Override
    public boolean equals(Object obj){
        //down casting(explicit type casting)
        Chaiwala chaiwala = (Chaiwala)obj;
        if(this.hashCode() == chaiwala.hashCode()){
            return true;
        }return false;
    }

    /* used when it is not satisfied with the parent class ie object, so it calls a method called
        toString inside the object class because it is in the form of toString method toString
        is used only where the data are available;*/
    //it's a runtime polymorphism
    @Override
    public String toString() {
        // return super.toString();
        return "ChaiPoint- {chai Id = " + this.getChaiId() + " , " +
                "chai name = " + this.chaiName + " , " +
                "chai price is only just = " + this.price + " , " +
                "your special chai quantity is = " + this.quantity + "}";
    }

    public void setChaiId(int chaiId) {
        this.chaiId = chaiId;
    }

    public int getChaiId() {
        return chaiId;
    }

    public void setChaiName(String chaiName) {
        this.chaiName = chaiName;
    }

    public String getChaiName() {
        return chaiName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getQuantity() {
        return quantity;
    }

}
