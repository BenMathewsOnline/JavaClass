package com.company;

public class Main {

    public static void main(String[] args)
    {
        Dashboard dashboard = new Dashboard();
        dashboard.setSpeed(65);
        dashboard.setRpm(1500);
        System.out.println(dashboard.getDisplay());

        dashboard.setSpeed(75);
        dashboard.setRpm(2000);
        System.out.println(dashboard.getDisplay());
    }
}
