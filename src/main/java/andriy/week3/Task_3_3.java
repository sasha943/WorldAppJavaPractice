//3.3. Написать метод, который проверяет является ли строка палиндромом
package main.java.andriy.week3;

import java.util.Scanner;

public class Task_3_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input string value");
        String strValue = sc.next();

        strValue = strValue.toLowerCase();
        char[] charArray = strValue.toCharArray();
        int numOfEquals = 0;

        for (int i = 0; i < charArray.length ; i++) {
            if (charArray[i] == charArray[charArray.length - 1 - i]){
                numOfEquals++;
            }
        }
        System.out.println(charArray.length == numOfEquals ? "String is polidrome" : "String is not polidrome");
    }
}
