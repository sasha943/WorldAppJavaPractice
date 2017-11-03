//а) Поменять наибольшую строку массива с наименьшей в двухмерном массиве. (Размер - сумма элементов в строке)
package main.java.andriy.week3;

import main.java.andriy.week3.Method.ArrayUtils;

import java.util.Scanner;

public class Task_3_5_a {
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

        int maxLineSum = 0;
        int maxLineIndex = 0;
        int minLineSum = Integer.MAX_VALUE;
        int minLineIndex = 0;

        for (int i = 0; i < linesNum; i++) {
            int lineSum = 0;
            for (int j = 0; j < columnsNum; j++) {
                lineSum = matrixArray[i][j] + lineSum;
            }
            if (lineSum > maxLineSum) {
                maxLineIndex = i;
                maxLineSum = lineSum;

            }
            if ((minLineSum > lineSum)) {
                minLineIndex = i;
                minLineSum = lineSum;

            }
        }
        System.out.println("MaxLineIndex  " + maxLineIndex);
        System.out.println("MinLineIndex  " + minLineIndex);

        int[] tempArr = new int[columnsNum];

                for (int j = 0; j < columnsNum; j++) {
                    tempArr[j] = matrixArray[maxLineIndex][j];
                    matrixArray[maxLineIndex][j] = matrixArray[minLineIndex][j];
                    matrixArray[minLineIndex][j] = tempArr[j];
                }
        ArrayUtils.printMatrix(matrixArray, linesNum, columnsNum);
        }
    }

