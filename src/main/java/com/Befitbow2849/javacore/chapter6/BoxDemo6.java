package com.Befitbow2849.javacore.chapter6;

class Box6{

    double height;
    double weight;
    double depth;

    Box6(){
        System.out.println("Конструктор объектов java");
        height = 10;
        weight = 10;
        depth = 10;

    }

    double volume(){
        return height * weight * depth;

    }


}

public class BoxDemo6 {
    public static void main(String[] args) {
        double vol;
        Box6 mybox1 = new Box6();
        Box6 mybox2 = new Box6();
        vol = mybox1.volume();
        System.out.println(vol);
        vol = mybox2.volume();
        System.out.println(vol);

    }
}
