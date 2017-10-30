//5) Заполнить массив случайными значениями. На четных индексах парные значения, на нечетных непарные

import java.util.Arrays;

public class RandomValuesOddEven {
    public static void main(String[] args) {

        int arrayLength = 10;
        int maxValue = 100;

        int[] array1 = new int[arrayLength];
        for (int i=0; i<arrayLength; i++){
            if (i%2 == 0) array1[i] = (int)(Math.random() * maxValue/2)*2;
            else array1[i] = (int)(Math.random() * maxValue/2)*2 + 1;
        }

        System.out.println(Arrays.toString(array1));
    }
}
