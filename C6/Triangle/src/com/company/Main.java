package com.company;

public class Main {

    public static void main(String[] args)
    {
        Triangle triangle = new Triangle();
        triangle.setSideA(4);
        triangle.setSideB(5);
        triangle.setSideC(8);
        printTriangleSummary(triangle);

        Triangle triangle2 = new Triangle();
        triangle2.setSideA(4);
        triangle2.setSideB(4);
        triangle2.setSideC(4);
        printTriangleSummary(triangle2);
   }

    private static void printTriangleSummary(Triangle triangle)
    {
        System.out.println("The length of a triangle is" + triangle.returnTotalLength() + " with the perimeter being " + triangle.getPerimeter()
        + " and are two sides equal is " + triangle.isEquilateral() + ".") ;
    }
}
