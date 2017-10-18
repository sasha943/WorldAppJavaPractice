package main.java.andriy.week1;

import java.util.Scanner;

public class Task_4_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first integer value");
        int a = sc.nextInt();
        System.out.println("Enter second integer value");
        int b = sc.nextInt();
        System.out.println("Enter third integer value");
        int c = sc.nextInt();

        int BiggestNumber;
        int SmallestNumber;

        if (a == b && a == c && b == c) {
            System.out.println("All digits are the same");
        }
        else {
            if (a > b)
            { if (b > c) {
                BiggestNumber = a;
                SmallestNumber = c;
                System.out.println("The biggest number is " + BiggestNumber);
                System.out.println("The smallest number is " + SmallestNumber);
            }
            else {
                BiggestNumber = a;
                SmallestNumber = b;
                System.out.println("The biggest number is " + BiggestNumber);
                System.out.println("The smallest number is " + SmallestNumber);
            }}
            else { if (b > c) {
                BiggestNumber = b;
                SmallestNumber = c;
                System.out.println("The biggest number is " + BiggestNumber);
                System.out.println("The smallest number is " + SmallestNumber);
            }
            else {
                BiggestNumber = c;
                SmallestNumber = a;
                System.out.println("The biggest number is " + BiggestNumber);
                System.out.println("The smallest number is " + SmallestNumber);
            }
            }
        }
    }
}
