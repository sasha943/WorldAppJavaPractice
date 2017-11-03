//3.1. Заменить все числа, которые делятся на 5 без остачи в двухмерной матрице на 8
package main.java.andriy.week3;

import main.java.andriy.week3.Method.ArrayUtils;

import java.util.Scanner;

public class Task_3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of matrix lines");
        int linesNum = sc.nextInt();
        System.out.println("Enter number of matrix columns");
        int columnsNum = sc.nextInt();
        System.out.println("Enter the range of values");
        int valuesRange = sc.nextInt();
        System.out.println("Created array :");

        int[][] matrixArray = ArrayUtils.generateMatrix(linesNum, columnsNum, valuesRange);
        ArrayUtils.printMatrix(matrixArray, linesNum, columnsNum);

        int[][] newMatrixArray = new int[linesNum][columnsNum];
        for (int i = 0; i < linesNum; i++) {
            for (int j = 0; j < columnsNum; j++) {
                if (matrixArray[i][j] == 5){
                    newMatrixArray[i][j] = 8;
                }
                else{
                    newMatrixArray[i][j] = matrixArray[i][j];
                }
            }

        }
        System.out.println("Modifyed array :");
        ArrayUtils.printMatrix(newMatrixArray, linesNum, columnsNum);
    }

}
