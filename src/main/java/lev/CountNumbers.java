//4) Посчитать сколько цифр(цифра задается пользователем) в массиве

import java.util.Arrays;
import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input array length: ");
        int n = input.nextInt();        //Array length
        int[] array1 = new int[n];
        for (int i = 0; i < n; i++) {
            array1[i] = (int) (Math.random() * 10000);
        }
        System.out.println("Array: " + Arrays.toString(array1));
        System.out.println();
        System.out.print("Input number or count: ");
        int number = input.nextInt();   //number for counting
        int counter = 0;
        int tmp;
        for (int i = 0; i < n; i++) {
            tmp = array1[i];
            while (tmp % 10 != tmp) {
                if (tmp % 10 == number) counter++;
                tmp = tmp / 10;
            }
            if (tmp % 10 == number) counter++;
        }
        System.out.println(counter);
    }
}