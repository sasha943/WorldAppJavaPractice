//2) Поменять местами наибольший и наименьший элементы в массиве

import java.util.Arrays;
import java.util.Scanner;

public class SwitchMinMax{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input array length: ");
        int n = input.nextInt();                    //Array length
        int[] array1 = new int[n];
        for (int i=0; i<n; i++){
            array1[i] = (int)(Math.random() * 100);
        }
        System.out.println("Input array is \n" + Arrays.toString(array1));
        System.out.println();

        int min = array1[0];
        int max = array1[0];
        int tmp;
        int maxIndex = 0;
        int minIndex = 0;
        for (int i=1; i<n; i++){
            if (max < array1[i]){
                max = array1[i];
                maxIndex = i;
            }
            if (min > array1[i]){
                min = array1[i];
                minIndex = i;
            }
        }
        tmp = array1[maxIndex];
        array1[maxIndex] = array1[minIndex];
        array1[minIndex] = tmp;

        System.out.println("Output array is \n" + Arrays.toString(array1));
    }
}