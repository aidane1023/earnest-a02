/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 aidan earnest
 */

package exercise17;

import java.util.Scanner;

public class Solution17 {
    /*
        Print "Enter a 1 is you are male or a 2 if you are female:"
        'gender' = get int from user
        repeat if not numeric response
        'ratio' = 0.73 if 'gender' = 1; 'ratio' = 0.66 if 'gender' = 2
        Print "How many ounces of alcohol have you had?"
        'ounces' = get int from user
        repeat if not numeric response
        Print "What is your weight in pounds?"
        'weight' = get int from user
        repeat if not numeric response
         Print "How many hours has it been since your last drink?"
        'time' = get int from user
        repeat if not numeric response
        'BAC' = ('ounces' * 5.14 / 'weight' * 'ratio') - .015 * 'time'
        Print "Your BAC is 'BAC'"
        if BAC > 0.08
            Print "You are not legally allowed to drive."
        else
            Print "You are legally allowed to drive."
     */

    private static void tryCatch (String x) {
        int a = 0;
        try {
            a = Integer.parseInt(x);
        } catch (Exception e) {
            System.out.println("Numerical values only.");
            userInterface(promptCount, a);
        }
        promptCount = promptCount + 1;
        userInterface(promptCount, a);
    }

    private static int promptCount = 1;
    private static double ratio;
    private static int ounce;
    private static int weight;
    private static int time;
    private static String prompt = "";

    static double calcBAC() {
        return (ounce * 5.14 / weight * ratio) - .015 * time;
    }

    private static void userInterface(int promptCount, int x) {
        String response;
        //initial prompt
        if (promptCount == 1) {
            prompt = "Enter a 1 is you are male or a 2 if you are female:";
        }
        //continuation through loops
        if (promptCount == 2 ) {
            prompt =  "How many ounces of alcohol have you had?";

            //for ratio in equation
            if (x == 1) {
                ratio = 0.73;
            }
            if (x == 2) {
                ratio = 0.66;
            }
        }
        if (promptCount == 3 ) {
            prompt =  "What is your weight in pounds?";
            ounce = x;
        }
        if (promptCount == 4) {
            prompt = "How many hours has it been since your last drink?";
            weight = x;
        }
        if (promptCount == 5) {
            time = x;
            double BAC = calcBAC();
            prompt = (BAC >= 0.08) ? "Your BAC is "+BAC+"\nYou are not legally allowed to drive." : "Your BAC is "+BAC+"\nYou are legally allowed to drive.";
        }

        //single print statement
        System.out.println(prompt);
        if (promptCount < 5) {
            response = in.nextLine();

            //run try catch
            tryCatch(response);
        }
    }

    public static void main(String[] args) {
        userInterface(promptCount,0);
    }
    private static final Scanner in = new Scanner(System.in);
}

