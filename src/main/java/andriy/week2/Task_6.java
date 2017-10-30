//6) Найти среднее арифметическое массива

package main.java.andriy.week2;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Task_6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array length");

        int arrLength = scan.nextInt();
        int[] array = new int[arrLength];

        for (int i = 0; i < arrLength; i++) {

            array[i] = (int)(Math.random()*100);
        }
        System.out.println("Generated array " + Arrays.toString(array));

        int arrSum = 0;

        for (int i = 0; i < arrLength; i++) {
            arrSum = arrSum + array[i];
        }
        double average = (double)(arrSum/(arrLength));

        System.out.println("Average value is " + average);
    }
}
