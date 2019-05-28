package com.company;

public class Account
{
    String customerName;
    String address;
    double balance;
    double interestRate;

    public void printStatement()
    {
        System.out.println("Customer: " + customerName);
        System.out.println("Address: " + address);
        System.out.println("Balance: $" + balance);
        System.out.println("Interest rate: " + interestRate);
        System.out.println();
    }

    public void printCDOffer()
    {
        System.out.println("Hi, " + customerName);
        System.out.println("wouldn't you like to invest some of your $" + balance + " in a CD?");
        System.out.println("You are only getting a lousy " + interestRate + " on your account.");
        System.out.println();
    }
}
