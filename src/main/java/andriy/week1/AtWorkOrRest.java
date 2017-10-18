package main.java.andriy.week1;

import java.util.Scanner;

public class AtWorkOrRest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("What time is now?");
        int CurrentTime = sc.nextInt();

        boolean CorrectTimeCheck = CurrentTime >= 0 && CurrentTime <= 24;
        boolean StatusCheck = CurrentTime >= 9 && CurrentTime <= 18;

        String message = " ";


        if (CorrectTimeCheck) {

            if (StatusCheck) {
                message = "I'm at work now";
            } else {
                message = "I'm at home now";
            }
            System.out.println(message);

        } else {
            System.out.println("You entered not correct time, be more attentive please");
        }
    }
}
