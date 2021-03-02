package com.Befitbow2849.javacore.chapter8;
class aaaa{
    void callme(){
        System.out.println("В метода callme из А");
    }

}
class bbbb extends aaaa{
    void callme(){
        System.out.println("в методе callme из B");
    }
}
class cccc extends aaaa{
    void callme(){
        System.out.println("в методе callme из С");
    }
}



public class Dispatch {
    public static void main(String[] args) {
        aaaa r;

        aaaa ob1 = new aaaa();
        ob1.callme();
        r = ob1;
        bbbb ob2 = new bbbb();
        ob2.callme();
        cccc ob3 = new cccc();
        ob3.callme();
    }
}
