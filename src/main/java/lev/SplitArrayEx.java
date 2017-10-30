//10) public static int[] splitArray(int[] arr, int start, int end) { // обрезать массив по границам start и end

import java.util.Arrays;

public class SplitArrayEx {
    public static void main(String[] args) {

        int arrayLength = 16;
        int minValue = 0;
        int maxValue = 100;
        int start = 2;
        int end = 4;

        int[] array1 = new int[arrayLength];            //creating random array
        for (int i=0; i<array1.length; i++){
            array1[i] = minValue + (int)(Math.random() * maxValue);
        }
        System.out.println("Array1: " + Arrays.toString(array1));

        System.out.println("Array1 from " + start + " to " + end + ": " + Arrays.toString(splitArray(array1, start, end)));
    }

    public static int[] splitArray(int[] arr, int start, int end){
        int[] splitedArray = new int[end-start+1];
        for (int i=0; i<splitedArray.length; i++){
            splitedArray[i] = arr[start+i];
        }
        return splitedArray;
    }
}
