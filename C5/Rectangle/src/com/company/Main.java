package com.company;

public class Main {

    public static void main(String[] args)
    {
        int area = getArea(4, 5);
        System.out.println("area = " + area);
        int perimeter = getPerimeter(4, 5);
        System.out.println("Perimeter = " + perimeter);
    }

    private static int getArea (int height, int width)
    {
        return height * width;
    }
    private static int getPerimeter (int hight, int width)
    {
        return (2* hight) + (2* width);
    }
}
