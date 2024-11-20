package org.xworkz.jdbc.productdetails;

import lombok.*;

import java.util.Comparator;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class ProductDto implements Comparator<ProductDto> {

    private int id;
    private String name;
    private double price;
    private String category;
    private double ratings;

    @Override
    public int compare(ProductDto o1, ProductDto o2) {
        System.out.println(o1.id +" "+o2.id);
        return o1.id - o2.id;
    }
}
