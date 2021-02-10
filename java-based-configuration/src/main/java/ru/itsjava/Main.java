package ru.itsjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import ru.itsjava.app.services.Customer;
import ru.itsjava.domain.Coffee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@ComponentScan({"ru.itsjava.config"})
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String brand = reader.readLine();
        String cookingMethod = reader.readLine();
        double price = Double.parseDouble(reader.readLine());
        reader.close();

        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        context.getBean(Customer.class).printBuy(new Coffee(brand, cookingMethod, price));
    }
}
