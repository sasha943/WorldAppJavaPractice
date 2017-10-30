package main.java.andriy.week1_additional;
import java.util.Scanner;
public class Practice_Strings_Not_Hometask {
    public static void main(String[] args) {
        String helloString = new String();
        helloString = "Hello World!";

        int s = helloString.length();
        System.out.println(helloString);
        System.out.println(helloString.length());  // string length
        System.out.println(s);

        if (helloString.length() >= 5 && helloString.contains("Hello")) {   // .equals for comparing strings
            System.out.println("Hello present");                                         // string1.equalsIgnoreCase (string2) - comparing strings, A or a does not mean
        }
        else {
            System.out.println("Hello absent");
        }

        System.out.println(helloString.substring(1)); // string.substring(start index)
        System.out.println(helloString.substring(1, 3)); // string.substring(start index, stop index after n chars)
    }
}

        // str.charAt(index) - returns symbol with index

                    // String loop
        //for (int i = 0; i < str.length(); i++) {
        // do something at index i
        //        }