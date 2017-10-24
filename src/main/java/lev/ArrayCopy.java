//3) Заданы два массива одинаковой длинны с любыми значениями скопировать данные из первого массива во второй

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCopy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input array length: ");
        int arrayLength = input.nextInt(); //Array length
        int[] array1 = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++){
            array1[i] = (int)(Math.random() * 100);
        }
        int[] array2 = new int[arrayLength];
        System.out.println("Input array = " + Arrays.toString(array1));
        System.out.println("Second array = " + Arrays.toString(array2));

        for (int i = 0; i < arrayLength; i++){
            array2[i] = array1[i];
        }
        System.out.println("Copy first array to second: \n" + Arrays.toString(array2));
    }
}
