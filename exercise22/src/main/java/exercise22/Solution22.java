/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 aidan earnest
 */

package exercise22;

import java.util.Scanner;

public class Solution22 {
    /*
        Print "Enter the first number:"
        'first' = 'big' = get int from user
        Print "Enter the second number:"
        'second' = get int from user
        if 'big' < 'second'
            'big' = 'second'
        Print "Enter the third number:"
        'third' = get int from user
        if 'big' < 'third'
            'big' = 'third'
        Print "The largest number is 'big'."
     */

    private static int x;
    private static int big = 0;

    private static void userInterface (String prompt) {
        int temp;

        //print statement
        System.out.println(prompt);

        //if else for read in or finish program
        if (x < 3) {
            temp = in.nextInt();
            if (temp > big) {
                big = temp;
            }
            x++;
            userInterface("Enter the next number:");
        }
        if (x == 3) {
            x++;
            userInterface("the biggest number is " + big + ".");
        }
    }

    public static void main (String[] args) {
        userInterface("Enter the first number:");
    }
    private static final Scanner in = new Scanner(System.in);
}
