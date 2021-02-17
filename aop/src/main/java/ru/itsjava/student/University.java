package ru.itsjava.student;

public class University {
    public static void main(String[] args) {
        ProxyStudent vania = new ProxyStudent("");
        System.out.println(vania.getFio());
    }
}
