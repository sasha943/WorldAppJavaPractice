//  2.4 Сдвинуть массив на заданное количество позиций // {1,2,3,4,5} -> 2 = {4,5,1,2,3}; {1,2,3,4,5} -> 3 = {3,4,5,1,2}
//  Количество позиций и массив указывает пользователь

import java.util.Arrays;

public class Task7_4 {
    public static void main(String[] args) {
        int arrayLength = 8;
        int minValue = 0;
        int maxValue = 100;
        int shift = 1;

        int[] arr = new int[arrayLength];
        arr = arrayRandomValues(arr, minValue, maxValue);
        System.out.println("Given array: " + Arrays.toString(arr));

        System.out.println("Shifted on " + shift + " positions: " + Arrays.toString(shiftArray(arr, shift)));
    }

    public static int[] arrayRandomValues(int[] array, int minValue, int maxValue){
        for (int i = 0; i < array.length; i++){
            array[i] = minValue + (int)(Math.random() * maxValue);
        }
        return array;
    }

    private static int[] shiftArray(int[] arr, int shift){
        int[] arr1 = new int[arr.length];
        shift = shift % arr.length;                     //in case if shift > length of array
        int j;
        for (int i=0; i<arr1.length; i++){
            j = i + shift;
            if (j > arr1.length-1) j = j - arr1.length;
            arr1[j] = arr[i];
        }
        return arr1;
    }
}
