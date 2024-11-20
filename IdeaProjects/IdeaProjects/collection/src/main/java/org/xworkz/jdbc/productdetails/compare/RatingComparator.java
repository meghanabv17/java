package org.xworkz.jdbc.productdetails.compare;

import org.xworkz.jdbc.productdetails.ProductDto;

import java.util.Comparator;

public class RatingComparator implements Comparator<ProductDto> {

    @Override
    public int compare(ProductDto o1, ProductDto o2) {
        return (int)(o1.getRatings() - o2.getRatings());
    }
}
