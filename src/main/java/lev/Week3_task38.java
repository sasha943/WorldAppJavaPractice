// Напишите программу, которая позволяет пользователю ввести в консоли строку,
// переводит первый символ слов в верхний регистр и результат выводит в консоль

public class Week3_task38 {
    public static void main(String[] args) {
        String str = "на сегодняшний момент язык Java является одним из самых распространенных и популярных языков программирования";

        System.out.println(firstLetterToUpperCase(str));
    }

    public static String firstLetterToUpperCase(String str){
        boolean prevSpace = true;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) != ' '){
                if (prevSpace){
                str = str.substring(0, i) + str.substring(i, i + 1).toUpperCase() + str.substring(i + 1);
                prevSpace = false;
                }
            }
            else prevSpace = true;
        }
        return str;
    }
}
