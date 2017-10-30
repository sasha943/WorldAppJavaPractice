//4.5. Вводим 2 числа. Если первое число больше второго, то вывести на экран разницу чисел. Если второе больше, то выводим сумму.

package main.java.andriy.week1;

import java.util.Scanner;


public class Task_4_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first value");
        int firstValue = sc.nextInt();
        System.out.println("Enter the second value");
        int secondValue = sc.nextInt();

        if (firstValue == secondValue) {
            System.out.println("The values are the same");
        } else {
            if (firstValue > secondValue) {
                System.out.println(firstValue - secondValue);
                } else {
                System.out.println(firstValue + secondValue);
            }
        }
    }
}
