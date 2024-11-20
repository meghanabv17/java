package org.xworkz.jdbc.productdetails;

import org.xworkz.jdbc.productdetails.compare.CategoryComparator;
import org.xworkz.jdbc.productdetails.compare.PriceComparator;
import org.xworkz.jdbc.productdetails.compare.ProductNameComparator;
import org.xworkz.jdbc.productdetails.compare.RatingComparator;

import java.util.*;
import java.util.stream.Collectors;

public class ProductDtoRunner {

    public static void main(String[] args) {
        List<ProductDto> productDtos = new ArrayList<>();
        ProductDto dto = new ProductDto(1,"AC",15000.0,"Electronics",4.3);
        ProductDto dto1 = new ProductDto(2,"Sunscream",500.0,"Beauty",3.1);
        ProductDto dto2 = new ProductDto(3,"Television",25000.0,"Entertainment",1.5);
        ProductDto dto3 = new ProductDto(4,"Mobile",40000.0,"Timepass",2.8);
        ProductDto dto4 = new ProductDto(5,"Earbuds",1600.0,"Wireless",6.5);
        ProductDto dto5 = new ProductDto(6,"Watch",2000.0,"Chargable",5.5);

        productDtos.add(dto2);
        productDtos.add(dto3);
        productDtos.add(dto);
        productDtos.add(dto1);
        productDtos.add(dto4);
        productDtos.add(dto5);

//sorting a product by id;
        //productDtos.sort(Comparator.comparingInt(ProductDto::getId));

     //to fetch/retrive the data;
        //productDtos.sort(new ProductDto()); //sorting the values;
        //productDtos.sort(new ProductNameComparator());  //sorting based on name;
        //productDtos.sort(new PriceComparator());  //sorting based on price
        //productDtos.sort(new CategoryComparator()); // sorting based on category;
        productDtos.sort(new RatingComparator());  //sorting based on ratings
        for(ProductDto product : productDtos){
            System.out.println("The product details are: "+product);
        }
//sorting by using java 8;
       // System.out.println(productDtos.stream().sorted(Comparator.comparing(ProductDto :: getPrice)).collect(Collectors.toList()));
//it cannot sort 2 cases in one condition;
        System.out.println(productDtos.stream().sorted(Comparator.comparing(ProductDto::getPrice).thenComparing(ProductDto::getName)).collect(Collectors.toList()));
//By using java features
    //productDtos.forEach(System.out::println);

//By using iterator;
        /*Iterator iterator = productDtos.iterator();
        while ((iterator.hasNext())){
            System.out.println(iterator.next());
        }*/
    }
}
