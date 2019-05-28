package com.company;

public class Main {

    public static void main(String[] args)
    {
        Weather today = Weather.RAINING;
        Weather tomorrow = Weather.FOGGY;
        Weather dayAfterTomorrow = Weather.CLEAR;

        if (today == Weather.RAINING)
        {
            System.out.println("It's going to rain today");
        }

        printWeather(today);
        printWeather(tomorrow);
        printWeather(dayAfterTomorrow);

    }
    private static void printWeather(Weather weather)
    {
        switch (weather)
        {
            case RAINING:
                System.out.println("Weather of Raining");
                break;
            case CLEAR:
                System.out.println("It is clear");
                break;
            default:
                System.out.println("I don't know what's going on!");
        }
    }
}
