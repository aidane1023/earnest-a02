/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 aidan earnest
 */

package exercise15;

import java.util.Scanner;

public class Solution15 {

    /*
        Store internal password = ('password' = "Passw0rd")
        Print "What is the password?"
        'attempt' = get int from user
        If ('attempt' = 'password')
            Then
            Print "Welcome!"
        Else
        Print "I don't know you."
     */

    private static final String password = "Passw0rd";

    private static void userInterface() {
        //print prompt
        System.out.println("What is the password?");
        String attempt = in.nextLine();

        //test against stored password
        if (password.equals(attempt)) {
            System.out.println("Welcome!");
        }
        else {
            System.out.println("I don't know you");
        }

    }

    public static void main(String[] args) {
        userInterface();
    }
    private static final Scanner in = new Scanner(System.in);
}
