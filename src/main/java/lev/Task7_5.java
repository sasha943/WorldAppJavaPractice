// 2.5 Заменить в строке все символы 'a' на '@' и вывести новую строку ("array is a data type" -> "@rr@y is @ d@t@ type")

public class Task7_5 {
    public static void main(String[] args) {
        String str = "Life is like riding a bicycle. To keep your balance, you must keep moving";
        char char2find = 'a';
        char char2replace = '@';

        System.out.println(str);
        System.out.println(replaceChar(str, char2find, char2replace));

    }
    public static String replaceChar (String str, char char2find, char char2replace){
        int index = 0;
        while (str.indexOf(char2find, index) >= 0){
            index = str.indexOf(char2find, index);
            str = str.substring(0, index) + char2replace + str.substring(index+1);
        }
        return str;
    }
}
