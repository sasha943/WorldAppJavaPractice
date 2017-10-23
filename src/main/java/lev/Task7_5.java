// 2.5 Заменить в строке все символы 'a' на '@' и вывести новую строку ("array is a data type" -> "@rr@y is @ d@t@ type")

public class Task7_5 {
    public static void main(String[] args) {
        String str = "Life is like riding a bicycle. To keep your balance, you must keep moving";
        char char2find = 'a';
        char char2replace = '@';

        System.out.println(str);
        System.out.println(replaceA(str, char2find, char2replace));

    }
    public static String replaceA (String str, char a, char b){
        int index = 0;
        while (str.indexOf(a, index) >= 0){
            index = str.indexOf(a, index);
            str = str.substring(0, index) + b + str.substring(index+1);
        }
        return str;
    }
}
