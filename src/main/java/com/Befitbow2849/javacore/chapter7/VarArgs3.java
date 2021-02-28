package com.Befitbow2849.javacore.chapter7;

public class VarArgs3 {

    static void vaTest(int... v) {
        System.out.println("vaTest int ... v " + v.length + "содержимое: ");
     for (int x: v){
         System.out.println(x + " ");
     }
        System.out.println();
    }

    static void vaTest(boolean ... v){
        System.out.println("boolean ... v" + v.length + "содержимое: ");
        for (boolean x: v){
            System.out.println(x + " ");
        }
        System.out.println();
    }
    static  void vaTest(String msg, int ... v){
        System.out.println("String msg, int ... v" + v.length + "содержимое: ");
        for (int x : v){
            System.out.println(x + " ");
        }
    }

    public static void main(String[] args) {
        vaTest(120,110,50);
        vaTest(true,false);
        vaTest("ХехМда", 321,24);
    }

}