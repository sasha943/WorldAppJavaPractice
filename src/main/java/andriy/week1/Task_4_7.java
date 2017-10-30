//4.7. Вводим два числа, если одно из них делиться на другое без остатка, то выводим тру и показываем результат деления (целую часть от деления  и остачу)
				//в другом случае выводим false и показываем результат деления (целую часть от деления  и остачу)

package main.java.andriy.week1;

import java.util.Scanner;

public class Task_4_7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first value");
        int firstValue = sc.nextInt();
        System.out.println("Enter the second value");
        int secondValue = sc.nextInt();
        int reminderOfDivision = firstValue % secondValue;

        if ( reminderOfDivision == 0 ) {
            System.out.println("True " + "Int part =" + (firstValue/secondValue) + " remainder of division =" + reminderOfDivision);
        }
        else {
            System.out.println("False " + "Int part =" + (firstValue/secondValue) + " remainder of division =" + reminderOfDivision);
        }
    }
}


