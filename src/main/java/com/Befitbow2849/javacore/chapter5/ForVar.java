package com.Befitbow2849.javacore.chapter5;

public class ForVar {
    public static void main(String[] args) {
        int i;
        boolean done = false;
        i = 0;
        for ( ;!done;){
            System.out.println("i равно" + i);
            System.out.println("done равно " + done);
            if (i==10) done = true;
            i++;
        }
    }
}
