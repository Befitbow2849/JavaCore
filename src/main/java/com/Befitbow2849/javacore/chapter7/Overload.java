package com.Befitbow2849.javacore.chapter7;

class OverloadDemo {

    void test() {
        System.out.println("Параметров нет");
    }
    void test (int a){
        System.out.println("a: " + a );
    }
    void test (int a, int b){
        System.out.println("a и b: " + a + " " + b);
    }
    double test (double a, double b){

        System.out.println("a and b: "+ a + " " + b);
        return a * b;

    }


}


public class Overload {
    public static void main(String[] args) {
        double result;
        OverloadDemo ob = new OverloadDemo();
        ob.test();
        ob.test(10);
        ob.test(10, 20);
        System.out.println(result = ob.test(123.25, 144.2));
    }
}
