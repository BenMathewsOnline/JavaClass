package com.company;

public class Main
{
    public static void main(String[] args)
    {
        Account account = new Account();
        account.customerName = "Fred Flintstone";
        account.balance = 23.45;
        account.interestRate = 0.005;
        account.address = "Bedrock";

        Account account2 = new Account();
        account2.customerName = "Wilma Flintstone";
        account2.balance = 5623.45;
        account2.interestRate = 0.055;
        account2.address = "Metroplis";

        account.printStatement();
        account.printCDOffer();

        account2.printStatement();
        account2.printCDOffer();


    }
}