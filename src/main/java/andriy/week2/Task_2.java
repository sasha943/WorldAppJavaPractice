//  Поменять местами наибольший и наименьший элементы в массиве
package main.java.andriy.week2;

import java.util.Scanner;
import java.util.Arrays;

public class Task_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array1 length");
        int arrLength = scan.nextInt();
        int[] array = new int[arrLength];

        for (int i = 0; i < arrLength; i++) {

            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("Generated array " + Arrays.toString(array));

        int maxValue = array[0];
        int minValue = array[0];
        int indexMax = 0;
        int indexMin = 0;

        for (int i = 0; i < array.length; i++) {

            {
                if (maxValue < array[i]) {
                    maxValue = array[i];
                    indexMax = i;
                }
                if (minValue > array[i]) {
                    minValue = array[i];
                    indexMin = i;
                }

            }
        }

        System.out.println("Max value of array is " + maxValue);
        System.out.println("Min value of array is " + minValue);

        array[indexMax] = minValue;
        array[indexMin] = maxValue;
        System.out.println("Generated array " + Arrays.toString(array));
    }
}

