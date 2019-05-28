package com.company;

public class Main
{
    public static void main(String[] args)
    {
        boolean isTrue = true;
        do
        {
            java.util.Scanner input = new java.util.Scanner(System.in);
            System.out.println("Welcome to Ed's Wholesale String Cheese");
            System.out.println("=======================================");
            System.out.println("we have 1 inch cheese, 2 inch cheese, or 3 inch cheese");
            System.out.println("the prices are $2 a yard, $4 a yard, or $6 a yard, respectively");
            System.out.println("shipping is $2 per yard for the 1 and 2 inch, and $4 for 3 inch");
            System.out.println("Shipping's free with 50 yards + of 1 inch, 75 yards + of 2 inch, and 25 yards + of 3 inch");
            System.out.println("What size cheese do you want? Choose 1, 2, or 3 inch.");
            String cheeseType = input.next();

            switch (cheeseType)
            {
                case "1":
                    oneInch();
                    break;

                case "2":
                    twoInch();
                    break;

                case "3":
                    threeInch();
                    break;

                default:
                    System.out.println("Order is too crazy!!!");
            }
        }while (isTrue == true);
    }

    private static int shippingCostOneInch(int x)
    {
        if (x < 50)
        {
            return (x * 2) + 5;
        } else
        {
            return x + 5;
        }
    }

    private static int shippingCostTwoInch(int x)
    {
        if (x < 75)
        {
            return (x * 2) + 5;
        } else
        {
            return x + 5;
        }
    }

    private static int shippingCostThreeInch(int x)
    {
        if (x < 25)
        {
            return (x * 4) + 5;
        } else
        {
            return x + 5;
        }
    }

    private static void oneInch()
    {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("How many yards?");
        int oneInchYards = input.nextInt();
        int ship = shippingCostOneInch(oneInchYards);
        results(1, ship);
    }

    private static void twoInch()
    {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("How many yards?");
        int twoInchYards = input.nextInt();
        int ship = shippingCostTwoInch(twoInchYards);
        results(2, ship);
    }

    private static void threeInch()
    {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("How many yards?");
        int threeInchYards = input.nextInt();
        int ship = shippingCostThreeInch(threeInchYards);
        results(3, ship);
    }

    private static void results(int x, int y)
    {
        System.out.println("you've ordered string " + x + " inch string cheese." );
        System.out.println("Your cheese cost and shipping total is $" + y + ". Thank you!");
        System.out.println();
    }

}
