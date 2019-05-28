package com.company;

public class Dice
{
    private Die die1;
    private Die die2;

    public Dice()
    {
        die1 = new Die();
        die2 = new Die();
    }

    public void roll()
    {
        die1.roll();
        die2.roll();
    }

    public int getValue()
    {
        return die1.getValue() + die2.getValue();
    }
}
