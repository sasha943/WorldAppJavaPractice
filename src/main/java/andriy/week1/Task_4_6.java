package main.java.andriy.week1;

import java.util.Scanner;

public class Task_4_6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first value");
        int a = sc.nextInt();
        System.out.println("Enter the second value");
        int b = sc.nextInt();
        int sum = a + b;

        if (11 <= sum && sum <= 19) {
            System.out.println(sum);
        }
    }
}



