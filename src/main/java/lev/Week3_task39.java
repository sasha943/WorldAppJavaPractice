// Умножить две матрицы

import static main.java.lev.MatrixActions.generateMarix;
import static main.java.lev.MatrixActions.printMatrix;

public class Week3_task39 {
    public static void main(String[] args) {

        int rows1 = 4;
        int columns1 = 2;
        int rows2 = columns1;
        int columns2 = 5;
        int minValue = 1;
        int maxValue = 9;

        int[][] matrix1 = generateMarix(rows1, columns1, minValue, maxValue);
        System.out.println("---------First Matrix-----------");
        printMatrix(matrix1);

        int[][] matrix2 = generateMarix(rows2, columns2, minValue, maxValue);
        System.out.println("---------Second Matrix-----------");
        printMatrix(matrix2);

        System.out.println("---------Matrix Product-----------");
        printMatrix(matrixProduct(matrix1, matrix2));
    }

    public static int[][] matrixProduct(int[][] matrix1, int[][] matrix2){
        int[][] matrix = new int[matrix1.length][matrix2[0].length];

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                for (int k = 0; k < matrix2.length; k++){
                    matrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return matrix;
    }
}
