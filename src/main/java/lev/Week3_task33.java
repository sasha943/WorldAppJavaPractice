// 3.3. Написать метод, который проверяет является ли строка палиндромом

public class Week3_task33 {
    public static void main(String[] args) {
        String str = "Янукович вивчив окуня";
        System.out.println("Is '" + str + "' palindrome?");
        System.out.println(isPalindrom(str));

        str = "Три психи пили Пилипихи спирт";
        System.out.println("Is '" + str + "' palindrome?");
        System.out.println(isPalindrom(str));
    }

    public static boolean isPalindrom(String str){
        str = str.replaceAll(" ", "");      // Убираем пробелы
        str = str.toLowerCase();                              // Все символы - в нижний регистр
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) return false;
        }
        return true;
    }
}
