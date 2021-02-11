package ru.itsjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.itsjava.app.services.Customer;
import ru.itsjava.app.services.Entrance;
import ru.itsjava.domain.Coffee;

import java.io.IOException;

@ComponentScan({"ru.itsjava.config"})
public class Main {
    public static void main(String[] args) throws IOException {
        Coffee coffee = Entrance.pointOfEntry();

        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        context.getBean(Customer.class).printBuy(coffee);
    }
}
