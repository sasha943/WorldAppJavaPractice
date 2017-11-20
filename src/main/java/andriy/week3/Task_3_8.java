//Верхний регистр.
//Напишите программу, которая позволяет пользователю ввести в консоли строку переводит первый символ слов в верхний регистр и результат выводит в консоль
package main.java.andriy.week3;

import java.util.Scanner;

public class Task_3_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stringValues = sc.nextLine();
        System.out.println(stringValues);
        LowerToUpper(stringValues);
    }

    static void LowerToUpper(String stringValues) {
        String[] words = stringValues.split(" ");
        String currentWord = new String();
        for (int i = 0; i < words.length; i++) {
            currentWord = (words[i]).substring(0, 1).toUpperCase() + (words[i]).substring(1, words[i].length());
            System.out.print(currentWord + " ");
        }
    }
}
