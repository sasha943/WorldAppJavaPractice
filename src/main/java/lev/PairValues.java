//9) Задать два массива случайными числами от 25 до 75. Определить у какого из массивов больше парных елементов.

import java.util.Arrays;

public class PairValues {
    public static void main(String[] args) {

        int array1Length = 8;
        int array2Length = 7;
        int minValue = 25;
        int maxValue = 75;

        int[] array1 = new int[array1Length];            //creating 2 random arrays
        int[] array2 = new int[array2Length];
        for (int i=0; i<array1.length; i++){
            array1[i] = minValue + (int)(Math.random() * maxValue);
        }
        for (int i=0; i<array2.length; i++){
            array2[i] = minValue + (int)(Math.random() * maxValue);
        }
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));

        int counter = 0;                                //counting even numbers
        for (int i=0; i<array1.length; i++){
            if (array1[i] % 2 == 0) counter++;
        }
        for (int i=0; i<array2.length; i++){
            if (array2[i] % 2 == 0) counter--;
        }

        if (counter > 0) System.out.println("array1 WINS!");
        else if (counter < 0) System.out.println("array2 WINS!");
        else System.out.println("DRAW");
    }
}

