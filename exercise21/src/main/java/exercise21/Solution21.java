/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 aidan earnest
 */

package exercise21;

import java.util.Scanner;

public class Solution21 {
    /*
        Print "Enter a number for month of the year:"
        'month' = get int from user
        'mon' = array of month names
        switch 'month' for corresponding string in array
        Print "The name of the month is 'mon['month']'."
     */

    private static int month = 0;

    private static void userInterface (String prompt) {
        Scanner sc = new Scanner(System.in);

        //single print statement
        System.out.println(prompt);

        //read in int and commit switch
        if (month == 0) {
            month = sc.nextInt();
            String[] mon = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
            if (month > 12 || month < 1) {
                userInterface("No month associated with the number" + month);
            } else {
                userInterface("The name of the month is "+mon[month - 1]+".");
            }
        }
    }
    public static void main (String[] args) {
        userInterface("Enter a number for month of the year:");
    }
    private static final Scanner in = new Scanner(System.in);
}
