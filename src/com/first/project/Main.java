package com.first.project;

import javax.xml.transform.SourceLocator;

public class Main {

    public static void main(String[] args) {

        int[] newnumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int sum = 0;
        for (int i = 0; i < newnumbers.length; i++)
        {System.out.println(newnumbers[i]);}

        for (int i = 0; i < newnumbers.length; i++)
            sum += newnumbers[i];

        {System.out.println(sum);}

        if ( sum % 2 == 0 )
            System.out.println("Число четное");
        else
            System.out.println("Число нечетное");

















    }}
