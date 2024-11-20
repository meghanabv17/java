package com.xworkz.asianpaintapp;

public class AsianRunner {
    public static void main(String[] args) {
        System.out.println("Visit once for dream house");
        AsianPaints asianPaints = new AsianPaints();
        asianPaints.setPaintId(1);
        asianPaints.setType("Oil paint");
        asianPaints.setColor("Purple");
        asianPaints.setPrice(2000.00);
        asianPaints.setQuantity("1 Litre");
        System.out.println("The paint information is: "+asianPaints);

        AsianPaints asianPaints1 = new AsianPaints();
        asianPaints1.setPaintId(2);
        asianPaints1.setType("Wall texture paint");
        asianPaints1.setColor("Blue");
        asianPaints1.setPrice(5000.00);
        asianPaints1.setQuantity("2 Litre");
        System.out.println("The paint information is: "+asianPaints1);

        AsianPaints asianPaints2 = new AsianPaints();
        asianPaints2.setPaintId(3);
        asianPaints2.setType("waterprof paint");
        asianPaints2.setColor("Wine red");
        asianPaints2.setPrice(3500.00);
        asianPaints2.setQuantity("1.5 Litre");
        System.out.println("The paint information is: "+asianPaints2);

        AsianPaints asianPaints3 = new AsianPaints();
        asianPaints3.setPaintId(4);
        asianPaints3.setType("wood finishing paint");
        asianPaints3.setColor("Wood color");
        asianPaints3.setPrice(20000.00);
        asianPaints3.setQuantity("10 Litre");
        System.out.println("The paint information is: "+asianPaints3);

        AsianPaints asianPaints4 = new AsianPaints();
        asianPaints4.setPaintId(5);
        asianPaints4.setType("Wallpaper paint");
        asianPaints4.setColor("Pink");
        asianPaints4.setPrice(8000.00);
        asianPaints4.setQuantity("5 Litre");
        System.out.println("The paint information is: "+asianPaints4);
        System.out.println("hanks for visiting our company");

        System.out.println("First paint Id is: "+asianPaints.hashCode());
        System.out.println("Second paint Id is: "+asianPaints1.hashCode());
        System.out.println("Third paint Id is: "+asianPaints2.hashCode());

        boolean isEqual = asianPaints.equals(asianPaints1);
        System.out.println(isEqual);
    }
}
