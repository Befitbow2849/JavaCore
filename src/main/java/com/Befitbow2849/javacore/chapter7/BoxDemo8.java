package com.Befitbow2849.javacore.chapter7;

class Box8{
    double width;
    double height;
    double depth;

    Box8(double w, double h, double d){
        width = w;
        height = h;
        depth = d;


    }
    Box8(){
        width = -1;
        height = -1;
        depth = -1;
    }
    Box8(double len){
        width=height=depth=len;


    }
    double Volume (){
        return width * height * depth;
    }


}


public class BoxDemo8 {
    public static void main(String[] args) {
        Box8 mybox1 = new Box8(10,20,15);
        Box8 mybox2 = new Box8();
        Box8 mybox3 = new Box8(7);
        double vol;
        vol = mybox1.Volume();
        vol = mybox2.Volume();
        vol = mybox3.Volume();
    }
}
