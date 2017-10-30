// 2.2 Проверить или является число простым

public class Task7_2 {
    public static void main(String[] args) {

        int minValue = 1;
        int maxValue = 31;
        int number = minValue + (int)(Math.random() * maxValue);

        System.out.println("Given number: " + number);

        if (isPrime(number)) System.out.println("The number is prime");
        else System.out.println("The number is NOT prime");
    }

    public static boolean isPrime(int number){
        for (int i=2; i<number/2; i++){
            if (number % i == 0) return false;
        }
        return true;
    }
}
