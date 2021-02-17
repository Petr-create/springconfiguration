package ru.itsjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import ru.itsjava.domain.UserInfo;
import ru.itsjava.services.SecurityManager;
import ru.itsjava.services.SecurityManagerImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@EnableAspectJAutoProxy
@ComponentScan("ru.itsjava")
public class MyApp {
    public static void main(String[] args) throws IOException {

        ApplicationContext context = new AnnotationConfigApplicationContext(MyApp.class);
        context.getBean(SecurityManager.class).login();

    }

}
