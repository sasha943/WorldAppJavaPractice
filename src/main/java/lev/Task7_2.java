// 2.2 Проверить или является число простым

import java.util.Arrays;

public class Task7_2 {
    public static void main(String[] args) {

        int minValue = 0;
        int maxValue = 100;
        int number = minValue + (int)(Math.random() * maxValue);

        System.out.println("Given number: " + number);

        if (isPrime(number)) System.out.println("The number is prime");
        else System.out.println("The number is NOT prime");
    }

    public static boolean isPrime(int number){
        for (int i=2; i<number-1; i++){
            if (number % i == 0) return false;
        }
        return true;
    }
}
