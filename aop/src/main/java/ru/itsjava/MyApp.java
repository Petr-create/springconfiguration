package ru.itsjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import ru.itsjava.services.FilmService;

@EnableAspectJAutoProxy
@ComponentScan({"ru.itsjava"})
public class MyApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyApp.class);
        System.out.println(context.getBean(FilmService.class).getById(1000));
    }
}
