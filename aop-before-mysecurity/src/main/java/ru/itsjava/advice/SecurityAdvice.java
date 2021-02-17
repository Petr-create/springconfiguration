package ru.itsjava.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import ru.itsjava.domain.UserInfo;
import ru.itsjava.exception.SecurityException;
import ru.itsjava.services.SecurityManagerImpl;

import java.io.IOException;

@Aspect
@Component
public class SecurityAdvice {

    @Before("execution (* ru.itsjava.dao.*.*(..))")
    public void before(JoinPoint joinPoint) throws IOException {
        System.out.println("Перед тем как вызвать метод "
                + joinPoint.getSignature().getName() + " вы должны пройти проверку по login and password");
        UserInfo userInfo = SecurityManagerImpl.getLoginAndPassword();
        if(userInfo.getUserName().equals("Petr") && userInfo.getPassword().equals("123")){
            System.out.println("Вы прошли проверку");
            System.out.println();
        } else {

                System.out.println("Вы не прошли проверку!");
                throw new SecurityException();

        }
    }
}
