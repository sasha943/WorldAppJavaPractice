// 2.3 Посчитать колличество букв 'a' в строке (искомый символ может быть разным)

public class Task7_3 {
    public static void main(String[] args) {
        String str = "aiuahaiufhauiuhfaa";
        char a = 'a';
        int count = 0;

        for (int i=0; i<str.length(); i++){
            if (str.charAt(i) == a) count++;
        }
        System.out.println("String: " + str + "\ncontains char '" + a + "' " + count + " times");
    }
}
