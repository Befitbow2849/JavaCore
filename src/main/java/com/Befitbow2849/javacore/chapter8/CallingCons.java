package com.Befitbow2849.javacore.chapter8;
class AAA{
    AAA(){
        System.out.println("Констуктор ААА");
    }
}
class BBB extends  AAA{
    BBB(){
        System.out.println("Конструктор BBB");
    }

}
class CCC extends BBB{
    CCC(){
        System.out.println("Конструктор ССС");
    }
}

public class CallingCons {
    public static void main(String[] args) {
        CCC ob1 = new CCC();
    }
}
