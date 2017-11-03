// 3.1. Заменить все числа, которые делятся на 5 без остачи в двухмерной матрице на 8

import static main.java.lev.MatrixActions.generateMarix;
import static main.java.lev.MatrixActions.printMatrix;

public class Week3_task31 {
    public static void main(String[] args) {

        int[][] matrix = generateMarix(3, 5, 10, 99);

        System.out.println("Given array:");
        printMatrix(matrix);

        int multipler2find = 5;
        int number4replace = 8;

        System.out.println("\nAll multiple " + multipler2find + " values replaced by " + number4replace);
        printMatrix(replaceValues(matrix, multipler2find, number4replace));
    }

    public static int[][] replaceValues(int[][] matrix, int multipler2find, int number4replace){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] % multipler2find == 0) matrix[i][j] = number4replace;
            }
        }
        return matrix;
    }
}
