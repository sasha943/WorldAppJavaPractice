/*      Ввод пароля.
        Написать программу ввода пароля пользователя. Пользователь вводит пароль 2 раза.
        Пароль должен удовлетворять следующим требованиям:
        - длинна пароля должна быть от 8 до 20 символов
        - в пароле должны быть как маленькие так и большие буквы
        - должны быть цифры
        - не должен содержать слов 'password', 'pass', 'gfhjkm'
        - генерировать случайный пароль используя символы: a-z A-Z 0-9 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Week3_task312 {
    public static void main(String[] args) {
//        System.out.print("Enter password: ");
//        Scanner scan = new Scanner(System.in);
//        String password = scan.next();

        String password = "R07098098a";

        System.out.println(isValidPassword(password));

    }

    public static boolean isValidPassword(String password){
        int minLength = 8;
        int maxLength = 20;

        if (password.length() < minLength || password.length() > maxLength) return false;

        Pattern badWords = Pattern.compile("password|pass|gfhjkm");
        Matcher bad = badWords.matcher(password);
        if (bad.find()) return false;

        Pattern smallLetters = Pattern.compile("[a-z]");
        Matcher small = smallLetters.matcher(password);
        if (!small.find()) return false;

        Pattern capitalLetters = Pattern.compile("[A-Z]");
        Matcher capital = capitalLetters.matcher(password);
        if (!capital.find()) return false;

        Pattern digits = Pattern.compile("[0-9]");
        Matcher digit = digits.matcher(password);
        if (!digit.find()) return false;

        return true;
    }
}
