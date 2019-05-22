package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter fancy letters");
        String fancyCharacters = input.next();

    String fancyName = getMyFancyName(fancyCharacters);
        System.out.println(fancyName + "Ben" + fancyName);
    }

    private static String getMyFancyName(String x)
    {
        return x;
    }
}
