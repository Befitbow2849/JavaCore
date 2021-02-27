package com.Befitbow2849.javacore.chapter7;
class  rectest{
    int values [];
    rectest(int i){
        values = new int[i];
    }

    void printArray (int i){
        if (i==0) return;
        else printArray(i-1);
        System.out.println(values[i-1]);

    }

}

public class Recursion2 {
    public static void main(String[] args) {
        rectest ob = new rectest(10);
        for (int i = 0; i < 10; i++) ob.values[i] = i;
        ob.printArray(10);
    }
}
