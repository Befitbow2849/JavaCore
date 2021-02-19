package com.Befitbow2849.javacore.chapter3;

public class Array {
    public static void main(String[] args) {
        int month_days[];
        month_days = new int[12];
        month_days[0]=31;
        month_days[1]=28;
        month_days[2]=29;
        month_days[3]=30;
        month_days[4]=31;
        month_days[5]=29;
        month_days[6]=31;
        month_days[7]=28;
        month_days[8]=29;
        month_days[9]=30;
        month_days[10]=31;
        month_days[11]=29;
        System.out.println("В апреле " + month_days[3]);

    }
}
