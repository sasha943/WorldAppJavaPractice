// 3.1. Заменить все числа, которые делятся на 5 без остачи в двухмерной матрице на 8

import static main.java.lev.Matrixx.generateMarix;
import static main.java.lev.Matrixx.printMatrix;

public class Week3_task31 {
    public static void main(String[] args) {

        int[][] matrix = generateMarix(3, 5, 10, 99);

        System.out.println("Given array:");
        printMatrix(matrix);

        System.out.println("\nAll multiple 5 values replaced by 8");
        printMatrix(replaceM5by8(matrix));
    }

    public static int[][] replaceM5by8(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] % 5 == 0) matrix[i][j] = 8;
            }
        }
        return matrix;
    }
}
