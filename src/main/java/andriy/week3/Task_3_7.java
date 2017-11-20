//3.7. Найти самое длинное слово в строке(разделенное одним пробелом)
package main.java.andriy.week3;

import java.lang.String;

import java.util.Scanner;

public class Task_3_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String stringValues = sc.nextLine();
        System.out.println(stringValues);
        System.out.println(findMaxWord(stringValues));


    }


    public static String findMaxWord(String stringValues) {
        String[] words = stringValues.split(" ");
        String maxWord = words[0];

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > maxWord.length()) {
                maxWord = words[i];
            }
        }
        return maxWord;
    }
}


