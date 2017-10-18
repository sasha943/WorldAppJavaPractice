package main.java.andriy.week1;

import java.util.Scanner;

public class Task_4_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value");
        float a = sc.nextFloat();

        if ( a >= 0 && a <= 1 ) {
            System.out.println("Value is in range [0....1]");
        }
        else {
            System.out.println("Value is not in range [0....1]");
        }
    }
}
