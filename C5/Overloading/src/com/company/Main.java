package com.company;

public class Main {

    public static void main(String[] args)
    {
        int x = 10;
        int y = -20;
        int sum = absoluteSum(x, y);
        System.out.println("The sum of " + x + " + " + y + " = " + sum);
    }

    private static int absoluteSum (int x, int y)
    {
        return x + y;
    }
    private static int absoluteSum (int x, int y, int z)
    {
        return x + y + z;
    }

}
