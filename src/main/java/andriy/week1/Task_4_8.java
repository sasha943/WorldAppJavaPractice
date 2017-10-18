package main.java.andriy.week1;

import java.util.Scanner;

public class Task_4_8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first value");
        int a = sc.nextInt();
        System.out.println("Enter the second value");
        int b = sc.nextInt();

        if ( a % 10 == b % 10 ) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}

