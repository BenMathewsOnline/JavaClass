package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        printHeader();

        System.out.println();
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("Enter your birth year: ");
        int yearBorn = input.nextInt();

        System.out.println("Enter your first name: ");
        String firstName = input.next();

        System.out.println("Enter your last name: ");
        String lastName = input.next();

        System.out.println("Enter your 5 digit employee number: ");
        int employeeNumber = input.nextInt();

        printName(firstName, lastName);

        printAge(yearBorn);

        evenOrOdd(employeeNumber);

        printGeneratedSecretPassword(employeeNumber);
    }

    public static void printGeneratedSecretPassword(int password)
    {
        java.util.Random random = new java.util.Random();
        int randomNumber = random.nextInt(6) + 1;
        int newPassword = (password + randomNumber) * 5;

        System.out.println("Employee's random secret password is: " + newPassword);
    }

    public static void evenOrOdd (int number)
    {
        if ((number % 2) == 0)
        {
            System.out.println("Employee number is even: true");
        }
        else{
            System.out.println("Employee number is even: false");
        }
    }

    public static void printAge (int age)
    {
        age = 2019 - age;
        System.out.println("Your age is: " + age);
    }

    private static void printHeader()
    {
        System.out.println("Welcome to the WallabyTech Employee Application");
        System.out.println("===============================================");
    }

    private static void printName (String first, String last)
    {
        System.out.println(last + ", "  + first);
    }
}
