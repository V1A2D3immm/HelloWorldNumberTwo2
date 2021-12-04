package com.first.project;

public class Passenger extends Human {

    public void about(String name, int age, char sex, String profession) {
        if ((sex == 'm' && age <= 65) || (sex == 'w' && age <= 60)) {
            System.out.println(" пассажир не пенсионер ");
        } else {
            System.out.println("пенсионер");
        }


        {System.out.println(name + " " + age + " " + sex + " " + profession);}
    }

    @Override
    public void mood(String vibe) {
        System.out.println(vibe);
    }
}




