// 2.1 Инвертировать массив (без использования допольнительного массива)

import java.util.Arrays;

public class Task7_1 {
    public static void main(String[] args) {

        int arrayLength = 10;
        int minValue = 0;
        int maxValue = 100;

        int[] arr = new int[arrayLength];
        arr = arrayRandomValues(arr, minValue, maxValue);

        System.out.println("Given    array: " + Arrays.toString(arr));

        System.out.println("Inverted array: " + Arrays.toString(arrayInvert(arr)));
    }
    public static int[] arrayRandomValues(int[] array, int minValue, int maxValue){
        for (int i = 0; i < array.length; i++){
            array[i] = minValue + (int)(Math.random() * maxValue);
        }
        return array;
    }
    public static int[] arrayInvert(int[] array){
        int tmp = 0;
        for (int i = 0; i < array.length/2; i++){
            tmp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = tmp;
        }
        return array;
    }
}
