package com.company;

public class Die
{
    private int value;
    private final int sides;

    public Die(int sides)
    {
        this.sides = sides;
        roll();
    }

    public Die()
    {
        this.sides = 6;
        roll();
    }

    public int getValue()
    {
        return value;
    }

    public void roll()
    {
        java.util.Random random = new java.util.Random();
        value = random.nextInt(sides) + 1;
    }
}
