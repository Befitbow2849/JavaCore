package com.Befitbow2849.javacore.chapter5;

public class Searh {
    public static void main(String[] args) {
        int nums [] = {6, 8, 3, 7, 5, 6, 1, 4};
        int val = 5;
        boolean found = false;
        for (int x : nums){

            if (x==val) break;
            found = true;
        }
        if (found)
            System.out.println("Найдено!");

    }
}
