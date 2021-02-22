package com.Befitbow2849.javacore.chapter5;

public class FindPrime {
    public static void main(String[] args) {
        int num;
        boolean isPrime;
        num = 17;
        if(num<2)
            isPrime = false;
        else isPrime = true;

        for (int i = 2; i <= num/i; i++){
            System.out.println(num + " " + i);
            if ((num % i) == 0){
                isPrime = false;
                break;
            }

        }
        if (isPrime) System.out.printf("Prostoe");
        else System.out.println("Neprostoe");

    }
}
