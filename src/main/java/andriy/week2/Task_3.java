// Заданы два массива одинаковой длинны с любыми значениями скопировать данные из первого массива во второй
package main.java.andriy.week2;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Task_3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter arrayOne length");

        int arrLength = scan.nextInt();

        int[] arrayOne = new int[arrLength];
        int[] arrayTwo = new int[arrLength];

        for (int i = 0; i < arrLength; i++) {
            Random randomGenerator = new Random();
            arrayOne[i] = randomGenerator.nextInt(500);
            arrayTwo[i] = randomGenerator.nextInt(1000);
        }
        System.out.println("Generated array #1 " + Arrays.toString(arrayOne));
        System.out.println("Generated array #2 " + Arrays.toString(arrayTwo));

        for (int i = 0; i < arrLength; i++) {
            arrayOne[i] = arrayTwo[i];
        }
        System.out.println();
        System.out.println("Generated array #1 " + Arrays.toString(arrayOne));
        System.out.println("Generated array #2 " + Arrays.toString(arrayTwo));

    }

}
