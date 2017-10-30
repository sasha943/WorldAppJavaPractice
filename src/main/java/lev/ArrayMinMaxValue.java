//1) Найти минимальное и максимальное значения в массиве и вывести их на консоль

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMinMaxValue{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input array length: ");
        int n = input.nextInt(); //Array length
        int[] array1 = new int[n];
        for (int i = 0; i < n; i++){
            array1[i] = (int)(Math.random() * 100);
        }
        System.out.println("Input array is \n" + Arrays.toString(array1));
        System.out.println();

        int min = array1[0];
        int max = array1[0];
        for (int i=1; i<n; i++){
            if (max < array1[i]) max = array1[i];
            if (min > array1[i]) min = array1[i];
        }

        System.out.println("Min value: " + min);
        System.out.println("Max value: " + max);
    }
}