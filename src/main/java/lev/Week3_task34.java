/*3.4. Создать массив, который будет состоять из диагонали матрици

        1 3 5
        4 5 7  -  1 5 6
        4 5 6*/

import java.util.Arrays;

import static main.java.lev.Matrixx.generateMarix;
import static main.java.lev.Matrixx.printMatrix;

public class Week3_task34 {
    public static void main(String[] args) {

        int[][] matrix = generateMarix(4, 5, 10, 99);
        printMatrix(matrix);

        System.out.println("Diagnal array:");
        System.out.println(Arrays.toString(diagonalArray(matrix)));
    }


    public static int[] diagonalArray(int[][] matrix){
        int arrayLength = Math.min(matrix.length, matrix[0].length);
        int[] diagonalArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++){
            diagonalArray[i] = matrix[i][i];
        }
        return diagonalArray;
    }
}
