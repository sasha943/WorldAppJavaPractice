package main.java.andriy.week2;
import java.util.Scanner;
import java.util.Arrays;

public class Task_10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array length");
        int arrLength = scan.nextInt();
        int[] array = new int[arrLength];
        System.out.println("Enter array start index");
        int start = scan.nextInt();
        System.out.println("Enter array end index");
        int end = scan.nextInt();

        for (int i = 0; i < arrLength; i++) {

            array[i] = (int) (Math.random() * 500);
        }
        System.out.println("Generated array " + Arrays.toString(array));

        System.out.println("Splitted array " + Arrays.toString(splitArray(array, start, end)));

    }

        public static int[] splitArray(int[] array, int start, int end) {

            int[] array1 = new int[end - start + 1];

            for (int i = 0; i < array1.length; i++) {
                array1[i] = array[start + i];
            }
            return array1;
        }




}
