package com.Befitbow2849.javacore.chapter8;
class Box2{
    private double width;
    private double height;
    private double depth;

    Box2 (Box2 ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;

    }
    Box2 (double w, double h, double d){
        width = w;
        height = h;
        depth = d;

    }
    Box2 (){
        width = -1;
        height = -1;
        depth = -1;

    }
    Box2 (double len){

        width = height = depth = len;

    }

    double volume(){
        return width * height * depth;
    }

}

class Boxweight extends Box2{
    double weight;
    Boxweight(Boxweight ob){
        super(ob);
        weight = ob.weight;
    }



    Boxweight (double w, double h, double d, double m){
        super(w, h, d);
        weight = m;

    }

    Boxweight(double len, double m){
        super(len);
        weight = m;

    }

    Boxweight(){
        super();
        weight = -1;
    }


}



public class DemoSuper {
    public static void main(String[] args) {
        Boxweight mybox1 = new Boxweight(10,20,30,40);
        Boxweight mybox2 = new Boxweight(2,3);
        double vol;
        vol = mybox1.volume();
    }
}
