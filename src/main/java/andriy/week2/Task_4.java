package main.java.andriy.week2;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array length");

        int arrLength = scan.nextInt();
        int[] array = new int[arrLength];

        System.out.println("Enter value for count");
        int valueForSearch = scan.nextInt();
        int numOfValues = 0;

        for (int i = 0; i < arrLength; i++) {
            Random randomGenerator = new Random();
            array[i] = randomGenerator.nextInt(10);
        }
        System.out.println("Generated array " + Arrays.toString(array));

        for (int i = 0; i < arrLength; i++) {

            if (valueForSearch == array[i]) numOfValues++;
        }

        System.out.println("Number of values is " + numOfValues);


    }

}


