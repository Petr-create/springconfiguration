package ru.itsjava.student;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Student {
    private final String fio;

    public String getFio() throws NoSuchFieldException {
        if(fio.isEmpty()){
            throw new NoSuchFieldException();
        }
        return fio;
    }
}
