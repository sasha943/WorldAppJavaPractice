//6) Найти среднее арифметическое массива

import java.util.Arrays;

public class ArrayAverage {
    public static void main(String[] args) {

        int arrayLength = 6;
        int maxValue = 100;
        float sum = 0;

        int[] randomArray = new int[arrayLength];            //creating random array
        for (int i=0; i<randomArray.length; i++){
            randomArray[i] = (int)(Math.random() * maxValue);
        }
        System.out.println(Arrays.toString(randomArray));

        for (int i = 0; i < randomArray.length; i++){            //calculation sum of array values
            sum += randomArray[i];
        }

        System.out.println("Average of array = " + sum / randomArray.length);
    }
}
