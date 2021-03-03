package com.Befitbow2849.javacore.chapter8;



abstract class Figuree{
    double dim1;
    double dim2;

    Figuree(double a, double b){
        dim1 = a;
        dim2 = b;

    }
    abstract double areaa();



}
class Rectanglee extends Figuree{
    Rectanglee(double a, double b){
        super(a,b);
    }
    double areaa(){
        System.out.println("В области четырехугольника: ");
        return dim1 * dim2;
    }
}

class Trianglee extends Figuree{
    Trianglee(double a, double b){
        super(a,b);
    }
    double areaa(){
        System.out.println("В области триугольника");
        return dim1 * dim2/2;
    }
}

public class AbstractAreas {
    public static void main(String[] args) {
        Rectanglee ob1 = new Rectanglee(10,20);
        Trianglee ob2 = new Trianglee(20,30);
        Figuree f;

    }
}
