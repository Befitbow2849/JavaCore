package com.Befitbow2849.javacore.chapter8;

class Box{
    double width;
    double height;
    double depth;

    Box(Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;

    }

    Box (double w, double h, double d){
        width = w;
        height = h;
        depth = d;


    }

    Box (){
        width = -1;
        height = -1;
        depth = -1;
    }

    Box (double len){
        width = height = depth = len;
    }

    double volume (){
        return width * height * depth;
    }



}

class BoxWight extends Box{

    double weight;
    BoxWight(double w, double h, double d, double m){
        weight = w;
        height = h;
        depth = d;
        weight = m;
    }



}


public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWight mybox1 = new BoxWight(10, 20,30,34.3);
        BoxWight mybox2 = new BoxWight(2,3,4,0.76);
        double vol;
        vol = mybox1.volume();
        vol = mybox2.volume();
    }
}
