package com.company;

public class Triangle
{
    private int sideA;
    private int sideB;
    private int sideC;

    public void setSideA (int sideA) {
        this.sideA = sideA;
    }

    public void setSideB (int sideB) {
        this.sideB = sideB;
    }

    public void setSideC (int sideC) {
        this.sideC = sideC;
    }

    public String returnTotalLength()
    {
        return " " + getSideA()+ ", " + getSideB() + ", " + getSideC();
    }

    public int getSideA()
    {
        return sideA;
    }

    public int getSideB()
    {
        return sideB;
    }

    public int getSideC()
    {
        return sideC;
    }

    public int getPerimeter() {
        return sideA + sideC + sideB;
        }

    public boolean isEquilateral()  {
        if ((sideA == sideB) || (sideB == sideC) || (sideC == sideA))
            return true;
        else
            return false;
    }

}
