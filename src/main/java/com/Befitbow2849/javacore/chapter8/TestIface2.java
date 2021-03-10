package com.Befitbow2849.javacore.chapter8;
interface Callback{
    void callback(int param);
}

class Client implements Callback{

    public void callback(int p){
        System.out.println("Метод callback() вызываемый со значением " + p);
    }
    void nonIfaceMeth(){
        System.out.println("В классах реализующих интерфейсы могу определяться другие члены");
    }
}
class AnotherClient implements Callback{
    public void callback(int p){
        System.out.println("Еще один пример ");
    }
}


public class TestIface2 {
    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();
        c.callback(42);
        c = ob;
        c.callback(42);
    }
}
