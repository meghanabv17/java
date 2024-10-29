package com.xworkz.asianpaintapp;

public class AsianPaints {

    private int paintId;
    private String type;
    private String color;
    private double price;
    private String quantity;

    public void setPaintId(int paintId) {
        this.paintId = paintId;
    }
    public int getPaintId(){
        return paintId;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
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

    @Override
    public String toString(){
        return "AsianPaint - (Paint Id= "+this.paintId+" ," +
                 "paint type= "+this.type+" , "+
                "paint color = "+this.color+ ","+
                "paint price is= "+this.price+ " , "+ "paint quantity is= "+this.quantity+")";
    }
    @Override
    public int hashCode(){
        return paintId;
    }
    @Override
    public boolean equals(Object obj){
        AsianPaints paint = (AsianPaints) obj;
        if(this.paintId == ((AsianPaints) obj).paintId)
            return true;
        return false;
    }
}
