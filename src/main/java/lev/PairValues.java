//9) Задать два массива случайными числами от 25 до 75. Определить у какого из массивов больше парных елементов.

import java.util.Arrays;

public class PairValues {
    public static void main(String[] args) {

        int arrayLength = 10;
        int minValue = 25;
        int maxValue = 75;

        int[] array1 = new int[arrayLength];            //creating 2 random arrays
        int[] array2 = new int[arrayLength];
        for (int i=0; i<array1.length; i++){
            array1[i] = minValue + (int)(Math.random() * maxValue);
            array2[i] = minValue + (int)(Math.random() * maxValue);
        }
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));

        System.out.print("Sum array: ");
        for (int i=0; i<array1.length; i++){            //calculation of sums of arrays' values
            System.out.print(array1[i] + array2[i] + " ");
        }
    }
}
