//3.4. Создать массив, который будет состоять из диагонали матрици

package main.java.andriy.week3;

import main.java.andriy.week3.Method.ArrayUtils;
import java.util.Arrays;
import java.util.Scanner;

public class Task_3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of matrix lines");
        int linesNum = sc.nextInt();
        System.out.println("Enter number of matrix columns");
        int columnsNum = sc.nextInt();
        System.out.println("Enter the range of values");
        int valuesRange = sc.nextInt();


        int[][] matrixArray = ArrayUtils.generateMatrix(linesNum, columnsNum, valuesRange);
        int diagonalLength = Math.min(linesNum, columnsNum);
        ArrayUtils.printMatrix(matrixArray, linesNum, columnsNum);

        int [] diagonalArray = new int[diagonalLength];
        int arrIndex = 0;
        for (int i = 0; i < diagonalLength; i++) {
            for (int j = 0; j < columnsNum; j++) {
                if (i == j){
                    diagonalArray[arrIndex] = matrixArray[i][j];
                    arrIndex++;
                }
            }
        }
        System.out.println("Diagonal array " + Arrays.toString(diagonalArray));
    }
}
