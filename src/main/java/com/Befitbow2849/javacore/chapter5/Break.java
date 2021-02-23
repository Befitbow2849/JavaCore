package com.Befitbow2849.javacore.chapter5;

public class Break {
    public static void main(String[] args) {
        boolean t = true;
        first: {
            second:{
               third:{
                   System.out.println("Предшествует оператору break.");
                   if (t) break second;
                   System.out.println("Оператор не будет выполняться");
                }
                System.out.println("Оператор не будет выполняться");
            }
            System.out.println("Оператор следует за блоком second");
        }
    }
}
