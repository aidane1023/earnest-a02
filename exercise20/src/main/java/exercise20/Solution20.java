/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 aidan earnest
 */

package exercise20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Objects;
import java.util.Scanner;

public class Solution20 {

    /*
        Print "What is the order amount?"
        'amount' = get double from user
        Print "What is the state (abbreviation)?"
        'state' = get string from user
        'total' = amount
        If 'state' = WI
            Then
            Print "What county do you live in?"
            'county' = get string from user
            if 'county' = Eau Claire
                'tax' = 'amount' * 0.055
                Print "The tax is $'tax'."
            if 'county' = Dunn
                'tax' = 'amount' * 0.054
                Print "The tax is $'tax'."
        If 'State' = IL
            Then
            'tax' = 'amount' * 0.008
            Print "The tax is $'tax'."
        'total' = 'amount' + tax
        Print "The total is $'total'."
     */

    private static int promptCount = 0;
    private static String state = "";
    private static String county = "";
    private static double amount;
    private static double tax;

    private static void userInterface(String prompt, int promptCount) throws IOException {
        //single print statement
        System.out.println(prompt);

        //conditionals for reading in
        if (promptCount == 2) {
            county = reader.readLine();
            countyTax();
        }
        if (promptCount == 1) {
            state = reader.readLine();
            taxMidWest();
        }
        if (promptCount == 0) {
            amount = in.nextDouble();
            promptCount++;
            userInterface("What state do you live in?", promptCount);

        }
    }

    private static void getTotals() throws IOException {
        //round to penny
        System.out.println(tax);
        double base = amount + tax;
        double round = Math.round(base * 100);
        round = round / 100;

        if (base > round) {
            round = round + 0.01;
        }

        DecimalFormat format = new DecimalFormat("#.##");

        //output print statement
        if (tax > 0) {
            userInterface("The tax is $"+format.format(tax)+".\nThe total is: $"+format.format(round)+".",10);
        }
        userInterface("The total is: $"+format.format(round)+".", 10);
    }

    private static void countyTax() throws IOException {
        tax = amount * 0.05;
        if (Objects.equals(county, "Eau Claire")) {
            tax = tax + 0.005;
        }
        if (Objects.equals(county, "Dunn")) {
            tax = tax + 0.004;
        }
        getTotals();
    }
    private static void taxMidWest() throws IOException {
        if (Objects.equals(state, "WI")) {
            promptCount = 2;
            userInterface("What county do you live in?", promptCount);
        }
        if (Objects.equals(state, "IL")) {
            tax = amount * 0.08;
        }
        else {
            tax = 0;
        }
        getTotals();
    }

    public static void main(String[] args) throws IOException {
        userInterface("What is the order amount?", promptCount);
    }
    private static final Scanner in = new Scanner(System.in);
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
}
