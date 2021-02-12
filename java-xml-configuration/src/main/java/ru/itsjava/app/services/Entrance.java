package ru.itsjava.app.services;

import ru.itsjava.domain.Coffee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Entrance {
    public static Coffee pointOfEntry() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String brand = reader.readLine();
        String cookingMethod = reader.readLine();
        double price = Double.parseDouble(reader.readLine());

        return new Coffee(brand, cookingMethod, price);
    }
}
