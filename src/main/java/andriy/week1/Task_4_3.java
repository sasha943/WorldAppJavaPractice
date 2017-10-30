//4.3. Пользователь вводит число. Вывести на экран его удвоенное значение, если число делится на 7 нацело.

package main.java.andriy.week1;

import java.util.Scanner;

public class Task_4_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value");
        int inputValue = sc.nextInt();

        if (( inputValue % 7) == 0) {
            System.out.println(inputValue * 2);
            }

        }
    }
