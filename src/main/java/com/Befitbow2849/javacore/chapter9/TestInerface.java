/*package com.Befitbow2849.javacore.chapter9;
interface  IntStacka {
    void push (int item);
    int pop();
}

class FixedStack implements IntStacka{
    private int stek[];
    private int tos;

    FixedStack(int size){
        stek = new int[size];
        tos = - 1;
    }

    void push (int item){
        if (tos == stek.length - 1) System.out.println("Стек полон");
        else
            stek[++tos] = item;

    }
    int pop (){
        if(tos<0){ System.out.println("Стек не загружен");
        return 0;}
        else return stek[tos --];
    }


}
class DynStack implements IntStacka{
    private int stek[];
    private int tos;

    DynStack(int size){
        stek = new int[size];
        tos = -1;
    }

    void push(int item){
        if (tos == stek.length-1) {
            int temp[] = new int[stek.length*2];
            for (int i = 0; i < stek.length; i++) temp[i] = stek[i];
            stek = temp;
            stek[++tos] = item;
        }
        else stek[++tos] = item;
    }
    int pop(){
        if (tos<0) {
            System.out.println("Не загружен");
            return 0;
        }
        else return stek[tos--];
    }

}

public class TestInerface {
    public static void main(String[] args) {
        FixedStack stak1 = new FixedStack(9);
        FixedStack stak2 = new FixedStack(15);
        for (int i = 0; i < 9; i++) stak1.push(i);
        for (int i = 0; i < 15; i ++) stak2.push(i);
        System.out.println();
    }
}
*/