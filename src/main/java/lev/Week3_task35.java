/* 3.5. а) Поменять наибольшую строку массива с наименьшей в двухмерном массиве. (Размер - сумма элементов в строке)
        b) Поменять наибольший и наименьший столбик в двухмерном массиве.
*/

import static main.java.lev.Matrixx.generateStringMarix;
import static main.java.lev.Matrixx.printMatrix;

public class Week3_task35 {
    public static void main(String[] args) {

        printMatrix(generateStringMarix(4,4,1,7));
    }
}
