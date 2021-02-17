package ru.itsjava.exampbeforeadvice;

public class Guitarist implements Singer {

    private String lyric = "Ты будешь жить во мне вечно";
    private String rock = "Вместе весело шагать";

    @Override
    public void sing() {
        System.out.println(lyric);
    }

    public void singRock(){
        System.out.println(rock);
    }
}
