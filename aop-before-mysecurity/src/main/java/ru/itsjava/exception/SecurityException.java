package ru.itsjava.exception;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SecurityException extends Exception{

    @Override
    public String toString() {
        return "SecurityException ";
    }
}
