//7) Вывести в консоль элементы той половины одномерного массива у которой среднее арифметическое максимальное

import java.util.Arrays;

public class GreaterHalfOfArray {
    public static void main(String[] args) {

        int arrayLength = 1;    // if arrayLength is odd, length of second half of array will be 1 greater
        int maxValue = 100;

        int[] array1 = new int[arrayLength];            //creating random array
        for (int i=0; i<array1.length; i++){
            array1[i] = (int)(Math.random() * maxValue);
        }
        System.out.println("Random array: " + Arrays.toString(array1));

        float sum1 = 0;
        float sum2 = 0;

        for (int i=0; i<array1.length; i++){            //calculation average of each half
            if (i < array1.length/2) sum1 += array1[i];
            else sum2 += array1[i];
        }

        if (sum1/(array1.length/2) >= sum2/(array1.length - array1.length/2)){
            for (int i=0; i<array1.length/2; i++) System.out.print(array1[i] + " ");
        }
        else{
            for (int i=array1.length/2; i<array1.length; i++) System.out.print(array1[i] + " ");
        }
    }
}
