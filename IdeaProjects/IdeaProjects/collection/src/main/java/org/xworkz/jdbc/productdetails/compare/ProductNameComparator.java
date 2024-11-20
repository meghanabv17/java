package org.xworkz.jdbc.productdetails.compare;

import org.xworkz.jdbc.productdetails.ProductDto;

import java.util.Comparator;

public class ProductNameComparator implements Comparator<ProductDto> {
    @Override
    public int compare(ProductDto o1, ProductDto o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
