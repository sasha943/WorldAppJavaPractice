// Задать два массива случайными числами от 25 до 75. Определить у какого из массивов больше парных елементов.
package main.java.andriy.week2;
import java.util.Scanner;
import java.util.Arrays;

public class Task_9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter arrays length");

        int arrLength = scan.nextInt();
        int[] array1 = new int[arrLength];
        int[] array2 = new int[arrLength];
        int evenElementsArr1 = 0;
        int evenElementsArr2 = 0;

        for (int i = 0; i < arrLength; i++) {
            array1[i] = 20 + (int)(Math.random()*50);
            array2[i] = 20 + (int)(Math.random()*50);
            if (array1[i] % 2 == 0) evenElementsArr1++;
            if (array2[i] % 2 == 0) evenElementsArr2++;
        }

        System.out.println("Generated array 1 " + Arrays.toString(array1));
        System.out.println("Generated array 2 " + Arrays.toString(array2));

        if (evenElementsArr1 > evenElementsArr2) {
            System.out.println("Even elements more in Array1 = " + evenElementsArr1);
        }
        else if (evenElementsArr1 < evenElementsArr2){
            System.out.println("Even elements more in Array2 = " + evenElementsArr2);
            }
            else System.out.println("Number of even elements is the same in both arrays");

    }
}
