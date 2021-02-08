package ru.itsjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.itsjava.app.services.ICustomer;
import ru.itsjava.dto.Coffee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String brand = reader.readLine();
        String cookingMethod = reader.readLine();
        double price = Double.parseDouble(reader.readLine());

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("app-config.xml");
        applicationContext.getBean(ICustomer.class).printBuy(new Coffee(brand, cookingMethod, price));
    }
}