// Eсть два массива одинаковой длины arr1 и arr2 вывести в консоль значения массива, который получается в результате суммы arr1[i] + arr2[i]
package main.java.andriy.week2;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Task_8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter arrays length");

        int arrLength = scan.nextInt();
        int[] array1 = new int[arrLength];
        int[] array2 = new int[arrLength];
        int[] sumArray = new int[arrLength];

        for (int i = 0; i < arrLength; i++) {
            Random randomGenerator = new Random();
            array1[i] = randomGenerator.nextInt(500);
            array2[i] = randomGenerator.nextInt(500);
            sumArray[i] = array1[i] + array2[i];
        }
        System.out.println("Generated array 1 " + Arrays.toString(array1));
        System.out.println("Generated array 2 " + Arrays.toString(array2));
        System.out.println("Generated array 2 " + Arrays.toString(sumArray));

    }
}