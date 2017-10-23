package main.java.andriy.week1_additional;
import java.util.Scanner;
public class Task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first side of the triangle");
        int a = sc.nextInt();
        System.out.println("Enter the first side of the triangle");
        int b = sc.nextInt();
        System.out.println("Enter the first side of the triangle");
        int c = sc.nextInt();

        if (((a + b) > c) && ((b + c) > a) && ((c + a) > b)) {
            if ((a == Math.sqrt(b * b + c * c)) || (b == Math.sqrt(a * a + c * c)) || (c == Math.sqrt(a * a + b * b))) {
                System.out.println("The triangle is rectangular");
            } else {
                System.out.println("The triangle is not rectangular");
                    }
        }
        else {
            System.out.println("Triangle does not exist");
            }
    }
}
