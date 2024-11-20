package org.xworkz.jdbc.productdetails.compare;

import org.xworkz.jdbc.productdetails.ProductDto;

import java.util.Comparator;

public class CategoryComparator implements Comparator<ProductDto> {
    @Override
    public int compare(ProductDto o1, ProductDto o2) {
        return o1.getCategory().compareTo(o2.getCategory());
    }
}
