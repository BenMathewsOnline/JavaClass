package com.company;

public class Main {

    public static void main(String[] args)
    {
        double area = getArea(4);
        System.out.println("Radius is " + area);
        double diameter = getDiameter(12);
        System.out.println("Diameter is "  + diameter);
        double circumference = getCircumference(diameter);
        System.out.println("Circumference is " + circumference);
    }
    private static double getArea (double radius)
    {
        return (3.14) * (radius * radius);
    }
    private static double getDiameter (double radius)
    {
        return 2 * radius;
    }
    private static double getCircumference (double diameter)
    {
        return 3.14 * diameter;
    }

}
