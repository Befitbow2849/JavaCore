package com.Befitbow2849.javacore.chapter5;

public class IfElse {
    public static void main(String[] args) {
        int month = 4;
        String season;
        if (month == 12 || month == 1 || month == 2)
            season = "Zima";
        else if (month == 3 || month == 4 || month == 5)
            season = "Vesna";
        else  if (month == 6 || month == 7 || month == 8)
            season = "Leto";
        else
            season = "Osen`";
        System.out.println("Апрель относится к " + season);

    }
}
