//3.2. Создать логическую матрицу по следующим критериям, если і равно j, то элементом будет true.
package main.java.andriy.week3;

import main.java.andriy.week3.Method.ArrayUtils;

import java.util.Scanner;

public class Task_3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of matrix lines");
        int linesNum = sc.nextInt();
        System.out.println("Enter number of matrix columns");
        int columnsNum = sc.nextInt();
        System.out.println("Created array :");

        boolean[][] matrixArray = ArrayUtils.generateLogicMatrix(linesNum, columnsNum);
        ArrayUtils.printLogicMatrix(matrixArray, linesNum, columnsNum);

        boolean[][] newMatrixArray = new boolean[linesNum][columnsNum];
        for (int i = 0; i < linesNum; i++) {
            for (int j = 0; j < columnsNum; j++) {
                if (i == j){
                    newMatrixArray[i][j] = true;
                }
            }

        }
        System.out.println("Modifyed array :");
        ArrayUtils.printLogicMatrix(newMatrixArray, linesNum, columnsNum);
    }

}


