package com.Befitbow2849.javacore.chapter7;
class Factorial{

    int fact(int n){
        int result;
        if (n == 1) return 1;
        result = fact(n -1 )*n;
        return result;

    }


}

public class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();

        System.out.println("Факториал 3 равен " + f.fact(3));
        System.out.println("Факториал 3 равен " + f.fact(4));

    }
}
