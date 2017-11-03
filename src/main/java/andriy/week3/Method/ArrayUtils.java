package main.java.andriy.week3.Method;
import java.util.Random;
public class ArrayUtils {

    public static int[] generateArray (int size, int range) {

        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*range);
        }
        return arr;
    }




    public static int[][] generateMatrix (int linesNum, int columnsNum, int range){
        int arr [][] = new int [linesNum][columnsNum];
        for (int i = 0; i < linesNum ; i++) {
            for (int j = 0; j < columnsNum ; j++) {
                 arr[i][j] = (int)(Math.random()*range);
            }
        }
        return arr;
    }


    public static void printMatrix (int[][] array, int linesNum, int columnsNum){
        for (int i = 0; i < linesNum; i++) {
            for (int j = 0; j < columnsNum; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static boolean[][] generateLogicMatrix (int linesNum, int columnsNum){
        boolean arr [][] = new boolean[linesNum][columnsNum];
        Random randomGenerator = new Random();
        for (int i = 0; i < linesNum ; i++) {
            for (int j = 0; j < columnsNum ; j++) {
                arr[i][j] = randomGenerator.nextBoolean();
            }
        }
        return arr;
    }

    public static void printLogicMatrix (boolean[][] array, int linesNum, int columnsNum){
        for (int i = 0; i < linesNum; i++) {
            for (int j = 0; j < columnsNum; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }

    }



}
