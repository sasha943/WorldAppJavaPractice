// 3.1. Заменить все числа, которые делятся на 5 без остачи в двухмерной матрице на 8

public class Week3_task31 {
    public static void main(String[] args) {

        int[][] matrix = generateMarix(3, 5, 10, 99);

        System.out.println("Givet array:");
        printMatrix(matrix);

        System.out.println("\nAll multiple 5 values replaced by 8");
        printMatrix(replaceM5by8(matrix));


    }
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

    public static int[][] replaceM5by8(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] % 5 == 0) matrix[i][j] = 8;
            }
        }
        return matrix;
    }
}
