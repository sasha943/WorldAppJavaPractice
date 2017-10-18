package main.java.andriy.week1;

import java.util.Scanner;


public class Task_4_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first value");
        int a = sc.nextInt();
        System.out.println("Enter the second value");
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("The values are the same");
        } else {
            if (a > b) {
                System.out.println(a - b);
                } else {
                System.out.println(a + b);
            }
        }
    }
}
