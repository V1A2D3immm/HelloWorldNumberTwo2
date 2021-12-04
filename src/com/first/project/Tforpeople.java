package com.first.project;

public class Tforpeople extends Train {
    int peopl;


    public void transfer(Object baggage, String place,int peopl) {
        super.transfer(baggage, place);
        this.peopl = peopl;
        if (peopl<=50){
        System.out.println("Отправка возможна , провожающие выходят");
        }
        else{System.out.println("Отправка невозможна не все вышли");



        }

    }
}

