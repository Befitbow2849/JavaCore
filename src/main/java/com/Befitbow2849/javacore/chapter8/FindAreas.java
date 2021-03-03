package com.Befitbow2849.javacore.chapter8;

import jdk.swing.interop.SwingInterOpUtils;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

class Figure{
    double dim1;
    double dim2;

    Figure(double a, double b){
        dim1 = a;
        dim2 = b;
    }
    double area(){
        System.out.println("Площадь не определена");
        return 0;
    }

}

class Rectangle extends Figure{
    Rectangle(double a, double b){
        super(a, b);
    }
    double area(){
        System.out.println("В области четырехугольника.");
        return dim1 * dim2;
    }

}
class Triangle extends Figure{
    Triangle(double a, double b){
        super(a,b);
    }


    double area() {
        return dim1 * dim2 /2;
    }
}


public class FindAreas {
    public static void main(String[] args) {


        Figure f = new Figure(1, 10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(1, 2);
        Figure figref;
        figref = r;
    }
}