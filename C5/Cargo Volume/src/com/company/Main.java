package com.company;

public class Main {

    public static void main(String[] args)
    {
        double cargoVolume = getCargoVolume(10.5, 12.5, 15.5, true);
        System.out.println("Cargo Volume is " + cargoVolume);
    }

    private static double getCargoVolume (double hight, double length, double depth, boolean heavyDuty)
    {
        double x;
        if (heavyDuty == true)
        {
            x = .5;
        }
        else
        {
            x = .25;
        }
        double sum = ((hight - x - x) * (length - x - x) * (depth - x - x));
        return sum;
    }
}
