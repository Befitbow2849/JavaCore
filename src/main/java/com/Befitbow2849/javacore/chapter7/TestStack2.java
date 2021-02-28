package com.Befitbow2849.javacore.chapter7;

import java.security.spec.RSAOtherPrimeInfo;

class Stack{
    private int stek[];
    private int tos;

    Stack(int size){
        stek = new int[size];
        tos = -1;

    }
    void push(int item){
        if (tos == stek.length - 1)
            System.out.println("стек полон");
        else stek[++tos] = item;
    }
    int pop(){
        if (tos < 0){
            System.out.println("Стек не загружен");
            return 0;
        }
        else return stek[tos--];
    }

}
public class TestStack2 {
    public static void main(String[] args) {
        Stack mystak1 = new Stack(5);
        Stack mystak2 = new Stack(8);
        for (int i = 0; i < 5; i++) mystak1.push(i);
        for (int i = 0; i < 8; i++) mystak2.push(i);

        for (int i = 0; i < 5; i++)
        System.out.println(mystak1.pop());
        for (int i = 0; i < 8; i++)
            System.out.println(mystak2.pop());


    }
}
