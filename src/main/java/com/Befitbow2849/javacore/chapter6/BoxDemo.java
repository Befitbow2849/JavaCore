package com.Befitbow2849.javacore.chapter6;
class Box{
    double width;
    double height;
    double depth;
}

public class BoxDemo {
    public static void main(String[] args) {
        double vol;
        Box mybox = new Box();
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;
        vol = mybox.depth * mybox.height + mybox.width;
        System.out.println("Объем равен");

    }
}
