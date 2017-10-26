package main.java.lev;

public class Matrixx {
    public static int[][] generateMarix(int rows, int columns, int minValue, int maxValue){
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                matrix[i][j] = minValue + (int)(Math.random() * (maxValue - minValue));
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (j > 0) System.out.print(" ");
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

}
