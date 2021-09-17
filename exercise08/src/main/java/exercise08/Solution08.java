/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 aidan earnest
 */

package exercise08;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution08 {

    /*
        Print "How many people?"
        'people' = get int from user
        Print "How many pizzas?"
        'pizza' = get int from user
        Print "How many slices per pizza?"
        'slice' = get int from user
        'total' = 'slice' * 'pizza'
        Print "'people' people with 'pizza' pizza(s) ('slice')"
        'count' = slice / people
        'remainder' = slice % people
        Print "Each person will receive 'count' slice(s) of pizza."
        Print "there is 'remainder' slice(s) leftover."
     */

    private static int readIntFromUser(String prompt) {
        //get prompted integers
        System.out.println(prompt);
        return in.nextInt();
    }
    double calcSliceCount(double x, double y, int z) {
        //get slice count
        if (z == 0) {
            return  x * y;
        }
        if (z == 1){
            return y / x;
        }
        else {
            return y % x;
        }
    }

    public static void main(String[] args) {
        Solution08 app = new Solution08();

        //prompt for and read in user input
        int people = readIntFromUser("How many people?");
        int pizza = readIntFromUser("How many pizzas?");
        int slice = readIntFromUser("How many slices to each pizza?");

        //calc total, split and remainder
        double total = app.calcSliceCount(pizza, slice,0);
        double count = app.calcSliceCount(people, total, 1);
        double remain = app.calcSliceCount(people, total, 2);
        DecimalFormat format = new DecimalFormat("#");

        //return print statements
        System.out.println(people+" people with "+pizza+" pizza(s) ("+format.format(total)+ " slices)");
        System.out.println("Each person will receive "+format.format(count)+" slice(s) of pizza.");
        System.out.println("There will be "+format.format(remain)+" slices leftover.");
    }
    private static final Scanner in = new Scanner(System.in);
}
