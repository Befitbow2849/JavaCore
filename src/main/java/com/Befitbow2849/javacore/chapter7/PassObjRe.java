package com.Befitbow2849.javacore.chapter7;
class Test1{
    int a,b;

    Test1 (int i, int j){
        a = i;
        b = j;
    }
    void math(Test1 o){
        o.a *= 2;
        o.b /= 2;

    }


}

public class PassObjRe {
    public static void main(String[] args) {
        Test1 obe = new Test1(15,20);
        System.out.println("ob.a и ob.b до вызова: " + obe.a + " " + obe.b);
        obe.math(obe);
        System.out.println("ob.a и ob.b после вызова: " + obe.a + " " + obe.b);
    }
}
