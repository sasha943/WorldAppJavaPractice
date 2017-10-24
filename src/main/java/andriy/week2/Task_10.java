package main.java.andriy.week2;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Task_10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array length");
        int arrLength = scan.nextInt();

        int[] array = new int[arrLength];

            for (int i = 0; i < arrLength; i++) {
            Random randomGenerator = new Random();
            array[i] = randomGenerator.nextInt(500);
        }
        System.out.println("Generated array " + Arrays.toString(array));

        System.out.println("Enter start number of element (of new Array)");
        int start = scan.nextInt();

        System.out.println("Enter end number of element (of new Array)");
        int end = scan.nextInt();

        int[] newArr = new int[end - start + 1];

        for (int i = 0; i < end - start +1; i++){
                newArr[i] = array[start + i];
            }

        System.out.println("Splitted array " + Arrays.toString(newArr));


    }
}
