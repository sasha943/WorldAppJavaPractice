//3. Матрицы генерировать случайными числами и размер матрицы вводит юзер.
package main.java.andriy.week3;
import main.java.andriy.week3.Method.ArrayUtils;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of matrix lines");
        int linesNum = sc.nextInt();
        System.out.println("Enter number of matrix columns");
        int columnsNum = sc.nextInt();
        System.out.println("Enter the range of values");
        int valuesRange = sc.nextInt();

        int[][] matrixArray = ArrayUtils.generateMatrix(linesNum, columnsNum, valuesRange);
        ArrayUtils.printMatrix(matrixArray, linesNum, columnsNum);
    }
}
