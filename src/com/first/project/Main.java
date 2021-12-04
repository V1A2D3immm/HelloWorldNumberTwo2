package com.first.project;

import javax.xml.transform.SourceLocator;

public class Main {

    public static void main(String[] args) {


    Tforpeople Full2 = new Tforpeople();
    Full2.fill(10);
    Full2.transfer("людей","Саратов",50);

    Tforcoal Full3 = new Tforcoal();
    Full3.fill(30);
    Full3.transfer2("Уголь","Звенигород",1000);

    Conductor a = new Conductor();
    a.about("Вася ",30,'m'," лет проводник");
    a.mood("У Васи хорошее настроение");


    Passenger b = new Passenger();
    b.about("Маша",70,'w'," лет студентка");
    b.mood("У Маши плохое настроение");





























    }}
