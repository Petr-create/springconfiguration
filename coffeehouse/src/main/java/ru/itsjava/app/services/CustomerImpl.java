package ru.itsjava.app.services;

import lombok.RequiredArgsConstructor;
import ru.itsjava.dto.Coffee;

@RequiredArgsConstructor
public class CustomerImpl implements ICustomer{
    private final ICoffeeHouse iCoffeeHouse;

    @Override
    public void printBuy(Coffee coffee) {
        iCoffeeHouse.buycoffee(coffee);
    }
}
