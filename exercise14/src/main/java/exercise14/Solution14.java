/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 aidan earnest
 */

package exercise14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Objects;
import java.util.Scanner;

public class Solution14 {

    /*
        Print "What is the order amount?"
        'amount' = get double from user
        Print "What is the state (abbreviation)?"
        'state' = get string from user
        'total' = amount
        If 'state' = WI
            Then
            'tax' = 'amount' * 0.055
            'total' = 'amount' + 'tax'
            Print "The subtotal is $'amount'."
            Print "The tax is $'tax'."
        Print "The total is $'total'."
     */

    private void userInterface(String prompt, int x) throws IOException {
        //print prompt
        System.out.println(prompt);
        if (x == 1) {
            amount = in.nextDouble();
        }
        if (x == 2) {
            state = reader.readLine();
            gate = 1;
        }
        if (gate == 1) {
            gate = 0;
            taxWisconsinRes();
        }
    }

    private void taxWisconsinRes() throws IOException {
        //determine residence
        double tax = 0;
        if (Objects.equals(state, "WI")) {
            tax = amount * 0.055;
            userInterface("The subtotal is: $"+amount+".",3);
            userInterface("The tax is: $"+tax+".", 3);
        }


        //round to penny
        double base = amount + tax;
        double round = Math.round(base * 100);
        round = round / 100;

        if (base > round) {
            round = round + 0.01;
        }

        DecimalFormat format = new DecimalFormat("#.##");

        //output print statement

        userInterface("The total is: $"+format.format(round)+".", 3 );
    }

    public static void main(String[] args) throws IOException {
        Solution14 app = new Solution14();

        //prompt for and read in user input
        app.userInterface("What is the order amount?", 1);
        app.userInterface("What is the state (abbreviation)?", 2);
    }
    private static final Scanner in = new Scanner(System.in);
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private double amount;
    private int gate = 0;
    private String state;
}