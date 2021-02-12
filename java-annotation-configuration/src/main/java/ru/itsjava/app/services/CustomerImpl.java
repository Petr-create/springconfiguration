package ru.itsjava.app.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itsjava.domain.Coffee;

@Service
@RequiredArgsConstructor
public class CustomerImpl implements Customer{

    private final CoffeeHouse coffeeHouse;

//    @Autowired
//    public CustomerImpl(CoffeeHouse coffeeHouse) {
//        this.coffeeHouse = coffeeHouse;
//    }

    @Override
    public void printBuy(Coffee coffee) {
        coffeeHouse.buyСoffee(coffee);
    }
}
