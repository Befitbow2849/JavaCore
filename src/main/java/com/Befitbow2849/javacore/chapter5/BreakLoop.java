package com.Befitbow2849.javacore.chapter5;

public class BreakLoop {
    public static void main(String[] args) {
        for (int i=0; i<100; i++){
            if(i==0) break;
            System.out.println("i: " + i);
        }
        System.out.println("Цикл завершен.");
    }
}
