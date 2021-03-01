package com.Befitbow2849.javacore.chapter8;
class Box3{
    private double width;
    private double height;
    private double depth;

    Box3(Box3 ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;


    }

    Box3(double w, double h, double d){
        height = h;
        width = w;
        depth = d;

    }

    Box3(){
        height = -1;
        width = -1;
        depth = -1;


    }

    Box3(double len){
        width=height=depth=len;
    }

    double volume(){
        return width * height * depth;

    }

}

class BoxWeight extends Box3{
    double weight;
    BoxWeight(double w, double h, double d, double m){
        super(w, h, d);
        weight = m;
    }
    BoxWeight(BoxWeight ob){
        super(ob);
        weight = ob.weight;


    }
    BoxWeight(double len, double m){
        super(len);
        weight = m;
    }
    BoxWeight(){
        super();
        weight = -1;
    }


}


class Shipment extends BoxWeight{
    double cost;

    Shipment(double w, double h, double d, double m, double c){
        super(w, h, d, m);
        cost = c;


    }
    Shipment(Shipment ob){
        super(ob);
        cost = ob.cost;
    }
    Shipment(){
        super();
        cost = -1;
    }
    Shipment(double len, double m, double c){
        super(len, m);
    }


}

public class DemoShipment {
    public static void main(String[] args) {
        double vol;
        Shipment ob1 = new Shipment(10,20,30,40,50);
        vol = ob1.volume();

    }
}
