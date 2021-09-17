/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 aidan earnest
 */

package exercise07;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution07 {

    /*
        Print "What is the length of the room in feet?"
        'length' = read int from user
        Print "What is the width of the room in feet?"
        'width' = read int from user
        Print "You entered the dimension 'length' feet by 'width' feet."
        'area' = 'length' * 'width'
        'lengthM'^2 = 'length'^2 *  0.09290304
        'widthM'^2 = 'width'^2 *  0.09290304
        'areaM' = 'lengthM' *  'widthM'
        Print "The area room is 'area' square feet or 'areaM' square meters"
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
    double convertMetric(int x) {
        //convert to metric
        //m^2 = f^2 * 0.09290304
        return Math.sqrt(Math.pow(x, 2) * 0.09290304);
    }


    public static void main(String[] args) {
        Solution07 app = new Solution07();

        int length = readIntFromUser("What is the length of the room in feet?");
        double lengthM =  app.convertMetric(length);
        int width = readIntFromUser("What is the width of the room in feet?");
        double widthM =  app.convertMetric(width);

        System.out.println("You entered the dimension "+length+" feet by "+width+" feet.");

        double area = app.calcRoomArea(length, width);
        double areaM = app.calcRoomArea(lengthM, widthM);
        DecimalFormat format = new DecimalFormat("#.##");

        System.out.println("The area room is "+area+" square feet or "+format.format(areaM)+" square meters.");
    }
    private static final Scanner in = new Scanner(System.in);
}