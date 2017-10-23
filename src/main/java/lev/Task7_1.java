// 2.1 Инвертировать массив (без использования допольнительного массива)

import java.util.Arrays;

public class Task7_1 {
    public static void main(String[] args) {

        int arrayLength = 9;
        int minValue = 0;
        int maxValue = 100;

        int[] arr = new int[arrayLength];            //creating random array
        for (int i=0; i<arr.length; i++){
            arr[i] = minValue + (int)(Math.random() * maxValue);
        }
        System.out.println("Given    array: " + Arrays.toString(arr));

        int tmp = 0;                                //inverting
        for (int i=0; i<arr.length/2; i++){
            tmp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = tmp;
        }
        System.out.println("Inverted array: " + Arrays.toString(arr));
    }
}
