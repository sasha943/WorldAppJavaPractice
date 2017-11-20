package main.java.andriy.week3;

import main.java.andriy.week3.Method.ArrayUtils;

import java.util.Scanner;

public class Task_3_5_b {
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

        int maxColumnSum = 0;
        int maxColumnIndex = 0;
        int minColumnSum = Integer.MAX_VALUE;
        int minColumnIndex = 0;

        for (int j = 0; j < columnsNum; j++) {
            int columnSum = 0;
            for (int i = 0; i < linesNum; i++) {
                columnSum = matrixArray[i][j] + columnSum;
            }
            if (columnSum > maxColumnSum){
                maxColumnIndex = j;
                maxColumnSum = columnSum;

            }
            if ((minColumnSum > columnSum)) {
                minColumnIndex = j;
                minColumnSum = columnSum;

            }
        }
        System.out.println("MaxColumnIndex  " + maxColumnIndex);
        System.out.println("MinColumnIndex  " + minColumnIndex);

        int[] tempArr = new int[linesNum];

        for (int i = 0; i < linesNum; i++) {
            tempArr[i] = matrixArray[i][maxColumnIndex];
            matrixArray[i][maxColumnIndex] = matrixArray[i][minColumnIndex];
            matrixArray[i][minColumnIndex] = tempArr[i];
        }
        ArrayUtils.printMatrix(matrixArray, linesNum, columnsNum);
    }
}
