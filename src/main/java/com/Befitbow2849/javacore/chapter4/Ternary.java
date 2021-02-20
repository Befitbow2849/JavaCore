package com.Befitbow2849.javacore.chapter4;

public class Ternary {
    public static void main(String[] args) {
        int i, k;
        i = 10;
        k = i < 0? -i : i;
        System.out.println("Абсолют значение " + i + " = " + k);
        i = -10;
        k = i<0? i : i;
        System.out.println("Абсолют значение " + i + " = " + k);
    }
}
