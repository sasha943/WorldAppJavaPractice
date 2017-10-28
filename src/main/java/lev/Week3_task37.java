// 3.7. Найти самое длинное слово в строке(разделенное одним пробелом)

public class Week3_task37 {
    public static void main(String[] args) {
        String str = "На сегодняшний момент язык Java является одним из самых распространенных и популярных языков программирования";
        System.out.println("Given string:      " + str);

        System.out.println("\nThe longest word:  " + getMaxWord(str));
    }
    public static String getMaxWord(String str){
        String[] words = str.split(" ");
        String maxWord = "";
        for (String word: words){
            if (word.length() > maxWord.length()) maxWord = word;
        }
        return maxWord;
    }
}
