package com.first.project;

public class Train {
    private static final int limittank = 10;
    int tankfuel;

    public void transfer(Object baggage, String place) {
        if (tankfuel < 10) {
            System.out.println("Отправка невозможна, нужна дозаправка");
            return;
        }
        System.out.printf("отправка %s в %s\n", baggage, place);
    }

    public void fill(int litter) {
        tankfuel += litter;
        System.out.println("Перевозка на " + litter + " литров");

    }
}
