// Повернуть матрицу(Двухмерный массив). Матрица квадратная. Пользователь вводит угол кратный 90.

import static main.java.lev.Matrixx.generateMarix;
import static main.java.lev.Matrixx.printMatrix;

public class Week3_task311 {
    public static void main(String[] args) {

        int matrixSize = 2;
        int rotateAngle = 90;  // must be multiple of 90

        int[][] matrix = generateMarix(matrixSize, matrixSize, 10, 99);
        printMatrix(matrix);

        System.out.println("Rotated matrix:");
        printMatrix(rotateMatrix(matrix, rotateAngle));

    }
    public static int[][] rotateMatrix(int[][] matrix, int rotateAngle){
        int timesToRotate = (rotateAngle / 90) % 4;
        for (int i = 0; i < timesToRotate; i++) matrix = rotateMatrix90(matrix);
        return matrix;
    }

    public static int[][] rotateMatrix90(int[][] matrix){
        int[][] rotatedMatrix = new int [matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                rotatedMatrix[i][j] = matrix[matrix.length - j - 1][i];
            }
        }
        return rotatedMatrix;
    }
}
