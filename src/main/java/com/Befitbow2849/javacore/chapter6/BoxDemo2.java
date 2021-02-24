package com.Befitbow2849.javacore.chapter6;
class Box1 {
    double width;
    double height;
    double depth;
        }

public class BoxDemo2 {
    public static void main(String[] args) {
        double vol;
        Box1 mybox1 = new Box1();
        Box1 mybox2 = new Box1();
        mybox1.width = 10;
        mybox1.depth = 15;
        mybox1.height = 20;
        mybox2.height = 6;
        mybox2.depth = 9;
        mybox2.width = 3;
        vol = mybox1.depth * mybox1.width * mybox1.height;
        System.out.println(vol + " объем первой коробки");
        vol = mybox2.depth * mybox2.height * mybox2.width;
        System.out.println(vol + " объем второй коробки");
    }
}
