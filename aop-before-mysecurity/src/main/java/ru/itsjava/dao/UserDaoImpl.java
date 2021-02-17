package ru.itsjava.dao;

import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl implements UserDao{
    @Override
    public void writeSecureMessage() {
        System.out.println("Каждый раз, когда я узнаю что-то новое, я выкидываю из своей головы что-то старое!");
    }
}
