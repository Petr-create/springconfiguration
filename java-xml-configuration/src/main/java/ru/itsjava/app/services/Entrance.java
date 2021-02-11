package ru.itsjava.app.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.itsjava.domain.Coffee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Entrance {
    public static void pointOfEntry() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String brand = reader.readLine();
        String cookingMethod = reader.readLine();
        double price = Double.parseDouble(reader.readLine());

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("app-config.xml");
        applicationContext.getBean(Customer.class).printBuy(new Coffee(brand, cookingMethod, price));
    }
}
