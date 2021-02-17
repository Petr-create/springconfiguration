package ru.itsjava.exception;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SecurityException extends RuntimeException{

    @Override
    public String toString() {
        return "SecurityException Вы ввели не правильный login or password";
    }
}
