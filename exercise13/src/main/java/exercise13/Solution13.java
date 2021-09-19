/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 aidan earnest
 */

package exercise13;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution13 {

    /*
        Print "Enter the principal:"
        'principal' = get int from user
        Print "Enter the rate of interest (in percent):"
        'rate' = get double from user
        Print "Enter the number of years:"
        'time' = get int from user
        Print "What is the number of times the interest is compounded per year?"
        'comp' = get int from user
        'worth' = 'principal' * (1 + 'rate' / 'comp') * ('comp' * 'time')
        Print "After 'time' years at 'rate'%, the investment will be worth $'worth'."
     */

    private static double userInterface(String prompt, int x) {
        //print prompt
        System.out.println(prompt);
        if (x == 1) {
            return in.nextDouble();
        }
        return 1;

    }

    double calcInterest(double principal, double rate, double time, double comp) {
        //calc Interest based on inputs
        double base = principal * Math.pow(1 + ((rate / 100) / comp), (time * comp));
        double round = Math.round(base * 100);
        round = round / 100;

        if (base > round) {
            round = round + 0.01;
        }
        return round;
    }

    public static void main(String[] args) {
        Solution13 app = new Solution13();

        //prompt for and read in user input
        double principal = userInterface("What is the principal:", 1);
        double rate = userInterface("What is the rate of interest:", 1);
        double time = userInterface("What is the number of years:", 1);
        double comp = userInterface("What is the number of times the interest is compounded per year?", 1);

        // call calc method in order to call in test
        double worth = app.calcInterest(principal, rate, time, comp);
        DecimalFormat format = new DecimalFormat("#.##");


        //output print statement
        userInterface("After "+time+" years at "+rate+"%, the investment will be worth $"+format.format(worth)+".", 2);
    }

    private static final Scanner in = new Scanner(System.in);
}
