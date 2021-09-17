/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 aidan earnest
 */

package exercise09;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution09 {

    /*
        Print "What is the length of the ceiling in feet?"
        'length' = read int from user
        Print "What is the width of the ceiling in feet?"
        'width' = read int from user
        'area' = 'length' * 'width'
        'count' = (area / 350) rounded up to next whole number
        Print "You will need 'count' gallon(s) of paint to cover the 'area' square foot ceiling."
     */

    private static int readIntFromUser(String prompt) {
        //get prompted dimension
        System.out.println(prompt);
        return in.nextInt();
    }
    double calcRoomArea(double length, double width) {
        //get area
        return length * width;
    }
    double calcGallonCount(double area) {
        //get gallon count
        return Math.ceil(area/350);
    }


    public static void main(String[] args) {
        Solution09 app = new Solution09();

        //prompt for and receive user integers
        int length = readIntFromUser("What is the length of the room in feet?");
        int width = readIntFromUser("What is the width of the room in feet?");

        double area = app.calcRoomArea(length, width);
        double count = app.calcGallonCount(area);
        DecimalFormat format = new DecimalFormat("#");

        System.out.println("You will need "+format.format(count)+" gallon(s) of paint to cover the "+format.format(area)+" square foot ceiling.");
    }
    private static final Scanner in = new Scanner(System.in);
}