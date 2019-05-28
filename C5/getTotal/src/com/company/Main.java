package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        java.util.Scanner input = new java.util.Scanner(System.in);
        /*System.out.println("Enter fancy letters");
        String fancyCharacters = input.next();

        String fancyName = getMyFancyName(fancyCharacters);
        System.out.println(fancyName + "Ben" + fancyName);

        int y = getTotal(12, 12);
        System.out.println(y);

        System.out.println("Enter first number");
        int enterX = input.nextInt();
        System.out.println("Enter second number");
        int enterY = input.nextInt();

        int maxOut = getMax (enterX, enterY);
        System.out.println(maxOut + " is bigger ");*/

        System.out.println("Is it Thunderdome!?!?");
        System.out.println("Enter first number");
        int enterX = input.nextInt();
        System.out.println("Enter second number");
        int enterY = input.nextInt();
        boolean thunderdome = isThunderdome(enterX, enterY);
        System.out.println(thunderdome);
    }

    private static String getMyFancyName(String x)
    {
        return x;
    }

    private static int getTotal(int firstNumber, int secondNumber)
    {
        return firstNumber + secondNumber;
    }

    private static int getMax (int x, int y)
    {
        if(x >  y)
        {
            return x;
        }
        else return y;
    }

    private static boolean isThunderdome(int enteredCount, int leavingCount)
    {
        if (enteredCount != 2 && leavingCount != 1)
        {
            return false;
        }
        else return true;
    }
}