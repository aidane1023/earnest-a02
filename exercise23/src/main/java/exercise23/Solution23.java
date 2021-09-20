/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 aidan earnest
 */

package exercise23;

import java.util.Scanner;

public class Solution23 {
    /*
        Print "Is the car silent when you turn the key?"
        if yes - Print "Are the battery terminals corroded?"
            if yes - Print "Clean terminals and try starting again."
            else - Print "Replace cables and try again."
        else - Print "Does the car make a slicking noise?"
            if yes - Print "Replace the battery."
            else - Print "Does the car crank up but fail to start?"
                if yes - Print "Check spark plug connections."
                else - Print "Does the engine start and then die?"
                    if yes - Print "Does your car have fuel injection?"
                        if yes - Print "Get it in for service."
                        else - Print "Check to ensure the choke is opening and closing."
                    else - Print "This should not be possible."
     */


    private static void correctResponse() {
        //error catch simplified
        System.out.println("You must respond with either yes or no");
    }

    private static void silent() {
        //first question
        System.out.println("Is the car silent when you turn the key? (yes/no)");
        String response = in.nextLine();
        if (response.equalsIgnoreCase( "yes")) {
            //yes branch
            corroded();
        }
        if (response.equalsIgnoreCase( "no")) {
            //no branch
            slicking();
        }
        else {
            correctResponse();
            silent();
        }
    }
    private static void corroded() {
        //extension of yes branch(silent)
        System.out.println("Are the battery terminals corroded? (yes/no)");
        String response = in.nextLine();
        if (response.equalsIgnoreCase( "yes")) {
            //resolve on yes branch
            System.out.println("Clean terminals and try starting again.");
            System.exit(0);
        }
        if (response.equalsIgnoreCase( "no")) {
            //resolve on no branch
            System.out.println("Replace cables and try again.");
            System.exit(0);
        }
        else {
            correctResponse();
            corroded();
        }
    }
    private static void slicking() {
        //extension of no branch (question 1)
        System.out.println("Does the car make a slicking noise? (yes/no)");
        String response = in.nextLine();
        if (response.equalsIgnoreCase( "yes")) {
            //resolve on yes branch
            System.out.println("Replace the battery.");
            System.exit(0);
        }
        if (response.equalsIgnoreCase( "no")) {
            //no branch extends
            crank();
        }
        else {
            correctResponse();
            slicking();
        }
    }
    private static void crank() {
        //extension of no branch (question 2)
        System.out.println("Does the car crank up but fail to start? (yes/no)");
        String response = in.nextLine();
        if (response.equalsIgnoreCase( "yes")) {
            //resolves with a yes
            System.out.println("Check spark plug connections.");
            System.exit(0);
        }
        if (response.equalsIgnoreCase( "no")) {
            //extends with no
            die();
        }
        else {
            correctResponse();
            crank();
        }
    }
    private static void die() {
        //extension of no (question 3)
        System.out.println("Does the car crank up but fail to start? (yes/no)");
        String response = in.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            //extension with yes
            injection();
        }
        if (response.equalsIgnoreCase("no")) {
            //resolved with confusion
            System.out.println("This should not be possible.");
            System.exit(0);
        }
        else {
            correctResponse();
            die();
        }
    }
    private static void injection() {
        //extension of yes (question 4)
        System.out.println("Does the car crank up but fail to start? (yes/no)");
        String response = in.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            //resolved with yes
            System.out.println("Get it in for service.");
            System.exit(0);
        }
        if (response.equalsIgnoreCase("no")) {
            //resolved with no
            System.out.println("Check to ensure the choke is opening and closing.");
            System.exit(0);
        }
        else {
            correctResponse();
            injection();
        }
    }


    public static void main (String[] args) {
        //begin descent through decision tree
        silent();
    }
    private static final Scanner in = new Scanner(System.in);
}