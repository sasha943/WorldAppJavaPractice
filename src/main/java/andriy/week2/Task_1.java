// Найти минимальное и максимальное значения в массиве и вывести их на консоль
package main.java.andriy.week2;
import java.util.Scanner;
import java.util.Arrays;

public class Task_1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array length");

        int arrLength = scan.nextInt();
        int[] array = new int[arrLength];

        for (int i = 0; i < arrLength; i++) {

            array[i] = (int)(Math.random()*100);
            }
            System.out.println("Generated array " + Arrays.toString(array));

        int maxValue = array[0];
        int minValue = array[0];
        int i = 1;
        while (i < arrLength) {
            if (maxValue < array[i]) {
                maxValue = array[i];
            }
            if (minValue > array[i]) {
                minValue = array[i];
            }
            i++;
        }

        System.out.println("Max value of array is " + maxValue);
        System.out.println("Min value of array is " + minValue);


    }
}
