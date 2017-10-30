//4.2. Пользователь вводит три числа с консоли, нужно вывести на консоль наибольшее, наименьшее

package main.java.andriy.week1;

import java.util.Scanner;

public class Task_4_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first integer value");
        int value1 = sc.nextInt();
        System.out.println("Enter second integer value");
        int value2 = sc.nextInt();
        System.out.println("Enter third integer value");
        int value3 = sc.nextInt();

        int BiggestNumber;
        int SmallestNumber;

        if (value1 == value2 && value1 == value3 && value2 == value3) {
            System.out.println("All digits are the same");
        }
        else {
            if (value1 > value2){
                if (value2 > value3) {
                BiggestNumber = value1;
                SmallestNumber = value3;
                System.out.println("The biggest number is " + BiggestNumber);
                System.out.println("The smallest number is " + SmallestNumber);
                }
                else {
                BiggestNumber = value1;
                SmallestNumber = value2;
                System.out.println("The biggest number is " + BiggestNumber);
                System.out.println("The smallest number is " + SmallestNumber);
            }}
            else { if (value2 > value3) {
                    BiggestNumber = value2;
                    SmallestNumber = value3;
                    System.out.println("The biggest number is " + BiggestNumber);
                    System.out.println("The smallest number is " + SmallestNumber);
                    }
                    else {
                    BiggestNumber = value3;
                    SmallestNumber = value1;
                    System.out.println("The biggest number is " + BiggestNumber);
                    System.out.println("The smallest number is " + SmallestNumber);
                    }
            }
        }
    }
}
