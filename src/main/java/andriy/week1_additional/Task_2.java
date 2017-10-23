package main.java.andriy.week1_additional;
import java.util.Scanner;
public class Task_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first integer value");
        int a = sc.nextInt();
        System.out.println("Enter second integer value");
        int b = sc.nextInt();
        System.out.println("Enter third integer value");
        int c = sc.nextInt();

        if (a > 0) {
            a = a*a*a;
            System.out.println("a = " + a);
                    }
        else {
            if (a < 0){
                a = 0;
                System.out.println("a = " + a);
            }
            else {System.out.println("a = " + a);}

        }

        if (b > 0) {
            b = b*b*b;
            System.out.println("b = " + b);
        }
        else {
            if (b < 0){
                b = 0;
                System.out.println("b = " + b);
            }
            else {System.out.println("b = " + b);}

        }

        if (c > 0) {
            c = c*c*c;
            System.out.println("c = " + c);
        }
        else {
            if (c < 0){
                c = 0;
                System.out.println("c = " + c);
            }
            else {System.out.println("c = " + c);}

        }
    }
}
