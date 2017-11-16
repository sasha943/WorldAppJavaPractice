//Требуется найти самую длинную непрерывную цепочку нулей  и единиц в последовательности цифр.

package main.java.andriy.week3;

import java.util.Scanner;

public class Task_3_6 {
    public static void main(String[] args) {

        String stringValues = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string length");
        int strLength = sc.nextInt();

        for (int i = 0; i < strLength; i++) {
            stringValues = stringValues + Math.round(Math.random()) + "";
        }
        System.out.println(stringValues);

        int maxSizeZero = 0;
        int maxSizeOne = 0;

        int sizeZero = 0;
        int sizeOne = 0;

        for (int i = 0; i < strLength; i++) {

            if (stringValues.charAt(i) == '0') {
                sizeZero++;
                if (sizeOne > maxSizeOne) {
                    maxSizeOne = sizeOne;
                }
                sizeOne = 0;
            }
            if (stringValues.charAt(i) == '1') {
                sizeOne++;
                if (sizeZero > maxSizeZero) {
                    maxSizeZero = sizeZero;
                }
                sizeZero = 0;
            }
        }

        System.out.println("Zero indexes max = " + maxSizeZero);
        System.out.println("One indexes max = " + maxSizeOne);

        String arrZero = "";
        for (int i = 0; i < maxSizeZero; i++) {
            arrZero = arrZero + '0';
        }

        String arrOne = "";
        for (int i = 0; i < maxSizeOne; i++) {
            arrOne = arrOne + '0';
        }

        System.out.println("Biggest '0' string indexes -- " + "(" + stringValues.indexOf(arrZero) + "," + (stringValues.indexOf(arrZero) + maxSizeZero - 1) + ")");
        System.out.println("Biggest '1' string indexes -- " + "(" + stringValues.indexOf(arrOne) + "," + (stringValues.indexOf(arrOne) + maxSizeOne - 1) + ")");


    }
}
