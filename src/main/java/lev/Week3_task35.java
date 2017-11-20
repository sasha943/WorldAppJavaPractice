/* 3.5. а) Поменять наибольшую строку массива с наименьшей в двухмерном массиве. (Размер - сумма элементов в строке)
        b) Поменять столбики с наибольшим и наименьшим количеством символов в двухмерном массиве.
*/

import static main.java.lev.MatrixActions.generateStringMarix;
import static main.java.lev.MatrixActions.printMatrix;

public class Week3_task35 {
    public static void main(String[] args) {

        int rows = 4;
        int columns = 6;
        int minLength = 1;
        int maxLength = 12;
        String[][] matrix = new String[rows][columns];

        matrix = generateStringMarix(rows, columns,minLength,maxLength);
        System.out.println("Given matrix:");
        printMatrix(matrix);

        System.out.println();
        System.out.println("MIN and MAX strings had swapped:");
        printMatrix(minMaxExchange(matrix));

        System.out.println();
        System.out.println("MAX and MIN columns had swapped:");
        printMatrix(minMaxColumnsExchange(matrix));

    }

    public static String[][] minMaxExchange(String[][] matrix){
        int[] minIndex = new int[2];            // index of shortest string
        int[] maxIndex = new int[2];            // index of longest string
        String minString = matrix[0][0];        // value of shortest string
        String maxString = matrix[0][0];        // value of longest string
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
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

    public static String[][] minMaxColumnsExchange(String[][] matrix){
        int maxColumnIndex = 0;
        int minColumnIndex = 0;
        int sumOfLength;
        int maxColumnSum = 0;
        int minColumnSum = 0;

        for (int j = 0; j < matrix[0].length; j++){
            sumOfLength = 0;
            for (int i = 0; i < matrix.length; i++){
                sumOfLength += matrix[i][j].length();
            }
            if (maxColumnSum < sumOfLength){
                maxColumnSum = sumOfLength;
                maxColumnIndex = j;
            }
            if (minColumnSum > sumOfLength || minColumnIndex == 0){
                minColumnSum = sumOfLength;
                minColumnIndex = j;
            }
        }

        String[] tmpColumn = new String[matrix[0].length];
        for (int i = 0; i < matrix.length; i++){
            tmpColumn[i] = matrix[i][maxColumnIndex];
            matrix[i][maxColumnIndex] = matrix[i][minColumnIndex];
            matrix[i][minColumnIndex] = tmpColumn[i];
        }
        return matrix;
    }
}
