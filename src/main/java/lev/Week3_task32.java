// 3.2. Создать логическую матрицу по следующим критериям, если і равно j, то элементом будет true.

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

    public static void printMatrix(boolean[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (j > 0) System.out.print(" ");
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
