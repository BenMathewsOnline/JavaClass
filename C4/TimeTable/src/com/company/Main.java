package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("pick a max number");
        int max = in.nextInt();

        for (int i = 1; i<= max; i++){
            System.out.printf("  %2d", i);
        }
        System.out.println();
        System.out.println("   ------------------");


        for (int i = 1; i <= max; i++){
            System.out.printf("%s |", i);;
            for (int j = 1; j <= max; j++){
                System.out.printf("%2d  ", i * j);
            }
            System.out.println();
        }
    }
}
