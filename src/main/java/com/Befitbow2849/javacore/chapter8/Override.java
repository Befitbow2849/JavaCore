package com.Befitbow2849.javacore.chapter8;
class AAAA{
    int i, j;
    AAAA(int a, int b){
        i = a;
        j = b;
    }

    void show(){
        System.out.println("i и j равны " + i + " " + j);
    }
}
class BBBB extends AAAA{
    int k;
    BBBB(int a, int b, int c){
        super(a, b);
        k = c;
    }

    void show(){
        System.out.println("k равен " + k);
    }

}

public class Override {
    public static void main(String[] args) {
        BBBB ob1 = new BBBB(10,20,30);
        ob1.show();
    }
}
