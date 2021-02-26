package com.Befitbow2849.javacore.chapter6;
class Stack{
    int stek[] = new int[10];
    int tos;

    //Инициализировать вершину стэка

    Stack(){
        tos = -1;
    }
    //Разместить элемент
    void push (int item){
        if (tos == 9) System.out.println("Стэк заполнен");
        else stek [++tos] = item;
    }
    int pop (){
        if (tos < 0){
            System.out.println("Стэк не загружен");
            return 0;
        }
        else return stek[tos--];
    }


}
public class TestStack {
    public static void main(String[] args) {
    Stack mystak1 = new Stack();
    Stack mystak2 = new Stack();

    for (int i = 0; i<10; i++) mystak1.push(i);
        for (int j = 0; j<10; j++) mystak2.push(j);
        System.out.println("Содержимое стэка 1: ");
        for (int i =0; i<10; i++) System.out.print(mystak1.pop());
        System.out.println("Содержимое стэка 2: ");
        for (int i =0; i<10; i++) System.out.print(mystak2.pop());

    }
}
