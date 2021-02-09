package ru.itsjava.app.services;

import ru.itsjava.dto.Coffee;

import java.util.Arrays;
import java.util.List;

public class CoffeeHouseImpl implements ICoffeeHouse{
    private List<Coffee> coffees;
    public CoffeeHouseImpl(){
        this.coffees = Arrays.asList(
            new Coffee("Lavazza", "espresso", 45.00),
            new Coffee("Lavazza", "cappuchino", 50.10),
            new Coffee("Lavazza", "americano", 60.25),
            new Coffee("Illy", "espresso", 45.50),
            new Coffee("Illy", "capuchino", 45.50),
            new Coffee("Illy", "americano", 45.50),
            new Coffee("Pauling", "espresso", 20.50),
            new Coffee("Pauling", "capuchino", 40.30),
            new Coffee("Pauling", "americano", 10.90)
        );
    }
    @Override
    public void buycoffee(Coffee coffee) {
        for(Coffee c : coffees){
            int number = c.compareTo(coffee);
            if(number == 0){
                System.out.println("Получите ваше кофе: " + c.toString());
                return;
            }
        }
        System.out.println("Такого кофе у нас нет в ассортименте");
    }
}
