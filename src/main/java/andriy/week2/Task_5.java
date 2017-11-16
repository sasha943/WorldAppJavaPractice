//Заполнить массив случайными значениями. На четных индексах парные значения, на нечетных непарные
package main.java.andriy.week2;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array length");

        int arrLength = scan.nextInt();
        int[] array = new int[arrLength];

        for (int i = 0; i < arrLength; i++) {
            if (i % 2 == 0) {
                array[i] = (int) (Math.random() * 200) * 2;
            } else {
                array[i] = (int) (Math.random() * 200) * 2 + 1;
            }
        }
        System.out.println("Generated array " + Arrays.toString(array));
    }
}
