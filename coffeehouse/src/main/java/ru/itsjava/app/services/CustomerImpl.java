package ru.itsjava.app.services;

import lombok.RequiredArgsConstructor;
import ru.itsjava.domain.Coffee;

@RequiredArgsConstructor
public class CustomerImpl implements Customer {
    private final CoffeeHouse coffeeHouse;

    @Override
    public void printBuy(Coffee coffee) {
        coffeeHouse.buyСoffee(coffee);
    }
}
