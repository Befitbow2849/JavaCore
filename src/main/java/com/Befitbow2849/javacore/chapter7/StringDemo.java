package com.Befitbow2849.javacore.chapter7;

import java.sql.SQLOutput;

public class StringDemo {
    public static void main(String[] args) {
        String ob1 = "Первая строка";
        String ob2 = "Вторая строка";
        String ob3 = ob1;
        System.out.println("Длинна строки один = " + ob1.length());
        System.out.println("Символ по индексу 3 в строке ob1: " + ob1.charAt(3));

        if (ob1.equals(ob2)) System.out.println("ob1 = ob2");
    }
}
