package com.Befitbow2849.javacore.chapter7;
class Testt{
    int a;
    public int b;
    private int c;


    void setc(int i){
        c=i;
    }
    int getc(){
        return c;
    }

}

public class AccessTest {
    public static void main(String[] args) {
        Testt ob1 = new Testt();
        ob1.a = 10;
        ob1.b = 20;
        ob1.setc(100);

    }
}
