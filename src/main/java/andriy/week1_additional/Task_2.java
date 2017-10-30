//2) Ввести с клавиатуры три числа, положительные возвести в куб, а отрица-
//тельные заменить на 0.


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

            System.out.println("a = " + Math.pow(a , 3));
                    }
        else {
            if (a < 0){
                a = 0;
                System.out.println("a = " + a);
            }
            else {System.out.println("a = " + a);}

        }

        if (b > 0) {

            System.out.println("b = " + Math.pow(b , 3));
        }
        else {
            if (b < 0){
                b = 0;
                System.out.println("b = " + b);
            }
            else {System.out.println("b = " + b);}

        }

        if (c > 0) {

            System.out.println("c = " + Math.pow(c , 3));
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
