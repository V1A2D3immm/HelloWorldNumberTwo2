package com.first.project;

public class Tforcoal extends Train {
    int coal;


    public void transfer2(Object baggage, String place,int coal) {
        super.transfer(baggage, place);
        this.coal = coal;
        if (coal>=1000){
            System.out.println("Угля достаточно едем ");
        }
        else{System.out.println("Нужна разгрузка едем");
    }
}}










