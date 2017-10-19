//6) Найти среднее арифметическое массива

import java.util.Arrays;

public class ArrayAverage {
    public static void main(String[] args) {

        int arrayLength = 6;
        int maxValue = 100;
        float avg = 0;

        int[] array1 = new int[arrayLength];            //creating random array
        for (int i=0; i<array1.length; i++){
            array1[i] = (int)(Math.random() * maxValue);
        }
        System.out.println(Arrays.toString(array1));

        for (int i=0; i<array1.length; i++){            //calculation average of array
            avg += array1[i];
        }
        avg = avg / array1.length;

        System.out.println("Average of array = " + avg);
    }
}
