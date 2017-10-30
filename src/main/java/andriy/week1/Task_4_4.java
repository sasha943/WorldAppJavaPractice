//4.4. Вводим число с плавающей точкой с консоли, и проверяем лежит ли оно в диапазоне от 0 до 1


package main.java.andriy.week1;

import java.util.Scanner;

public class Task_4_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value");
        float inputValue = sc.nextFloat();

        if ( inputValue >= 0 && inputValue <= 1 ) {
            System.out.println("Value is in range [0....1]");
        }
        else {
            System.out.println("Value is not in range [0....1]");
        }
    }
}
