package ru.itsjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.itsjava.app.services.Customer;
import ru.itsjava.app.services.Entrance;
import ru.itsjava.domain.Coffee;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Coffee coffee = Entrance.pointOfEntry();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("app-config.xml");
        applicationContext.getBean(Customer.class).printBuy(coffee);
    }
}