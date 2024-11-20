package org.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ClothBrands {
    public static void main(String[] args) {
        Collection<String> clotheBrands = new ArrayList();
        Collection clothBrands1 = new ArrayList();

        clotheBrands.add("Zudio");
        clotheBrands.add("Zara");
        clotheBrands.add("H&M");
        clotheBrands.add("adidas");
        clotheBrands.add("George");
        clotheBrands.add("M&S");
        clothBrands1.add("Calvin Klein");
        clothBrands1.add("DOCKERS");
        clothBrands1.add("TESCO");
        clothBrands1.add("DECATHLON");
        clotheBrands.addAll(clothBrands1);

        System.out.println("The cloth brands are: "+clotheBrands);
        System.out.println(clotheBrands.contains("adidas"));
        System.out.println(clotheBrands.containsAll(clothBrands1));
        System.out.println(clotheBrands.retainAll(clothBrands1));
        System.out.println("The size is: "+clotheBrands.size());
        clothBrands1.clear();
        System.out.println("The brands are: "+clothBrands1);
        System.out.println(clothBrands1.remove("TESCO"));
        System.out.println(clotheBrands.removeAll(clotheBrands));
        System.out.println(clotheBrands);

        List clothBrands2 = new ArrayList();
        List clothBrands3 = new ArrayList();
        clothBrands2.add("FENDI");
        clothBrands2.add("Dior");
        clothBrands2.add(0,"ecco");
        clothBrands2.add(1,"LVMH");
        clothBrands3.add("CHANEL");
        clothBrands3.add("GUCCI");
        clothBrands2.addAll(0,clothBrands3);
        System.out.println(clothBrands2);
    }
}
