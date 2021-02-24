package com.Befitbow2849.javacore.chapter6;

class Box5{
    double width;
    double height;
    double depth;
    double volume (){
        return width * height * depth;
    }
    void setDim(double w, double h, double d){
        width = w;
        height = h;
        depth = d;



    }
}

public class BoxDemo5 {
    public static void main(String[] args) {
        double vol;
        Box5 mybox1 = new Box5();
        Box5 mybox2 = new Box5();
        mybox1.setDim(10, 20,15);
        mybox2.setDim(3,6,9);

        vol = mybox1.volume();
        System.out.println(vol + " объем первого");
        vol = mybox2.volume();
        System.out.println(vol + " объем второго");
    }
}