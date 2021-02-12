package ru.itsjava.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.itsjava.app.services.CoffeeHouse;
import ru.itsjava.app.services.CoffeeHouseImpl;
import ru.itsjava.app.services.Customer;
import ru.itsjava.app.services.CustomerImpl;

@Configuration
public class AppConfig {
    @Bean
    public CoffeeHouse coffeeHouse(){
        return new CoffeeHouseImpl();
    }

    @Bean
    public Customer customer(CoffeeHouse coffeeHouse){
        return new CustomerImpl(coffeeHouse);
    }
}
