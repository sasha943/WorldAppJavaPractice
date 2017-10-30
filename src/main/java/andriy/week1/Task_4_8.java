//4.8. Вводим два числа, сравнить последнии цифры этих чисел (пользоваться оператором %)
			/*124    4    -   true
                    1456   567  -   false
                    1      2    -   false
                    18     98   -   true*/

package main.java.andriy.week1;

import java.util.Scanner;

public class Task_4_8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first value");
        int firstValue = sc.nextInt();
        System.out.println("Enter the second value");
        int secondValue = sc.nextInt();

        if ( firstValue % 10 == secondValue % 10 ) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}

