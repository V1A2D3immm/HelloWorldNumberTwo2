package com.first.project;

import inter.Firstinterface;



public class Conductor extends Human {

    @Override
    public void mood(String vibe) {
        System.out.println(vibe);
    }

    public void about(String name, int age, char sex, String profession) {
        if ((sex == 'm' && age <= 65) || (sex == 'w' && age <= 60)) {
            System.out.println(" Не старый проводник работает ");
        } else {
            System.out.println("Старый проводник на пенсии");
        }

        {
            System.out.println(name + " " + age + " " + sex + " " + profession);
        }


    }}
