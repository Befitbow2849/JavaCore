package com.Befitbow2849.javacore.chapter8;
class AA{
    int i;
}
class BB extends AA {
    int i;
    BB (int a, int b){

        super.i = b;
        i = a;

    }
    void show (){

        System.out.println("Член i в суперклассе: " + super.i);
        System.out.println("Член i в подклассе: " + i);

    }
}

public class UseSuper {
    public static void main(String[] args) {
        BB ob1 = new BB(1,2);
        ob1.show();

    }
}
