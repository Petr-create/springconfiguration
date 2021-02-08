package ru.itsjava.dto;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Coffee implements Comparable<Coffee>{
    private String brand;
    private String cookingMethod;
    double price;

    @Override
    public int compareTo(Coffee o) {
        if(brand.equals(o.brand) && cookingMethod.equals(o.cookingMethod) && price == o.price){
            return 0;
        } else {
            return -1;
        }
    }
}
