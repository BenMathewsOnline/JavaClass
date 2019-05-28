package com.company;

public class Main {

    public static void main(String[] args)
    {
        Die myDie = new Die(6);
        Die myTwentySidedDie = new Die(20);

        System.out.println("I rolled " + myDie.getValue());
        myDie.roll();
        System.out.println("I rolled " + myDie.getValue());
        myDie.roll();
        System.out.println("I rolled " + myTwentySidedDie.getValue());

        Dice dice = new Dice();
        System.out.println("I rolled with 2 dice: " + dice.getValue());
    }
}
