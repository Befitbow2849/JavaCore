package com.Befitbow2849.javacore.chapter7;
class Test5{

    int a;

    Test5(int i){
        a = i;


    }
    Test5 incrbyten(){
        Test5 temp = new Test5(a+10);
        return temp;


    }


}

public class Retob {
    public static void main(String[] args) {
        Test5 ob1 = new Test5(2);
        Test5 ob2;
        ob2 = ob1.incrbyten();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);
        ob2 = ob2.incrbyten();
        System.out.println("ob2.a: " + ob2.a);


    }
}
