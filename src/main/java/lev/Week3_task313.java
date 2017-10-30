// 3.13*. Написать морской бой(1 корабль). Размер поля указывает пользователь. При промахе показывать подсказку.

import java.util.Scanner;

public class Week3_task313 {
    public static void main( String[] args ) {

        int x;
        int y;
        int turnCount = 1;
        Scanner input = new Scanner( System.in);
        System.out.print("Input size of battlefield (from 2 to 20): ");
        int fieldSize = input.nextInt() - 1;

        char[][] field = new char[fieldSize +1][fieldSize + 1];

        for (int i = 0; i < field.length; i++){
            for (int j = 0; j < field[i].length; j++){
                field[i][j] = '-';
            }
        }

        field[(int)(Math.random() * (fieldSize + 1))][(int)(Math.random() * (fieldSize + 1))] = 'S';

        while (true){
            System.out.println("================== TURN " + turnCount + " ==================");
            System.out.print("Input cordinate X from 1 to " + (fieldSize + 1) + " (-1 for exit): ");
            x = input.nextInt() - 1;
            if (x == -2){
                System.out.println("bye bye looser");
                System.exit(0);
            }
            System.out.print("Input cordinate Y from 1 to " + (fieldSize + 1) + " (-1 for exit): ");
            y = input.nextInt() - 1;
            if (y == -2){
                System.out.println("bye bye looser");
                System.exit(0);
            }

            if (field[y][x] == 'S'){
                System.out.println("YOU WIN! THE SHIP IS SUNK");
                field[y][x] = 'X';
                printField(field);
                System.exit(0);
            }
            else if (field[y][x] == '*'){
                System.out.println("You already fired at these coordinates");
            }
            else field[y][x] = '*';

            printField(field);
            turnCount++;
        }
    }

    public static void printField(char[][] field){
        for (int i = 0; i < field.length; i++){
            for (int j = 0; j < field[i].length; j++){
                if (j > 0) System.out.print(" ");
                if (field[i][j] == 'S') System.out.print('-');
                else System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }
}
