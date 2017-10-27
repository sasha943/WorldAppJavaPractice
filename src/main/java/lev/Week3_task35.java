/* 3.5. а) Поменять наибольшую строку массива с наименьшей в двухмерном массиве. (Размер - сумма элементов в строке)
        b) Поменять наибольший и наименьший столбик в двухмерном массиве.
*/

import static main.java.lev.Matrixx.generateStringMarix;
import static main.java.lev.Matrixx.printMatrix;

public class Week3_task35 {
    public static void main(String[] args) {

        int rows = 5;
        int columns = 5;
        int minLength = 1;
        int maxLength = 16;
        String[][] matrix = new String[rows][columns];

        matrix = generateStringMarix(rows, columns,minLength,maxLength);
        System.out.println("Given matrix:");
        printMatrix(matrix);

        System.out.println();
        System.out.println("MIN and MAX strings exchanged:");
        printMatrix(minMaxExchange(matrix));
    }

    public static String[][] minMaxExchange(String[][] matrix){
        int[] minIndex = new int[2];            // index of shortest string
        int[] maxIndex = new int[2];            // index of longest string
        String minString = matrix[0][0];        // value of shortest string
        String maxString = matrix[0][0];        // value of longest string
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                if (matrix[i][j].length() > maxString.length()){
                    maxString = matrix[i][j];
                    maxIndex[0] = i;
                    maxIndex[1] = j;
                }
                if (matrix[i][j].length() < minString.length()){
                    minString = matrix[i][j];
                    minIndex[0] = i;
                    minIndex[1] = j;
                }
            }
        }
        matrix[maxIndex[0]][maxIndex[1]] = minString;
        matrix[minIndex[0]][minIndex[1]] = maxString;
        return matrix;
    }
}
