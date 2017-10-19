//8) Eсть два массива одинаковой длины arr1 и arr2 вывести в консоль значения массива, который получается в результате суммы arr1[i] + arr2[i]

import java.util.Arrays;

public class ArraySum {
    public static void main(String[] args) {

        int arrayLength = 10;
        int maxValue = 100;

        int[] array1 = new int[arrayLength];            //creating 2 random arrays
        int[] array2 = new int[arrayLength];
        for (int i=0; i<array1.length; i++){
            array1[i] = (int)(Math.random() * maxValue);
            array2[i] = (int)(Math.random() * maxValue);
        }
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));

        System.out.print("Sum array: ");
        for (int i=0; i<array1.length; i++){            //calculation of sums of arrays' values
            System.out.print(array1[i] + array2[i] + " ");
        }
    }
}
