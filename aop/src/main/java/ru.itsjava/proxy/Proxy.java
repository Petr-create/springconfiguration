package ru.itsjava.proxy;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Proxy {
    private final String fio;

    public String getFio() throws NoSuchFieldException {
        if(fio.isEmpty()){
            throw new NoSuchFieldException("фио не указано");
        }
        return fio;
    }
}
