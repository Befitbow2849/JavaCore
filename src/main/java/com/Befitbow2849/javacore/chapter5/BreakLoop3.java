package com.Befitbow2849.javacore.chapter5;

public class BreakLoop3 {
    public static void main(String[] args) {
        for (int i = 0; i <3; i++) {
            System.out.print("Проход " + i);
            for (int j = 0; j<100; j++){
                if(j==10) break;
                System.out.println("j = " + j);

            }
        }
        System.out.println("Zaverweno");
    }
}
