/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 aidan earnest
 */

package exercise11;

import java.util.Scanner;

public class Solution11 {

    /*
        Print "How many Euros are you exchanging?"
        'euro' = get double from user
        Print "What is the current exchange rate?"
        'rate' = get double from user
        'dollar' = 'euro' * 'rate'
        Print "'euro' euros at an exchange rate of 'rate' is 'dollar' U.S. dollars."
     */

    private static double userInterface(String prompt, int x) {
        //print prompt
        System.out.println(prompt);
        if (x == 1) {
            return in.nextDouble();
        }
        return 1;

    }

    double convertToDollar(double euro, double rate) {
        //calc dollar based on inputs
        double base = (euro * rate);
        double round = Math.round(base * 100);
        round = round / 100;

        if (base > round) {
            round = round + 0.01;
        }
        return round;
    }

    public static void main(String[] args) {
        Solution11 app = new Solution11();

        //prompt for and read in user input
        double euro = userInterface("How many Euros are you exchanging?", 1);
        double rate = userInterface("What is the current exchange rate?", 1);

        // call calc method split off to test
        double dollar = app.convertToDollar(euro, rate);


        //output print statement
        userInterface(euro + " Euros at an exchange rate of " + rate + " is " + dollar + " U.S. dollars.", 2);
    }

    private static final Scanner in = new Scanner(System.in);
}
