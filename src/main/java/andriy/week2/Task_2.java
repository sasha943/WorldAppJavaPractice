//  Поменять местами наибольший и наименьший элементы в массиве
package main.java.andriy.week2;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Task_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array1 length");
        int arrLength = scan.nextInt();
        int[] array = new int[arrLength];

        for (int i = 0; i < arrLength; i++) {
            Random randomGenerator = new Random();
            array[i] = randomGenerator.nextInt(500);
        }
        System.out.println("Generated array " + Arrays.toString(array));

        int maxValue = array[0];
        int minValue = array[0];
        int indexMax = 0;
        int indexMin = 0;
        int i = 1;
        while (i < arrLength) {
            if (maxValue < array[i]) {
                maxValue = array[i];
                indexMax = i;
            }
            if (minValue > array[i]) {
                minValue = array[i];
                indexMin = i;
            }
            i++;
        }

        System.out.println("Max value of array is " + maxValue);
        System.out.println("Min value of array is " + minValue);

        array[indexMax] = minValue;
        array[indexMin] = maxValue;
        System.out.println("Generated array " + Arrays.toString(array));
    }
}

