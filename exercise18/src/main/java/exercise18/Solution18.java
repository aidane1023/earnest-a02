/*
*  UCF COP3330 Fall 2021 Assignment 2 Solution
*  Copyright 2021 aidan earnest
*/

package exercise18;

import java.util.Objects;
import java.util.Scanner;

public class Solution18 {

    /*
        Print "Press C to convert from Fahrenheit to Celsius. Press F to convert from Celsius to Fahrenheit."
        'response' = get string from user
        Print "Your choice 'response'"
        if 'response' = C
            Print "Please enter the temperature in Fahrenheit:"
            'f' = get user double
            'c' = ('f' − 32) × 5 / 9
            Print "The temperature in Celsius is 'c'."
        if 'response' = F
            Print "Please enter the temperature in Celsius:"
            'c' = get user double
            'f' = ('c' × 9 / 5) + 32
            Print "The temperature in Fahrenheit is 'f'."
     */

    private static void userInterface(String response) {
        //initial prompt
        String prompt = "Press C to convert from Fahrenheit to Celsius. \nPress F to convert from Celsius to Fahrenheit.";

        //if else c/f
       if (response.equalsIgnoreCase( "c")) {
            System.out.println("Enter the temperature in Fahrenheit:");
            double f = in.nextDouble();
            double c = (f - 32) * 5 / 9;
            prompt = "The temperature in Celsius is "+c;
       }
        if (response.equalsIgnoreCase( "f")) {
            System.out.println("Enter the temperature in Celsius:");
            double c = in.nextDouble();
            double f = (c * 9 / 5) + 32;
            prompt = "The temperature in Fahrenheit is "+f;
        }
        //single print statement
        System.out.println(prompt);

        //read in user input from initial prompt and cycle back to print response
       if (Objects.equals(response, "")) {
           response = in.nextLine();
           userInterface(response);
       }
    }

    public static void main(String[] args) {
        userInterface("");
    }
    private static final Scanner in = new Scanner(System.in);
}
