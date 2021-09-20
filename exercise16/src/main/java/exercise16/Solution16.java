/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 aidan earnest
 */

package exercise16;

import java.util.Scanner;

public class Solution16 {
    private static int age = 0;

    /*
        Print "How old are you?"
        'age' = get int from user
        'result' =
                if age >=16 "You are old enough to drive."
                if age < 16 "You are not old enough to drive."
        Print 'result'
     */


    private static void userInterface() {
        //initial prompt
        String result = "How old are you?";

        //ternary operator situational
        if (age > 0 ) {
            result = (age >= 16) ? "You are old enough to legally drive." : "You are not old enough to legally drive.";
        }

        //single print statement
        System.out.println(result);

        //read in user input from initial prompt and cycle back to print response
        if (age == 0) {
            age = in.nextInt();
            userInterface();
        }
    }

    public static void main(String[] args) {
        userInterface();
    }
    private static final Scanner in = new Scanner(System.in);
}