package com.Befitbow2849.javacore.chapter7;
class Outer{
    int outer_x = 100;

    void test (){
        Inner inner = new Inner();
        inner.display();

    }

    class Inner{
        void display(){
            System.out.println("Вывод: outer x = " + outer_x);
        }

    }




}


public class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}