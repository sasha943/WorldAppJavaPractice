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

    public static String[][] generateStringMarix(int rows, int columns, int minLength, int maxLength){
        String[][] matrix = new String[rows][columns];
        String str;
        char randomChar;
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                int strLength = minLength + (int)(Math.random() * (maxLength - minLength));
                str = "";
                for (int k = 0; k < strLength; k++){
                    randomChar = (char) (65 + (int)(Math.random() * 57));       // generating random char of latin alphabet
                    if (randomChar > 90 && randomChar < 97) {                   // excluding symbols []\^_`
                        k--;
                        continue;
                    }
                    str = str + randomChar;
                }
                matrix[i][j] = str;
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix){             // print matrix with int values
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (j > 0) System.out.print(" ");
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void printMatrix(boolean[][] matrix){         // reload method for boolean values
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (j > 0) System.out.print(" ");
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void printMatrix(String[][] matrix){         // reload method for String values
        int maxStringLength = matrix[0][0].length();
        for (int i = 0; i < matrix.length; i++){                // finding length of the longest element of array
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j].length() > maxStringLength) maxStringLength = matrix[i][j].length();
            }
        }
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j]);
                System.out.print(stringOfSpaces(maxStringLength - matrix[i][j].length() + 1));
            }
            System.out.println();
        }
    }

    public static String stringOfSpaces(int length){            // returns string of required number of spaces
        String str = "";
        for (int i = 0; i < length; i++){
            str = str + " ";
        }
        return str;
    }
}
