package com.Befitbow2849.javacore.chapter3;

public class Light {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;
        lightspeed = 186000;
        days = 1000;
        distance = days * lightspeed;
        System.out.print("За " + days);
        System.out.print(" дней, свет пройдет около: ");
        System.out.print(distance + " миль");
    }
}
