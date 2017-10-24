//Вывести в консоль элементы той половины одномерного массива у которой среднее арифметическое максимальное
package main.java.andriy.week2;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Task_7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array length");

        int arrLength = scan.nextInt();
        int halfArrayLength = arrLength / 2;
        int[] array = new int[arrLength];

        if (arrLength % 2 == 0) {
            for (int i = 0; i < arrLength; i++) {
                Random randomGenerator = new Random();
                array[i] = randomGenerator.nextInt(500);
            }
            System.out.println("Generated array " + Arrays.toString(array));

            int maxFirstHalfAverage = 0;
            int maxSecondHalfAverage = 0;

            for (int i = 0; i < halfArrayLength; i++) {
                maxFirstHalfAverage = maxFirstHalfAverage + array[i];
            }

            for (int i = halfArrayLength; i < arrLength; i++) {
                maxSecondHalfAverage = maxSecondHalfAverage + array[i];
            }
            System.out.println("First half average is " + maxFirstHalfAverage);
            System.out.println("Second half average is " + maxSecondHalfAverage);

            if ((maxFirstHalfAverage / halfArrayLength) > (maxSecondHalfAverage / halfArrayLength)) {
                for (int i = 0; i < halfArrayLength; i++) {
                    System.out.print(array[i] + " ");
                }

            } else {
                if ((maxFirstHalfAverage / halfArrayLength) < (maxSecondHalfAverage / halfArrayLength)) {
                    for (int i = halfArrayLength; i < arrLength; i++) {
                        System.out.print(array[i] + " ");
                    }
                } else {
                    System.out.println("The average arithmetic of the array's halfs are the same " + maxFirstHalfAverage);
                }

            }


        }
        else System.out.println("Array has odd number of elements");


    }

}



