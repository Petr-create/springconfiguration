package ru.itsjava.app.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import ru.itsjava.Main;
import ru.itsjava.domain.Coffee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@ComponentScan({"ru.itsjava"})
public class Entrance {
    public static void pointOfEntry() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String brand = reader.readLine();
        String cookingMethod = reader.readLine();
        double price = Double.parseDouble(reader.readLine());
        reader.close();

        ApplicationContext context = new AnnotationConfigApplicationContext(Entrance.class);
        context.getBean(Customer.class).printBuy(new Coffee(brand, cookingMethod, price));
    }
}
