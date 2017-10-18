package main.java.andriy.week1;

import java.util.Scanner;

public class Task_4_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value");
        int a = sc.nextInt();

        if (( a % 7) == 0) {
            int DoubleValue = a * 2;
            System.out.println(DoubleValue);
            }

        }
    }
