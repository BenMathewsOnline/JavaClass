package com.company;

public class Main {

    public static void main(String[] args)
    {
        TrafficLight stopCondition = TrafficLight.RED;
        TrafficLight goCondition = TrafficLight.GREEN;
        TrafficLight yieldCondition = TrafficLight.YELLOW;

        printTrafficLightStatus();

        currentLightColor(stopCondition);
        currentLightColor(goCondition);
        currentLightColor(yieldCondition);

        nextLightColor(stopCondition);
        nextLightColor(goCondition);
        nextLightColor(yieldCondition);
    }

    private static void printTrafficLightStatus (TrafficLight trafficLightcolor)
    {
        switch (trafficLightcolor)
        {
            case RED:
                System.out.println("Stop"); break;
            case GREEN:
                System.out.println("Go"); break;
            case YELLOW:
                System.out.printf("Slow down"); break;
        }
    }

    private static void currentLightColor (TrafficLight current)
    {
        if (current == TrafficLight.RED)
        {
            System.out.println("Light is Red.");
        }
        else if (current == TrafficLight.GREEN)
        {
            System.out.println("Light is green.");
        }
        else
        {
            System.out.println("Light is yellow.");
        }
    }


    private static void nextLightColor (TrafficLight next)
    {
        if (next == TrafficLight.RED)
        {
            System.out.println("Green");
        }
        else if (next == TrafficLight.GREEN)
        {
            System.out.println("Yellow");
        }
        else
        {
            System.out.println("Red");
        }
    }
}
