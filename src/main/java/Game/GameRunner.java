package Game;

import java.util.Scanner;


class GameLogic{

    int comp;
    int user;
    int res;

    GameLogic(Field ob){
        comp = ob.comp;
        user = ob.user;
    }

    int GameResult (){
        if (user == comp) {
            res = 0;
            System.out.println("Победила дружба");
            return res;
        }
        else if
        ((user == 1 && comp == 2) || (user == 2 && comp == 3) || (user == 3 && comp == 1)){
            res = 1;
            System.out.println("Вы победили");
            return res;
        }

        else {
            res = 2;
            System.out.println("Победил кампутер");
            return res;
        }

    }
//Ноль ничья, один юзер, 2 комп
}
class Field {
    int comp;
    int user;
    Field(int c, int u){
        comp = c;
        user = u;
        switch (comp){
            case 1:
                System.out.println("Комп выбрал камень");
                break;
            case 2:
                System.out.println("Комп выбрал ножницы");
                break;
            default:
                System.out.println("Комп выбрал бумагу");
        }
        switch (user){
            case 1:
                System.out.println("Вы выбрали камень");
                break;
            case 2:
                System.out.println("Вы выбрали ножницы");
                break;
            default:
                System.out.println("Вы выбрали бумагу");
        }

}

}

public class GameRunner {
    public static void main(String[] args) {
        boolean newgame_bool = false;
        boolean b = false;
        int user =0;
        int newgame;
        do {
            b = false;
            System.out.println("Выбери свой ход:");
            System.out.println("1-камень; 2-ножницы; 3-бумага");
            Scanner in = new Scanner(System.in);
            String a = in.next();
            try {
                user = Integer.parseInt(a.trim());

                if (user == 1 || user == 2 || user == 3) {
                    int comp = 1 + (int) (Math.random() * 3);
                    Field game1 = new Field(comp,user);
                    GameLogic gamee1 = new GameLogic(game1);
                    int r =gamee1.GameResult();
                    do {
                        System.out.println("Сыграть еще раз ?\n1-да 2-нет");
                        String c = in.next();
                        try {
                            newgame = Integer.parseInt(c.trim());
                            if (newgame == 1)  newgame_bool = true;
                            if (newgame == 2) {
                                b = true;
                                newgame_bool = true;
                            }
                        } catch (NumberFormatException nfe) {
                            System.out.println("Вводи нормально !\n1-да 2-нет");
                        }
                    } while (!newgame_bool);
                }
            }
            catch (NumberFormatException nfe){
                System.out.println("Вводи заново числа а не буквы");
            }


        }while (!b);



    }
}
