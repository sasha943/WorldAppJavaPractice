package main.java.andriy.week1;

import java.util.Scanner;

public class Task_4_7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first value");
        int a = sc.nextInt();
        System.out.println("Enter the second value");
        int b = sc.nextInt();
        int ost = a % b;

        if ( ost == 0 ) {
            System.out.println("True " + "Celoe =" + (a/b) + " ostacha =" + ost);
        }
        else {
            System.out.println("False " + "Celoe =" + (a/b) + " ostacha =" + ost);
        }
    }
}


