//4.6. Вводим два числа, вывести их суму, если она в диапазоне от 11 до 19.

package main.java.andriy.week1;

import java.util.Scanner;

public class Task_4_6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first value");
        int firstValue = sc.nextInt();
        System.out.println("Enter the second value");
        int secondValue = sc.nextInt();
        int sum = firstValue + secondValue;

        if (11 <= sum && sum <= 19) {
            System.out.println(sum);
        }
    }
}



