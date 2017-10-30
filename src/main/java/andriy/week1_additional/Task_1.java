//1) Ввести с клавиатуры значения трех сторон треугольника a, b и c и опреде-
//лить, является ли он прямоугольным. Ответ вывести в виде сообщения.

package main.java.andriy.week1_additional;
import java.util.Scanner;
public class Task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first side of the triangle");
        int sideA = sc.nextInt();
        System.out.println("Enter the first side of the triangle");
        int sideB = sc.nextInt();
        System.out.println("Enter the first side of the triangle");
        int sideC = sc.nextInt();

        if (((sideA + sideB) > sideC) && ((sideB + sideC) > sideA) && ((sideC + sideA) > sideB)) {
            if ((sideA == Math.sqrt(sideB * sideB + sideC * sideC)) || (sideB == Math.sqrt(sideA * sideA + sideC * sideC)) || (sideC == Math.sqrt(sideA * sideA + sideB * sideB))) {
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
