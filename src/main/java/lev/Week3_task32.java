// 3.2. Создать логическую матрицу по следующим критериям, если і равно j, то элементом будет true.

import static main.java.lev.Matrixx.printMatrix;

public class Week3_task32 {
    public static void main(String[] args) {

        printMatrix(generateLogicMarix(3, 3));
    }

    public static boolean[][] generateLogicMarix(int rows, int columns){
        boolean[][] matrix = new boolean[rows][columns];
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                matrix[i][j] = i == j;
            }
        }
        return matrix;
    }

}
