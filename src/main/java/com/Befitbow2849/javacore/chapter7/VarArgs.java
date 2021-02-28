package com.Befitbow2849.javacore.chapter7;

public class VarArgs {

    static void vaTest (int ... v){
        System.out.println("Кол-во аргументов" + v.length);
        for (int x : v){
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {

        vaTest(10);
        vaTest(10,20,30);

    }

}
