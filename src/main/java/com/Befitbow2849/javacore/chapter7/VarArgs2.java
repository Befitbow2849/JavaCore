package com.Befitbow2849.javacore.chapter7;

public class VarArgs2 {

    static void vaTest(String msg, int ... v){
        System.out.println(msg + v.length + "Содержимое");
        for (int x : v){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("Один параметр ", 10);
        vaTest("Три параметра ", 1, 2,3);
        vaTest("Без параметров");
    }

}
