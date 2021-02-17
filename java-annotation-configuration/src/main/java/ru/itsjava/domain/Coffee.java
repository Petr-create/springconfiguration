package ru.itsjava.domain;

import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@ToString
public class Coffee implements Comparable<Coffee>{
    private final String brand;
    private final String cookingMethod;
    private final double price;

    @Override
    public int compareTo(Coffee o) {
        if(brand.equals(o.brand) && cookingMethod.equals(o.cookingMethod) && price == o.price){
            return 0;
        } else {
            return -1;
        }
    }
}
