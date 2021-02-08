package ru.itsjava.app.services;

import ru.itsjava.dto.Coffee;

import java.util.ArrayList;
import java.util.List;

public class CoffeeHouseImpl implements ICoffeeHouse{
    @Override
    public void buycoffee(Coffee coffee) {
        List<Coffee> coffeeList = new ArrayList<>();
        coffeeList.add(new Coffee("Lavazza", "espresso", 45.00));
        coffeeList.add(new Coffee("Lavazza", "cappuchino", 50.10));
        coffeeList.add(new Coffee("Lavazza", "americano", 60.25));
        coffeeList.add(new Coffee("Illy", "espresso", 45.50));
        coffeeList.add(new Coffee("Illy", "capuchino", 45.50));
        coffeeList.add(new Coffee("Illy", "americano", 45.50));
        coffeeList.add(new Coffee("Pauling", "espresso", 20.50));
        coffeeList.add(new Coffee("Pauling", "capuchino", 40.30));
        coffeeList.add(new Coffee("Pauling", "americano", 10.90));

        for(Coffee c : coffeeList){
            int number = c.compareTo(coffee);
            if(number == 0){
                System.out.println("Получите ваше кофе: " + c.toString());
                return;
            }
        }
        System.out.println("Такого кофе у нас нет в ассортименте");
    }
}
