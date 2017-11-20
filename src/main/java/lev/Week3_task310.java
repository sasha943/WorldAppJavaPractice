// Удалить из предложения слова которые повторяются.

public class Week3_task310 {
    public static void main(String[] args) {
        String str = "one two three four five six seven eight nine ten three eleven two twenty six";
        System.out.println("Given string:    " + str);

        System.out.println("No duplications: " + excludeDuplicateWords(str));

    }

    public static String excludeDuplicateWords(String str){
        String[] strArray = str.split(" ");
        for (int i = 0; i < strArray.length; i++){
            for (int j = i + 1; j < strArray.length; j++){
                if (strArray[i].equals(strArray[j])) strArray[j] = "";
            }
        }
        String outString = "";
        for (int i = 0; i < strArray.length; i++){
            if (!strArray[i].equals("")) outString += strArray[i] + " ";
        }

        return outString;
    }
}
